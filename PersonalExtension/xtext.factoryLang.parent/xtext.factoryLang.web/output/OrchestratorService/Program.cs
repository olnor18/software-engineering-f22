using System;
using Entities;
using Mqtt;

#region Variables
IMqttService mqtt = new MqttService();

Dictionary<string, Crane> cranes = new();
Dictionary<string, Disk> disks = new();
Dictionary<string, Camera> cameras = new();

bool running = true;
#endregion

#region Main
Setup();
Run().GetAwaiter().GetResult();
#endregion

void Setup()
{
	cranes.Add("crane1", new Crane("crane1", new Dictionary<string, int>()
	{
		{"intake", 10},
		{"container", 62}
	}, mqtt));

	disks.Add("disk1", new Disk("disk1", 3, new Dictionary<string, int>()
	{
		{"craneZone", 1},
		{"intakeZone", 2}
	}, mqtt));

	cameras.Add("camera1", new Camera("camera1", new List<string>()
	{
		"blue"
	}, mqtt));
}

async Task Run()	
{
	var crane1 = cranes["crane1"];
	var disk1 = disks["disk1"];
	var camera1 = cameras["camera1"];

	while (running)
	{
		foreach (var diskSlot in disk1.GetSlotsWithMark(SlotState.Complete))
		{
			await disk1.MoveSlot(diskSlot.Number, "craneZone");
			await crane1.GoTo("intake");
			await crane1.PickupItem();
			if (diskSlot.HasMark("BLUE"))
			{
				await crane1.GoTo("container");
				await crane1.DropItem();
			}
			disk1.MarkSlot("craneZone", SlotState.Empty);
		}
		if (!disk1.IsFull())
		{
			await disk1.MoveSlot(disk1.GetEmptySlotNumber(), "intakeZone");
			disk1.MarkSlot("intakeZone", SlotState.InProgress);
			Task.Run(async () =>
			{
				await Task.Delay(10000);
				disk1.MarkSlot("intakeZone", SlotState.Complete);
			});
		}
	}
}
