package xtext.factoryLang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.factoryLang.services.FactoryLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFactoryLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "GreaterThan", "In_progress", "LessThan", "Scannable", "Undefined", "Complete", "Position", "Variable", "Minutes", "Seconds", "Camera", "Create", "Device", "Minute", "Pickup", "Second", "Color", "Crane", "Empty", "Green", "Hours", "Named", "Slots", "Blue", "Disk", "Drop", "Each", "Free", "Full", "Hour", "Into", "Item", "Mark", "Move", "Scan", "Slot", "That", "Then", "Wait", "With", "Zone", "For", "New", "Not", "Red", "As", "At", "If", "In", "Is", "Of", "To", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Each=30;
    public static final int New=46;
    public static final int RULE_BEGIN=56;
    public static final int Crane=21;
    public static final int Minutes=12;
    public static final int Full=32;
    public static final int Item=35;
    public static final int LessThan=6;
    public static final int GreaterThan=4;
    public static final int In_progress=5;
    public static final int Then=41;
    public static final int Camera=14;
    public static final int To=55;
    public static final int Disk=28;
    public static final int Undefined=8;
    public static final int Into=34;
    public static final int RULE_ID=58;
    public static final int Position=10;
    public static final int Device=16;
    public static final int Hour=33;
    public static final int Color=20;
    public static final int For=45;
    public static final int Free=31;
    public static final int Drop=29;
    public static final int Not=47;
    public static final int RULE_INT=59;
    public static final int RULE_ML_COMMENT=61;
    public static final int Slot=39;
    public static final int Scannable=7;
    public static final int Scan=38;
    public static final int Wait=42;
    public static final int If=51;
    public static final int RULE_END=57;
    public static final int Variable=11;
    public static final int Hours=24;
    public static final int In=52;
    public static final int Complete=9;
    public static final int Mark=36;
    public static final int Is=53;
    public static final int RULE_STRING=60;
    public static final int With=43;
    public static final int RULE_SL_COMMENT=62;
    public static final int Slots=26;
    public static final int Empty=22;
    public static final int As=49;
    public static final int At=50;
    public static final int Minute=17;
    public static final int Move=37;
    public static final int Create=15;
    public static final int EOF=-1;
    public static final int That=40;
    public static final int Named=25;
    public static final int Pickup=18;
    public static final int Blue=27;
    public static final int RULE_WS=63;
    public static final int Zone=44;
    public static final int RULE_ANY_OTHER=64;
    public static final int Red=48;
    public static final int Second=19;
    public static final int Of=54;
    public static final int Seconds=13;
    public static final int Green=23;

    // delegates
    // delegators


        public InternalFactoryLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFactoryLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFactoryLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFactoryLangParser.g"; }



     	private FactoryLangGrammarAccess grammarAccess;

        public InternalFactoryLangParser(TokenStream input, FactoryLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected FactoryLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalFactoryLangParser.g:58:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalFactoryLangParser.g:58:46: (iv_ruleModel= ruleModel EOF )
            // InternalFactoryLangParser.g:59:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalFactoryLangParser.g:65:1: ruleModel returns [EObject current=null] : ( ( (lv_configurations_0_0= ruleConfiguration ) )+ ( (lv_statements_1_0= ruleStatement ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_configurations_0_0 = null;

        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:71:2: ( ( ( (lv_configurations_0_0= ruleConfiguration ) )+ ( (lv_statements_1_0= ruleStatement ) )+ ) )
            // InternalFactoryLangParser.g:72:2: ( ( (lv_configurations_0_0= ruleConfiguration ) )+ ( (lv_statements_1_0= ruleStatement ) )+ )
            {
            // InternalFactoryLangParser.g:72:2: ( ( (lv_configurations_0_0= ruleConfiguration ) )+ ( (lv_statements_1_0= ruleStatement ) )+ )
            // InternalFactoryLangParser.g:73:3: ( (lv_configurations_0_0= ruleConfiguration ) )+ ( (lv_statements_1_0= ruleStatement ) )+
            {
            // InternalFactoryLangParser.g:73:3: ( (lv_configurations_0_0= ruleConfiguration ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Create) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFactoryLangParser.g:74:4: (lv_configurations_0_0= ruleConfiguration )
            	    {
            	    // InternalFactoryLangParser.g:74:4: (lv_configurations_0_0= ruleConfiguration )
            	    // InternalFactoryLangParser.g:75:5: lv_configurations_0_0= ruleConfiguration
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getConfigurationsConfigurationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_configurations_0_0=ruleConfiguration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"configurations",
            	    						lv_configurations_0_0,
            	    						"xtext.factoryLang.FactoryLang.Configuration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalFactoryLangParser.g:92:3: ( (lv_statements_1_0= ruleStatement ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==For||LA2_0==If||LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFactoryLangParser.g:93:4: (lv_statements_1_0= ruleStatement )
            	    {
            	    // InternalFactoryLangParser.g:93:4: (lv_statements_1_0= ruleStatement )
            	    // InternalFactoryLangParser.g:94:5: lv_statements_1_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_1_0,
            	    						"xtext.factoryLang.FactoryLang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleConfiguration"
    // InternalFactoryLangParser.g:115:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalFactoryLangParser.g:115:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalFactoryLangParser.g:116:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalFactoryLangParser.g:122:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= Create ( (lv_device_1_0= ruleDevice ) ) ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_device_1_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:128:2: ( (otherlv_0= Create ( (lv_device_1_0= ruleDevice ) ) ) )
            // InternalFactoryLangParser.g:129:2: (otherlv_0= Create ( (lv_device_1_0= ruleDevice ) ) )
            {
            // InternalFactoryLangParser.g:129:2: (otherlv_0= Create ( (lv_device_1_0= ruleDevice ) ) )
            // InternalFactoryLangParser.g:130:3: otherlv_0= Create ( (lv_device_1_0= ruleDevice ) )
            {
            otherlv_0=(Token)match(input,Create,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getCreateKeyword_0());
            		
            // InternalFactoryLangParser.g:134:3: ( (lv_device_1_0= ruleDevice ) )
            // InternalFactoryLangParser.g:135:4: (lv_device_1_0= ruleDevice )
            {
            // InternalFactoryLangParser.g:135:4: (lv_device_1_0= ruleDevice )
            // InternalFactoryLangParser.g:136:5: lv_device_1_0= ruleDevice
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getDeviceDeviceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_device_1_0=ruleDevice();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					set(
            						current,
            						"device",
            						lv_device_1_0,
            						"xtext.factoryLang.FactoryLang.Device");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleDevice"
    // InternalFactoryLangParser.g:157:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalFactoryLangParser.g:157:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalFactoryLangParser.g:158:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalFactoryLangParser.g:164:1: ruleDevice returns [EObject current=null] : (this_Crane_0= ruleCrane | this_Disk_1= ruleDisk | this_Camera_2= ruleCamera ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        EObject this_Crane_0 = null;

        EObject this_Disk_1 = null;

        EObject this_Camera_2 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:170:2: ( (this_Crane_0= ruleCrane | this_Disk_1= ruleDisk | this_Camera_2= ruleCamera ) )
            // InternalFactoryLangParser.g:171:2: (this_Crane_0= ruleCrane | this_Disk_1= ruleDisk | this_Camera_2= ruleCamera )
            {
            // InternalFactoryLangParser.g:171:2: (this_Crane_0= ruleCrane | this_Disk_1= ruleDisk | this_Camera_2= ruleCamera )
            int alt3=3;
            switch ( input.LA(1) ) {
            case Crane:
                {
                alt3=1;
                }
                break;
            case Disk:
                {
                alt3=2;
                }
                break;
            case Camera:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFactoryLangParser.g:172:3: this_Crane_0= ruleCrane
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getCraneParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Crane_0=ruleCrane();

                    state._fsp--;


                    			current = this_Crane_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFactoryLangParser.g:181:3: this_Disk_1= ruleDisk
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getDiskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Disk_1=ruleDisk();

                    state._fsp--;


                    			current = this_Disk_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFactoryLangParser.g:190:3: this_Camera_2= ruleCamera
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getCameraParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Camera_2=ruleCamera();

                    state._fsp--;


                    			current = this_Camera_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleCrane"
    // InternalFactoryLangParser.g:202:1: entryRuleCrane returns [EObject current=null] : iv_ruleCrane= ruleCrane EOF ;
    public final EObject entryRuleCrane() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrane = null;


        try {
            // InternalFactoryLangParser.g:202:46: (iv_ruleCrane= ruleCrane EOF )
            // InternalFactoryLangParser.g:203:2: iv_ruleCrane= ruleCrane EOF
            {
             newCompositeNode(grammarAccess.getCraneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrane=ruleCrane();

            state._fsp--;

             current =iv_ruleCrane; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCrane"


    // $ANTLR start "ruleCrane"
    // InternalFactoryLangParser.g:209:1: ruleCrane returns [EObject current=null] : ( () otherlv_1= Crane otherlv_2= Named ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCraneParameter ) )+ this_END_6= RULE_END ) ;
    public final EObject ruleCrane() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        EObject lv_targets_5_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:215:2: ( ( () otherlv_1= Crane otherlv_2= Named ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCraneParameter ) )+ this_END_6= RULE_END ) )
            // InternalFactoryLangParser.g:216:2: ( () otherlv_1= Crane otherlv_2= Named ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCraneParameter ) )+ this_END_6= RULE_END )
            {
            // InternalFactoryLangParser.g:216:2: ( () otherlv_1= Crane otherlv_2= Named ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCraneParameter ) )+ this_END_6= RULE_END )
            // InternalFactoryLangParser.g:217:3: () otherlv_1= Crane otherlv_2= Named ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCraneParameter ) )+ this_END_6= RULE_END
            {
            // InternalFactoryLangParser.g:217:3: ()
            // InternalFactoryLangParser.g:218:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCraneAccess().getCraneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Crane,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCraneAccess().getCraneKeyword_1());
            		
            otherlv_2=(Token)match(input,Named,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCraneAccess().getNamedKeyword_2());
            		
            // InternalFactoryLangParser.g:232:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalFactoryLangParser.g:233:4: (lv_name_3_0= RULE_ID )
            {
            // InternalFactoryLangParser.g:233:4: (lv_name_3_0= RULE_ID )
            // InternalFactoryLangParser.g:234:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_3_0, grammarAccess.getCraneAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCraneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_9); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getCraneAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalFactoryLangParser.g:254:3: ( (lv_targets_5_0= ruleCraneParameter ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==With) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFactoryLangParser.g:255:4: (lv_targets_5_0= ruleCraneParameter )
            	    {
            	    // InternalFactoryLangParser.g:255:4: (lv_targets_5_0= ruleCraneParameter )
            	    // InternalFactoryLangParser.g:256:5: lv_targets_5_0= ruleCraneParameter
            	    {

            	    					newCompositeNode(grammarAccess.getCraneAccess().getTargetsCraneParameterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_targets_5_0=ruleCraneParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCraneRule());
            	    					}
            	    					add(
            	    						current,
            	    						"targets",
            	    						lv_targets_5_0,
            	    						"xtext.factoryLang.FactoryLang.CraneParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getCraneAccess().getENDTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCrane"


    // $ANTLR start "entryRuleCraneParameter"
    // InternalFactoryLangParser.g:281:1: entryRuleCraneParameter returns [EObject current=null] : iv_ruleCraneParameter= ruleCraneParameter EOF ;
    public final EObject entryRuleCraneParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCraneParameter = null;


        try {
            // InternalFactoryLangParser.g:281:55: (iv_ruleCraneParameter= ruleCraneParameter EOF )
            // InternalFactoryLangParser.g:282:2: iv_ruleCraneParameter= ruleCraneParameter EOF
            {
             newCompositeNode(grammarAccess.getCraneParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCraneParameter=ruleCraneParameter();

            state._fsp--;

             current =iv_ruleCraneParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCraneParameter"


    // $ANTLR start "ruleCraneParameter"
    // InternalFactoryLangParser.g:288:1: ruleCraneParameter returns [EObject current=null] : this_CranePositionParameter_0= ruleCranePositionParameter ;
    public final EObject ruleCraneParameter() throws RecognitionException {
        EObject current = null;

        EObject this_CranePositionParameter_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:294:2: (this_CranePositionParameter_0= ruleCranePositionParameter )
            // InternalFactoryLangParser.g:295:2: this_CranePositionParameter_0= ruleCranePositionParameter
            {

            		newCompositeNode(grammarAccess.getCraneParameterAccess().getCranePositionParameterParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CranePositionParameter_0=ruleCranePositionParameter();

            state._fsp--;


            		current = this_CranePositionParameter_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCraneParameter"


    // $ANTLR start "entryRuleCranePositionParameter"
    // InternalFactoryLangParser.g:306:1: entryRuleCranePositionParameter returns [EObject current=null] : iv_ruleCranePositionParameter= ruleCranePositionParameter EOF ;
    public final EObject entryRuleCranePositionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCranePositionParameter = null;


        try {
            // InternalFactoryLangParser.g:306:63: (iv_ruleCranePositionParameter= ruleCranePositionParameter EOF )
            // InternalFactoryLangParser.g:307:2: iv_ruleCranePositionParameter= ruleCranePositionParameter EOF
            {
             newCompositeNode(grammarAccess.getCranePositionParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCranePositionParameter=ruleCranePositionParameter();

            state._fsp--;

             current =iv_ruleCranePositionParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCranePositionParameter"


    // $ANTLR start "ruleCranePositionParameter"
    // InternalFactoryLangParser.g:313:1: ruleCranePositionParameter returns [EObject current=null] : ( () otherlv_1= With otherlv_2= Position otherlv_3= At ( (lv_degree_4_0= RULE_INT ) ) otherlv_5= Named ( (lv_name_6_0= RULE_ID ) ) ) ;
    public final EObject ruleCranePositionParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_degree_4_0=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:319:2: ( ( () otherlv_1= With otherlv_2= Position otherlv_3= At ( (lv_degree_4_0= RULE_INT ) ) otherlv_5= Named ( (lv_name_6_0= RULE_ID ) ) ) )
            // InternalFactoryLangParser.g:320:2: ( () otherlv_1= With otherlv_2= Position otherlv_3= At ( (lv_degree_4_0= RULE_INT ) ) otherlv_5= Named ( (lv_name_6_0= RULE_ID ) ) )
            {
            // InternalFactoryLangParser.g:320:2: ( () otherlv_1= With otherlv_2= Position otherlv_3= At ( (lv_degree_4_0= RULE_INT ) ) otherlv_5= Named ( (lv_name_6_0= RULE_ID ) ) )
            // InternalFactoryLangParser.g:321:3: () otherlv_1= With otherlv_2= Position otherlv_3= At ( (lv_degree_4_0= RULE_INT ) ) otherlv_5= Named ( (lv_name_6_0= RULE_ID ) )
            {
            // InternalFactoryLangParser.g:321:3: ()
            // InternalFactoryLangParser.g:322:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCranePositionParameterAccess().getCranePositionParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,With,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCranePositionParameterAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,Position,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCranePositionParameterAccess().getPositionKeyword_2());
            		
            otherlv_3=(Token)match(input,At,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getCranePositionParameterAccess().getAtKeyword_3());
            		
            // InternalFactoryLangParser.g:340:3: ( (lv_degree_4_0= RULE_INT ) )
            // InternalFactoryLangParser.g:341:4: (lv_degree_4_0= RULE_INT )
            {
            // InternalFactoryLangParser.g:341:4: (lv_degree_4_0= RULE_INT )
            // InternalFactoryLangParser.g:342:5: lv_degree_4_0= RULE_INT
            {
            lv_degree_4_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_degree_4_0, grammarAccess.getCranePositionParameterAccess().getDegreeINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCranePositionParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"degree",
            						lv_degree_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,Named,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getCranePositionParameterAccess().getNamedKeyword_5());
            		
            // InternalFactoryLangParser.g:362:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalFactoryLangParser.g:363:4: (lv_name_6_0= RULE_ID )
            {
            // InternalFactoryLangParser.g:363:4: (lv_name_6_0= RULE_ID )
            // InternalFactoryLangParser.g:364:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_6_0, grammarAccess.getCranePositionParameterAccess().getNameIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCranePositionParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCranePositionParameter"


    // $ANTLR start "entryRuleDisk"
    // InternalFactoryLangParser.g:384:1: entryRuleDisk returns [EObject current=null] : iv_ruleDisk= ruleDisk EOF ;
    public final EObject entryRuleDisk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisk = null;


        try {
            // InternalFactoryLangParser.g:384:45: (iv_ruleDisk= ruleDisk EOF )
            // InternalFactoryLangParser.g:385:2: iv_ruleDisk= ruleDisk EOF
            {
             newCompositeNode(grammarAccess.getDiskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisk=ruleDisk();

            state._fsp--;

             current =iv_ruleDisk; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisk"


    // $ANTLR start "ruleDisk"
    // InternalFactoryLangParser.g:391:1: ruleDisk returns [EObject current=null] : ( () otherlv_1= Disk otherlv_2= Named ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_slotParameter_5_0= ruleDiskSlotParameter ) ) ( (lv_targets_6_0= ruleDiskParameter ) )+ this_END_7= RULE_END ) ;
    public final EObject ruleDisk() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_BEGIN_4=null;
        Token this_END_7=null;
        EObject lv_slotParameter_5_0 = null;

        EObject lv_targets_6_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:397:2: ( ( () otherlv_1= Disk otherlv_2= Named ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_slotParameter_5_0= ruleDiskSlotParameter ) ) ( (lv_targets_6_0= ruleDiskParameter ) )+ this_END_7= RULE_END ) )
            // InternalFactoryLangParser.g:398:2: ( () otherlv_1= Disk otherlv_2= Named ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_slotParameter_5_0= ruleDiskSlotParameter ) ) ( (lv_targets_6_0= ruleDiskParameter ) )+ this_END_7= RULE_END )
            {
            // InternalFactoryLangParser.g:398:2: ( () otherlv_1= Disk otherlv_2= Named ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_slotParameter_5_0= ruleDiskSlotParameter ) ) ( (lv_targets_6_0= ruleDiskParameter ) )+ this_END_7= RULE_END )
            // InternalFactoryLangParser.g:399:3: () otherlv_1= Disk otherlv_2= Named ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_slotParameter_5_0= ruleDiskSlotParameter ) ) ( (lv_targets_6_0= ruleDiskParameter ) )+ this_END_7= RULE_END
            {
            // InternalFactoryLangParser.g:399:3: ()
            // InternalFactoryLangParser.g:400:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiskAccess().getDiskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Disk,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDiskAccess().getDiskKeyword_1());
            		
            otherlv_2=(Token)match(input,Named,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDiskAccess().getNamedKeyword_2());
            		
            // InternalFactoryLangParser.g:414:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalFactoryLangParser.g:415:4: (lv_name_3_0= RULE_ID )
            {
            // InternalFactoryLangParser.g:415:4: (lv_name_3_0= RULE_ID )
            // InternalFactoryLangParser.g:416:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_3_0, grammarAccess.getDiskAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_9); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getDiskAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalFactoryLangParser.g:436:3: ( (lv_slotParameter_5_0= ruleDiskSlotParameter ) )
            // InternalFactoryLangParser.g:437:4: (lv_slotParameter_5_0= ruleDiskSlotParameter )
            {
            // InternalFactoryLangParser.g:437:4: (lv_slotParameter_5_0= ruleDiskSlotParameter )
            // InternalFactoryLangParser.g:438:5: lv_slotParameter_5_0= ruleDiskSlotParameter
            {

            					newCompositeNode(grammarAccess.getDiskAccess().getSlotParameterDiskSlotParameterParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_slotParameter_5_0=ruleDiskSlotParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiskRule());
            					}
            					set(
            						current,
            						"slotParameter",
            						lv_slotParameter_5_0,
            						"xtext.factoryLang.FactoryLang.DiskSlotParameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFactoryLangParser.g:455:3: ( (lv_targets_6_0= ruleDiskParameter ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==With) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFactoryLangParser.g:456:4: (lv_targets_6_0= ruleDiskParameter )
            	    {
            	    // InternalFactoryLangParser.g:456:4: (lv_targets_6_0= ruleDiskParameter )
            	    // InternalFactoryLangParser.g:457:5: lv_targets_6_0= ruleDiskParameter
            	    {

            	    					newCompositeNode(grammarAccess.getDiskAccess().getTargetsDiskParameterParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_targets_6_0=ruleDiskParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiskRule());
            	    					}
            	    					add(
            	    						current,
            	    						"targets",
            	    						lv_targets_6_0,
            	    						"xtext.factoryLang.FactoryLang.DiskParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_7, grammarAccess.getDiskAccess().getENDTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisk"


    // $ANTLR start "entryRuleDiskParameter"
    // InternalFactoryLangParser.g:482:1: entryRuleDiskParameter returns [EObject current=null] : iv_ruleDiskParameter= ruleDiskParameter EOF ;
    public final EObject entryRuleDiskParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskParameter = null;


        try {
            // InternalFactoryLangParser.g:482:54: (iv_ruleDiskParameter= ruleDiskParameter EOF )
            // InternalFactoryLangParser.g:483:2: iv_ruleDiskParameter= ruleDiskParameter EOF
            {
             newCompositeNode(grammarAccess.getDiskParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskParameter=ruleDiskParameter();

            state._fsp--;

             current =iv_ruleDiskParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiskParameter"


    // $ANTLR start "ruleDiskParameter"
    // InternalFactoryLangParser.g:489:1: ruleDiskParameter returns [EObject current=null] : this_DiskZoneParameter_0= ruleDiskZoneParameter ;
    public final EObject ruleDiskParameter() throws RecognitionException {
        EObject current = null;

        EObject this_DiskZoneParameter_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:495:2: (this_DiskZoneParameter_0= ruleDiskZoneParameter )
            // InternalFactoryLangParser.g:496:2: this_DiskZoneParameter_0= ruleDiskZoneParameter
            {

            		newCompositeNode(grammarAccess.getDiskParameterAccess().getDiskZoneParameterParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_DiskZoneParameter_0=ruleDiskZoneParameter();

            state._fsp--;


            		current = this_DiskZoneParameter_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiskParameter"


    // $ANTLR start "entryRuleDiskSlotParameter"
    // InternalFactoryLangParser.g:507:1: entryRuleDiskSlotParameter returns [EObject current=null] : iv_ruleDiskSlotParameter= ruleDiskSlotParameter EOF ;
    public final EObject entryRuleDiskSlotParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskSlotParameter = null;


        try {
            // InternalFactoryLangParser.g:507:58: (iv_ruleDiskSlotParameter= ruleDiskSlotParameter EOF )
            // InternalFactoryLangParser.g:508:2: iv_ruleDiskSlotParameter= ruleDiskSlotParameter EOF
            {
             newCompositeNode(grammarAccess.getDiskSlotParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskSlotParameter=ruleDiskSlotParameter();

            state._fsp--;

             current =iv_ruleDiskSlotParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiskSlotParameter"


    // $ANTLR start "ruleDiskSlotParameter"
    // InternalFactoryLangParser.g:514:1: ruleDiskSlotParameter returns [EObject current=null] : ( () otherlv_1= With ( (lv_size_2_0= RULE_INT ) ) otherlv_3= Slots ) ;
    public final EObject ruleDiskSlotParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:520:2: ( ( () otherlv_1= With ( (lv_size_2_0= RULE_INT ) ) otherlv_3= Slots ) )
            // InternalFactoryLangParser.g:521:2: ( () otherlv_1= With ( (lv_size_2_0= RULE_INT ) ) otherlv_3= Slots )
            {
            // InternalFactoryLangParser.g:521:2: ( () otherlv_1= With ( (lv_size_2_0= RULE_INT ) ) otherlv_3= Slots )
            // InternalFactoryLangParser.g:522:3: () otherlv_1= With ( (lv_size_2_0= RULE_INT ) ) otherlv_3= Slots
            {
            // InternalFactoryLangParser.g:522:3: ()
            // InternalFactoryLangParser.g:523:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiskSlotParameterAccess().getDiskSlotParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,With,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDiskSlotParameterAccess().getWithKeyword_1());
            		
            // InternalFactoryLangParser.g:533:3: ( (lv_size_2_0= RULE_INT ) )
            // InternalFactoryLangParser.g:534:4: (lv_size_2_0= RULE_INT )
            {
            // InternalFactoryLangParser.g:534:4: (lv_size_2_0= RULE_INT )
            // InternalFactoryLangParser.g:535:5: lv_size_2_0= RULE_INT
            {
            lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_size_2_0, grammarAccess.getDiskSlotParameterAccess().getSizeINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskSlotParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,Slots,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDiskSlotParameterAccess().getSlotsKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiskSlotParameter"


    // $ANTLR start "entryRuleDiskZoneParameter"
    // InternalFactoryLangParser.g:559:1: entryRuleDiskZoneParameter returns [EObject current=null] : iv_ruleDiskZoneParameter= ruleDiskZoneParameter EOF ;
    public final EObject entryRuleDiskZoneParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskZoneParameter = null;


        try {
            // InternalFactoryLangParser.g:559:58: (iv_ruleDiskZoneParameter= ruleDiskZoneParameter EOF )
            // InternalFactoryLangParser.g:560:2: iv_ruleDiskZoneParameter= ruleDiskZoneParameter EOF
            {
             newCompositeNode(grammarAccess.getDiskZoneParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskZoneParameter=ruleDiskZoneParameter();

            state._fsp--;

             current =iv_ruleDiskZoneParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiskZoneParameter"


    // $ANTLR start "ruleDiskZoneParameter"
    // InternalFactoryLangParser.g:566:1: ruleDiskZoneParameter returns [EObject current=null] : ( () otherlv_1= With otherlv_2= Zone otherlv_3= Named ( (lv_name_4_0= RULE_ID ) ) otherlv_5= At otherlv_6= Slot ( (lv_slot_7_0= RULE_INT ) ) ) ;
    public final EObject ruleDiskZoneParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_slot_7_0=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:572:2: ( ( () otherlv_1= With otherlv_2= Zone otherlv_3= Named ( (lv_name_4_0= RULE_ID ) ) otherlv_5= At otherlv_6= Slot ( (lv_slot_7_0= RULE_INT ) ) ) )
            // InternalFactoryLangParser.g:573:2: ( () otherlv_1= With otherlv_2= Zone otherlv_3= Named ( (lv_name_4_0= RULE_ID ) ) otherlv_5= At otherlv_6= Slot ( (lv_slot_7_0= RULE_INT ) ) )
            {
            // InternalFactoryLangParser.g:573:2: ( () otherlv_1= With otherlv_2= Zone otherlv_3= Named ( (lv_name_4_0= RULE_ID ) ) otherlv_5= At otherlv_6= Slot ( (lv_slot_7_0= RULE_INT ) ) )
            // InternalFactoryLangParser.g:574:3: () otherlv_1= With otherlv_2= Zone otherlv_3= Named ( (lv_name_4_0= RULE_ID ) ) otherlv_5= At otherlv_6= Slot ( (lv_slot_7_0= RULE_INT ) )
            {
            // InternalFactoryLangParser.g:574:3: ()
            // InternalFactoryLangParser.g:575:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiskZoneParameterAccess().getDiskZoneParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,With,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDiskZoneParameterAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,Zone,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDiskZoneParameterAccess().getZoneKeyword_2());
            		
            otherlv_3=(Token)match(input,Named,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDiskZoneParameterAccess().getNamedKeyword_3());
            		
            // InternalFactoryLangParser.g:593:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalFactoryLangParser.g:594:4: (lv_name_4_0= RULE_ID )
            {
            // InternalFactoryLangParser.g:594:4: (lv_name_4_0= RULE_ID )
            // InternalFactoryLangParser.g:595:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_4_0, grammarAccess.getDiskZoneParameterAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskZoneParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,At,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getDiskZoneParameterAccess().getAtKeyword_5());
            		
            otherlv_6=(Token)match(input,Slot,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getDiskZoneParameterAccess().getSlotKeyword_6());
            		
            // InternalFactoryLangParser.g:619:3: ( (lv_slot_7_0= RULE_INT ) )
            // InternalFactoryLangParser.g:620:4: (lv_slot_7_0= RULE_INT )
            {
            // InternalFactoryLangParser.g:620:4: (lv_slot_7_0= RULE_INT )
            // InternalFactoryLangParser.g:621:5: lv_slot_7_0= RULE_INT
            {
            lv_slot_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_slot_7_0, grammarAccess.getDiskZoneParameterAccess().getSlotINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskZoneParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"slot",
            						lv_slot_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiskZoneParameter"


    // $ANTLR start "entryRuleCamera"
    // InternalFactoryLangParser.g:641:1: entryRuleCamera returns [EObject current=null] : iv_ruleCamera= ruleCamera EOF ;
    public final EObject entryRuleCamera() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCamera = null;


        try {
            // InternalFactoryLangParser.g:641:47: (iv_ruleCamera= ruleCamera EOF )
            // InternalFactoryLangParser.g:642:2: iv_ruleCamera= ruleCamera EOF
            {
             newCompositeNode(grammarAccess.getCameraRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCamera=ruleCamera();

            state._fsp--;

             current =iv_ruleCamera; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCamera"


    // $ANTLR start "ruleCamera"
    // InternalFactoryLangParser.g:648:1: ruleCamera returns [EObject current=null] : ( () otherlv_1= Camera otherlv_2= Named ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCameraParameter ) )+ this_END_6= RULE_END ) ;
    public final EObject ruleCamera() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        EObject lv_targets_5_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:654:2: ( ( () otherlv_1= Camera otherlv_2= Named ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCameraParameter ) )+ this_END_6= RULE_END ) )
            // InternalFactoryLangParser.g:655:2: ( () otherlv_1= Camera otherlv_2= Named ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCameraParameter ) )+ this_END_6= RULE_END )
            {
            // InternalFactoryLangParser.g:655:2: ( () otherlv_1= Camera otherlv_2= Named ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCameraParameter ) )+ this_END_6= RULE_END )
            // InternalFactoryLangParser.g:656:3: () otherlv_1= Camera otherlv_2= Named ( (lv_name_3_0= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCameraParameter ) )+ this_END_6= RULE_END
            {
            // InternalFactoryLangParser.g:656:3: ()
            // InternalFactoryLangParser.g:657:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCameraAccess().getCameraAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Camera,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCameraAccess().getCameraKeyword_1());
            		
            otherlv_2=(Token)match(input,Named,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCameraAccess().getNamedKeyword_2());
            		
            // InternalFactoryLangParser.g:671:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalFactoryLangParser.g:672:4: (lv_name_3_0= RULE_ID )
            {
            // InternalFactoryLangParser.g:672:4: (lv_name_3_0= RULE_ID )
            // InternalFactoryLangParser.g:673:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_3_0, grammarAccess.getCameraAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCameraRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_9); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getCameraAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalFactoryLangParser.g:693:3: ( (lv_targets_5_0= ruleCameraParameter ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==With) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFactoryLangParser.g:694:4: (lv_targets_5_0= ruleCameraParameter )
            	    {
            	    // InternalFactoryLangParser.g:694:4: (lv_targets_5_0= ruleCameraParameter )
            	    // InternalFactoryLangParser.g:695:5: lv_targets_5_0= ruleCameraParameter
            	    {

            	    					newCompositeNode(grammarAccess.getCameraAccess().getTargetsCameraParameterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_targets_5_0=ruleCameraParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCameraRule());
            	    					}
            	    					add(
            	    						current,
            	    						"targets",
            	    						lv_targets_5_0,
            	    						"xtext.factoryLang.FactoryLang.CameraParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getCameraAccess().getENDTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCamera"


    // $ANTLR start "entryRuleCameraParameter"
    // InternalFactoryLangParser.g:720:1: entryRuleCameraParameter returns [EObject current=null] : iv_ruleCameraParameter= ruleCameraParameter EOF ;
    public final EObject entryRuleCameraParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCameraParameter = null;


        try {
            // InternalFactoryLangParser.g:720:56: (iv_ruleCameraParameter= ruleCameraParameter EOF )
            // InternalFactoryLangParser.g:721:2: iv_ruleCameraParameter= ruleCameraParameter EOF
            {
             newCompositeNode(grammarAccess.getCameraParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCameraParameter=ruleCameraParameter();

            state._fsp--;

             current =iv_ruleCameraParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCameraParameter"


    // $ANTLR start "ruleCameraParameter"
    // InternalFactoryLangParser.g:727:1: ruleCameraParameter returns [EObject current=null] : this_CameraColorParameter_0= ruleCameraColorParameter ;
    public final EObject ruleCameraParameter() throws RecognitionException {
        EObject current = null;

        EObject this_CameraColorParameter_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:733:2: (this_CameraColorParameter_0= ruleCameraColorParameter )
            // InternalFactoryLangParser.g:734:2: this_CameraColorParameter_0= ruleCameraColorParameter
            {

            		newCompositeNode(grammarAccess.getCameraParameterAccess().getCameraColorParameterParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CameraColorParameter_0=ruleCameraColorParameter();

            state._fsp--;


            		current = this_CameraColorParameter_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCameraParameter"


    // $ANTLR start "entryRuleCameraColorParameter"
    // InternalFactoryLangParser.g:745:1: entryRuleCameraColorParameter returns [EObject current=null] : iv_ruleCameraColorParameter= ruleCameraColorParameter EOF ;
    public final EObject entryRuleCameraColorParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCameraColorParameter = null;


        try {
            // InternalFactoryLangParser.g:745:61: (iv_ruleCameraColorParameter= ruleCameraColorParameter EOF )
            // InternalFactoryLangParser.g:746:2: iv_ruleCameraColorParameter= ruleCameraColorParameter EOF
            {
             newCompositeNode(grammarAccess.getCameraColorParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCameraColorParameter=ruleCameraColorParameter();

            state._fsp--;

             current =iv_ruleCameraColorParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCameraColorParameter"


    // $ANTLR start "ruleCameraColorParameter"
    // InternalFactoryLangParser.g:752:1: ruleCameraColorParameter returns [EObject current=null] : ( () otherlv_1= With otherlv_2= Scannable otherlv_3= Color ( (lv_color_4_0= ruleCOLOR ) ) ) ;
    public final EObject ruleCameraColorParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_color_4_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:758:2: ( ( () otherlv_1= With otherlv_2= Scannable otherlv_3= Color ( (lv_color_4_0= ruleCOLOR ) ) ) )
            // InternalFactoryLangParser.g:759:2: ( () otherlv_1= With otherlv_2= Scannable otherlv_3= Color ( (lv_color_4_0= ruleCOLOR ) ) )
            {
            // InternalFactoryLangParser.g:759:2: ( () otherlv_1= With otherlv_2= Scannable otherlv_3= Color ( (lv_color_4_0= ruleCOLOR ) ) )
            // InternalFactoryLangParser.g:760:3: () otherlv_1= With otherlv_2= Scannable otherlv_3= Color ( (lv_color_4_0= ruleCOLOR ) )
            {
            // InternalFactoryLangParser.g:760:3: ()
            // InternalFactoryLangParser.g:761:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCameraColorParameterAccess().getCameraColorParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,With,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCameraColorParameterAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,Scannable,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getCameraColorParameterAccess().getScannableKeyword_2());
            		
            otherlv_3=(Token)match(input,Color,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getCameraColorParameterAccess().getColorKeyword_3());
            		
            // InternalFactoryLangParser.g:779:3: ( (lv_color_4_0= ruleCOLOR ) )
            // InternalFactoryLangParser.g:780:4: (lv_color_4_0= ruleCOLOR )
            {
            // InternalFactoryLangParser.g:780:4: (lv_color_4_0= ruleCOLOR )
            // InternalFactoryLangParser.g:781:5: lv_color_4_0= ruleCOLOR
            {

            					newCompositeNode(grammarAccess.getCameraColorParameterAccess().getColorCOLOREnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_color_4_0=ruleCOLOR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCameraColorParameterRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_4_0,
            						"xtext.factoryLang.FactoryLang.COLOR");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCameraColorParameter"


    // $ANTLR start "entryRuleStatement"
    // InternalFactoryLangParser.g:802:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalFactoryLangParser.g:802:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalFactoryLangParser.g:803:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalFactoryLangParser.g:809:1: ruleStatement returns [EObject current=null] : (this_Conditional_0= ruleConditional | this_Operation_1= ruleOperation | this_Loop_2= ruleLoop ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Conditional_0 = null;

        EObject this_Operation_1 = null;

        EObject this_Loop_2 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:815:2: ( (this_Conditional_0= ruleConditional | this_Operation_1= ruleOperation | this_Loop_2= ruleLoop ) )
            // InternalFactoryLangParser.g:816:2: (this_Conditional_0= ruleConditional | this_Operation_1= ruleOperation | this_Loop_2= ruleLoop )
            {
            // InternalFactoryLangParser.g:816:2: (this_Conditional_0= ruleConditional | this_Operation_1= ruleOperation | this_Loop_2= ruleLoop )
            int alt7=3;
            switch ( input.LA(1) ) {
            case If:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case For:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalFactoryLangParser.g:817:3: this_Conditional_0= ruleConditional
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getConditionalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Conditional_0=ruleConditional();

                    state._fsp--;


                    			current = this_Conditional_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFactoryLangParser.g:826:3: this_Operation_1= ruleOperation
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operation_1=ruleOperation();

                    state._fsp--;


                    			current = this_Operation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFactoryLangParser.g:835:3: this_Loop_2= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLoopParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_2=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleConditional"
    // InternalFactoryLangParser.g:847:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalFactoryLangParser.g:847:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalFactoryLangParser.g:848:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalFactoryLangParser.g:854:1: ruleConditional returns [EObject current=null] : (this_DeviceConditional_0= ruleDeviceConditional | this_VariableConditional_1= ruleVariableConditional ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        EObject this_DeviceConditional_0 = null;

        EObject this_VariableConditional_1 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:860:2: ( (this_DeviceConditional_0= ruleDeviceConditional | this_VariableConditional_1= ruleVariableConditional ) )
            // InternalFactoryLangParser.g:861:2: (this_DeviceConditional_0= ruleDeviceConditional | this_VariableConditional_1= ruleVariableConditional )
            {
            // InternalFactoryLangParser.g:861:2: (this_DeviceConditional_0= ruleDeviceConditional | this_VariableConditional_1= ruleVariableConditional )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==If) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==Variable) ) {
                    alt8=2;
                }
                else if ( (LA8_1==Device) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFactoryLangParser.g:862:3: this_DeviceConditional_0= ruleDeviceConditional
                    {

                    			newCompositeNode(grammarAccess.getConditionalAccess().getDeviceConditionalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeviceConditional_0=ruleDeviceConditional();

                    state._fsp--;


                    			current = this_DeviceConditional_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFactoryLangParser.g:871:3: this_VariableConditional_1= ruleVariableConditional
                    {

                    			newCompositeNode(grammarAccess.getConditionalAccess().getVariableConditionalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableConditional_1=ruleVariableConditional();

                    state._fsp--;


                    			current = this_VariableConditional_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleDeviceConditional"
    // InternalFactoryLangParser.g:883:1: entryRuleDeviceConditional returns [EObject current=null] : iv_ruleDeviceConditional= ruleDeviceConditional EOF ;
    public final EObject entryRuleDeviceConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceConditional = null;


        try {
            // InternalFactoryLangParser.g:883:58: (iv_ruleDeviceConditional= ruleDeviceConditional EOF )
            // InternalFactoryLangParser.g:884:2: iv_ruleDeviceConditional= ruleDeviceConditional EOF
            {
             newCompositeNode(grammarAccess.getDeviceConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceConditional=ruleDeviceConditional();

            state._fsp--;

             current =iv_ruleDeviceConditional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeviceConditional"


    // $ANTLR start "ruleDeviceConditional"
    // InternalFactoryLangParser.g:890:1: ruleDeviceConditional returns [EObject current=null] : ( () otherlv_1= If otherlv_2= Device ( (otherlv_3= RULE_ID ) ) otherlv_4= Is ( (lv_not_operator_5_0= Not ) )? (otherlv_6= At )? ( (lv_deviceValue_7_0= ruleDeviceValue ) ) otherlv_8= Then this_BEGIN_9= RULE_BEGIN ( (lv_statements_10_0= ruleStatement ) )* this_END_11= RULE_END ) ;
    public final EObject ruleDeviceConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_not_operator_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_BEGIN_9=null;
        Token this_END_11=null;
        EObject lv_deviceValue_7_0 = null;

        EObject lv_statements_10_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:896:2: ( ( () otherlv_1= If otherlv_2= Device ( (otherlv_3= RULE_ID ) ) otherlv_4= Is ( (lv_not_operator_5_0= Not ) )? (otherlv_6= At )? ( (lv_deviceValue_7_0= ruleDeviceValue ) ) otherlv_8= Then this_BEGIN_9= RULE_BEGIN ( (lv_statements_10_0= ruleStatement ) )* this_END_11= RULE_END ) )
            // InternalFactoryLangParser.g:897:2: ( () otherlv_1= If otherlv_2= Device ( (otherlv_3= RULE_ID ) ) otherlv_4= Is ( (lv_not_operator_5_0= Not ) )? (otherlv_6= At )? ( (lv_deviceValue_7_0= ruleDeviceValue ) ) otherlv_8= Then this_BEGIN_9= RULE_BEGIN ( (lv_statements_10_0= ruleStatement ) )* this_END_11= RULE_END )
            {
            // InternalFactoryLangParser.g:897:2: ( () otherlv_1= If otherlv_2= Device ( (otherlv_3= RULE_ID ) ) otherlv_4= Is ( (lv_not_operator_5_0= Not ) )? (otherlv_6= At )? ( (lv_deviceValue_7_0= ruleDeviceValue ) ) otherlv_8= Then this_BEGIN_9= RULE_BEGIN ( (lv_statements_10_0= ruleStatement ) )* this_END_11= RULE_END )
            // InternalFactoryLangParser.g:898:3: () otherlv_1= If otherlv_2= Device ( (otherlv_3= RULE_ID ) ) otherlv_4= Is ( (lv_not_operator_5_0= Not ) )? (otherlv_6= At )? ( (lv_deviceValue_7_0= ruleDeviceValue ) ) otherlv_8= Then this_BEGIN_9= RULE_BEGIN ( (lv_statements_10_0= ruleStatement ) )* this_END_11= RULE_END
            {
            // InternalFactoryLangParser.g:898:3: ()
            // InternalFactoryLangParser.g:899:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeviceConditionalAccess().getDeviceConditionalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,If,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDeviceConditionalAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,Device,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDeviceConditionalAccess().getDeviceKeyword_2());
            		
            // InternalFactoryLangParser.g:913:3: ( (otherlv_3= RULE_ID ) )
            // InternalFactoryLangParser.g:914:4: (otherlv_3= RULE_ID )
            {
            // InternalFactoryLangParser.g:914:4: (otherlv_3= RULE_ID )
            // InternalFactoryLangParser.g:915:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceConditionalRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_3, grammarAccess.getDeviceConditionalAccess().getDeviceDeviceCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,Is,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getDeviceConditionalAccess().getIsKeyword_4());
            		
            // InternalFactoryLangParser.g:930:3: ( (lv_not_operator_5_0= Not ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Not) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFactoryLangParser.g:931:4: (lv_not_operator_5_0= Not )
                    {
                    // InternalFactoryLangParser.g:931:4: (lv_not_operator_5_0= Not )
                    // InternalFactoryLangParser.g:932:5: lv_not_operator_5_0= Not
                    {
                    lv_not_operator_5_0=(Token)match(input,Not,FOLLOW_22); 

                    					newLeafNode(lv_not_operator_5_0, grammarAccess.getDeviceConditionalAccess().getNot_operatorNotKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDeviceConditionalRule());
                    					}
                    					setWithLastConsumed(current, "not_operator", lv_not_operator_5_0, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalFactoryLangParser.g:944:3: (otherlv_6= At )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==At) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFactoryLangParser.g:945:4: otherlv_6= At
                    {
                    otherlv_6=(Token)match(input,At,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getDeviceConditionalAccess().getAtKeyword_6());
                    			

                    }
                    break;

            }

            // InternalFactoryLangParser.g:950:3: ( (lv_deviceValue_7_0= ruleDeviceValue ) )
            // InternalFactoryLangParser.g:951:4: (lv_deviceValue_7_0= ruleDeviceValue )
            {
            // InternalFactoryLangParser.g:951:4: (lv_deviceValue_7_0= ruleDeviceValue )
            // InternalFactoryLangParser.g:952:5: lv_deviceValue_7_0= ruleDeviceValue
            {

            					newCompositeNode(grammarAccess.getDeviceConditionalAccess().getDeviceValueDeviceValueParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_23);
            lv_deviceValue_7_0=ruleDeviceValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceConditionalRule());
            					}
            					set(
            						current,
            						"deviceValue",
            						lv_deviceValue_7_0,
            						"xtext.factoryLang.FactoryLang.DeviceValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,Then,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getDeviceConditionalAccess().getThenKeyword_8());
            		
            this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_24); 

            			newLeafNode(this_BEGIN_9, grammarAccess.getDeviceConditionalAccess().getBEGINTerminalRuleCall_9());
            		
            // InternalFactoryLangParser.g:977:3: ( (lv_statements_10_0= ruleStatement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==For||LA11_0==If||LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFactoryLangParser.g:978:4: (lv_statements_10_0= ruleStatement )
            	    {
            	    // InternalFactoryLangParser.g:978:4: (lv_statements_10_0= ruleStatement )
            	    // InternalFactoryLangParser.g:979:5: lv_statements_10_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getDeviceConditionalAccess().getStatementsStatementParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_statements_10_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeviceConditionalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_10_0,
            	    						"xtext.factoryLang.FactoryLang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            this_END_11=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_11, grammarAccess.getDeviceConditionalAccess().getENDTerminalRuleCall_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceConditional"


    // $ANTLR start "entryRuleVariableConditional"
    // InternalFactoryLangParser.g:1004:1: entryRuleVariableConditional returns [EObject current=null] : iv_ruleVariableConditional= ruleVariableConditional EOF ;
    public final EObject entryRuleVariableConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableConditional = null;


        try {
            // InternalFactoryLangParser.g:1004:60: (iv_ruleVariableConditional= ruleVariableConditional EOF )
            // InternalFactoryLangParser.g:1005:2: iv_ruleVariableConditional= ruleVariableConditional EOF
            {
             newCompositeNode(grammarAccess.getVariableConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableConditional=ruleVariableConditional();

            state._fsp--;

             current =iv_ruleVariableConditional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableConditional"


    // $ANTLR start "ruleVariableConditional"
    // InternalFactoryLangParser.g:1011:1: ruleVariableConditional returns [EObject current=null] : ( () otherlv_1= If otherlv_2= Variable ( (otherlv_3= RULE_ID ) ) otherlv_4= Is ( (lv_comparison_operator_5_0= ruleCOMPARISON_OPERATOR ) )? ( (lv_variableValue_6_0= ruleVariableValue ) ) otherlv_7= Then this_BEGIN_8= RULE_BEGIN ( (lv_statements_9_0= ruleStatement ) )* this_END_10= RULE_END ) ;
    public final EObject ruleVariableConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token this_BEGIN_8=null;
        Token this_END_10=null;
        Enumerator lv_comparison_operator_5_0 = null;

        EObject lv_variableValue_6_0 = null;

        EObject lv_statements_9_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:1017:2: ( ( () otherlv_1= If otherlv_2= Variable ( (otherlv_3= RULE_ID ) ) otherlv_4= Is ( (lv_comparison_operator_5_0= ruleCOMPARISON_OPERATOR ) )? ( (lv_variableValue_6_0= ruleVariableValue ) ) otherlv_7= Then this_BEGIN_8= RULE_BEGIN ( (lv_statements_9_0= ruleStatement ) )* this_END_10= RULE_END ) )
            // InternalFactoryLangParser.g:1018:2: ( () otherlv_1= If otherlv_2= Variable ( (otherlv_3= RULE_ID ) ) otherlv_4= Is ( (lv_comparison_operator_5_0= ruleCOMPARISON_OPERATOR ) )? ( (lv_variableValue_6_0= ruleVariableValue ) ) otherlv_7= Then this_BEGIN_8= RULE_BEGIN ( (lv_statements_9_0= ruleStatement ) )* this_END_10= RULE_END )
            {
            // InternalFactoryLangParser.g:1018:2: ( () otherlv_1= If otherlv_2= Variable ( (otherlv_3= RULE_ID ) ) otherlv_4= Is ( (lv_comparison_operator_5_0= ruleCOMPARISON_OPERATOR ) )? ( (lv_variableValue_6_0= ruleVariableValue ) ) otherlv_7= Then this_BEGIN_8= RULE_BEGIN ( (lv_statements_9_0= ruleStatement ) )* this_END_10= RULE_END )
            // InternalFactoryLangParser.g:1019:3: () otherlv_1= If otherlv_2= Variable ( (otherlv_3= RULE_ID ) ) otherlv_4= Is ( (lv_comparison_operator_5_0= ruleCOMPARISON_OPERATOR ) )? ( (lv_variableValue_6_0= ruleVariableValue ) ) otherlv_7= Then this_BEGIN_8= RULE_BEGIN ( (lv_statements_9_0= ruleStatement ) )* this_END_10= RULE_END
            {
            // InternalFactoryLangParser.g:1019:3: ()
            // InternalFactoryLangParser.g:1020:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableConditionalAccess().getVariableConditionalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,If,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableConditionalAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,Variable,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableConditionalAccess().getVariableKeyword_2());
            		
            // InternalFactoryLangParser.g:1034:3: ( (otherlv_3= RULE_ID ) )
            // InternalFactoryLangParser.g:1035:4: (otherlv_3= RULE_ID )
            {
            // InternalFactoryLangParser.g:1035:4: (otherlv_3= RULE_ID )
            // InternalFactoryLangParser.g:1036:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableConditionalRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_3, grammarAccess.getVariableConditionalAccess().getVariableVariableCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,Is,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableConditionalAccess().getIsKeyword_4());
            		
            // InternalFactoryLangParser.g:1051:3: ( (lv_comparison_operator_5_0= ruleCOMPARISON_OPERATOR ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==GreaterThan||LA12_0==LessThan||LA12_0==Undefined||LA12_0==Not) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFactoryLangParser.g:1052:4: (lv_comparison_operator_5_0= ruleCOMPARISON_OPERATOR )
                    {
                    // InternalFactoryLangParser.g:1052:4: (lv_comparison_operator_5_0= ruleCOMPARISON_OPERATOR )
                    // InternalFactoryLangParser.g:1053:5: lv_comparison_operator_5_0= ruleCOMPARISON_OPERATOR
                    {

                    					newCompositeNode(grammarAccess.getVariableConditionalAccess().getComparison_operatorCOMPARISON_OPERATOREnumRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_comparison_operator_5_0=ruleCOMPARISON_OPERATOR();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableConditionalRule());
                    					}
                    					set(
                    						current,
                    						"comparison_operator",
                    						lv_comparison_operator_5_0,
                    						"xtext.factoryLang.FactoryLang.COMPARISON_OPERATOR");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFactoryLangParser.g:1070:3: ( (lv_variableValue_6_0= ruleVariableValue ) )
            // InternalFactoryLangParser.g:1071:4: (lv_variableValue_6_0= ruleVariableValue )
            {
            // InternalFactoryLangParser.g:1071:4: (lv_variableValue_6_0= ruleVariableValue )
            // InternalFactoryLangParser.g:1072:5: lv_variableValue_6_0= ruleVariableValue
            {

            					newCompositeNode(grammarAccess.getVariableConditionalAccess().getVariableValueVariableValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_23);
            lv_variableValue_6_0=ruleVariableValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableConditionalRule());
            					}
            					set(
            						current,
            						"variableValue",
            						lv_variableValue_6_0,
            						"xtext.factoryLang.FactoryLang.VariableValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,Then,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableConditionalAccess().getThenKeyword_7());
            		
            this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_24); 

            			newLeafNode(this_BEGIN_8, grammarAccess.getVariableConditionalAccess().getBEGINTerminalRuleCall_8());
            		
            // InternalFactoryLangParser.g:1097:3: ( (lv_statements_9_0= ruleStatement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==For||LA13_0==If||LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFactoryLangParser.g:1098:4: (lv_statements_9_0= ruleStatement )
            	    {
            	    // InternalFactoryLangParser.g:1098:4: (lv_statements_9_0= ruleStatement )
            	    // InternalFactoryLangParser.g:1099:5: lv_statements_9_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getVariableConditionalAccess().getStatementsStatementParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_statements_9_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVariableConditionalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_9_0,
            	    						"xtext.factoryLang.FactoryLang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_10, grammarAccess.getVariableConditionalAccess().getENDTerminalRuleCall_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableConditional"


    // $ANTLR start "entryRuleOperation"
    // InternalFactoryLangParser.g:1124:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalFactoryLangParser.g:1124:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalFactoryLangParser.g:1125:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalFactoryLangParser.g:1131:1: ruleOperation returns [EObject current=null] : (this_CraneOperation_0= ruleCraneOperation | this_DiskOperation_1= ruleDiskOperation | this_CameraOperation_2= ruleCameraOperation ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_CraneOperation_0 = null;

        EObject this_DiskOperation_1 = null;

        EObject this_CameraOperation_2 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:1137:2: ( (this_CraneOperation_0= ruleCraneOperation | this_DiskOperation_1= ruleDiskOperation | this_CameraOperation_2= ruleCameraOperation ) )
            // InternalFactoryLangParser.g:1138:2: (this_CraneOperation_0= ruleCraneOperation | this_DiskOperation_1= ruleDiskOperation | this_CameraOperation_2= ruleCameraOperation )
            {
            // InternalFactoryLangParser.g:1138:2: (this_CraneOperation_0= ruleCraneOperation | this_DiskOperation_1= ruleDiskOperation | this_CameraOperation_2= ruleCameraOperation )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case Mark:
                case Move:
                case Wait:
                    {
                    alt14=2;
                    }
                    break;
                case Pickup:
                case Drop:
                    {
                    alt14=1;
                    }
                    break;
                case Scan:
                    {
                    alt14=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalFactoryLangParser.g:1139:3: this_CraneOperation_0= ruleCraneOperation
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getCraneOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CraneOperation_0=ruleCraneOperation();

                    state._fsp--;


                    			current = this_CraneOperation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFactoryLangParser.g:1148:3: this_DiskOperation_1= ruleDiskOperation
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getDiskOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiskOperation_1=ruleDiskOperation();

                    state._fsp--;


                    			current = this_DiskOperation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFactoryLangParser.g:1157:3: this_CameraOperation_2= ruleCameraOperation
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getCameraOperationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CameraOperation_2=ruleCameraOperation();

                    state._fsp--;


                    			current = this_CameraOperation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleCraneOperation"
    // InternalFactoryLangParser.g:1169:1: entryRuleCraneOperation returns [EObject current=null] : iv_ruleCraneOperation= ruleCraneOperation EOF ;
    public final EObject entryRuleCraneOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCraneOperation = null;


        try {
            // InternalFactoryLangParser.g:1169:55: (iv_ruleCraneOperation= ruleCraneOperation EOF )
            // InternalFactoryLangParser.g:1170:2: iv_ruleCraneOperation= ruleCraneOperation EOF
            {
             newCompositeNode(grammarAccess.getCraneOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCraneOperation=ruleCraneOperation();

            state._fsp--;

             current =iv_ruleCraneOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCraneOperation"


    // $ANTLR start "ruleCraneOperation"
    // InternalFactoryLangParser.g:1176:1: ruleCraneOperation returns [EObject current=null] : (this_CranePickupOperation_0= ruleCranePickupOperation | this_CraneDropOperation_1= ruleCraneDropOperation ) ;
    public final EObject ruleCraneOperation() throws RecognitionException {
        EObject current = null;

        EObject this_CranePickupOperation_0 = null;

        EObject this_CraneDropOperation_1 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:1182:2: ( (this_CranePickupOperation_0= ruleCranePickupOperation | this_CraneDropOperation_1= ruleCraneDropOperation ) )
            // InternalFactoryLangParser.g:1183:2: (this_CranePickupOperation_0= ruleCranePickupOperation | this_CraneDropOperation_1= ruleCraneDropOperation )
            {
            // InternalFactoryLangParser.g:1183:2: (this_CranePickupOperation_0= ruleCranePickupOperation | this_CraneDropOperation_1= ruleCraneDropOperation )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==Pickup) ) {
                    alt15=1;
                }
                else if ( (LA15_1==Drop) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalFactoryLangParser.g:1184:3: this_CranePickupOperation_0= ruleCranePickupOperation
                    {

                    			newCompositeNode(grammarAccess.getCraneOperationAccess().getCranePickupOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CranePickupOperation_0=ruleCranePickupOperation();

                    state._fsp--;


                    			current = this_CranePickupOperation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFactoryLangParser.g:1193:3: this_CraneDropOperation_1= ruleCraneDropOperation
                    {

                    			newCompositeNode(grammarAccess.getCraneOperationAccess().getCraneDropOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CraneDropOperation_1=ruleCraneDropOperation();

                    state._fsp--;


                    			current = this_CraneDropOperation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCraneOperation"


    // $ANTLR start "entryRuleCranePickupOperation"
    // InternalFactoryLangParser.g:1205:1: entryRuleCranePickupOperation returns [EObject current=null] : iv_ruleCranePickupOperation= ruleCranePickupOperation EOF ;
    public final EObject entryRuleCranePickupOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCranePickupOperation = null;


        try {
            // InternalFactoryLangParser.g:1205:61: (iv_ruleCranePickupOperation= ruleCranePickupOperation EOF )
            // InternalFactoryLangParser.g:1206:2: iv_ruleCranePickupOperation= ruleCranePickupOperation EOF
            {
             newCompositeNode(grammarAccess.getCranePickupOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCranePickupOperation=ruleCranePickupOperation();

            state._fsp--;

             current =iv_ruleCranePickupOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCranePickupOperation"


    // $ANTLR start "ruleCranePickupOperation"
    // InternalFactoryLangParser.g:1212:1: ruleCranePickupOperation returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Pickup otherlv_3= Item otherlv_4= At ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleCranePickupOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:1218:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Pickup otherlv_3= Item otherlv_4= At ( (otherlv_5= RULE_ID ) ) ) )
            // InternalFactoryLangParser.g:1219:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Pickup otherlv_3= Item otherlv_4= At ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalFactoryLangParser.g:1219:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Pickup otherlv_3= Item otherlv_4= At ( (otherlv_5= RULE_ID ) ) )
            // InternalFactoryLangParser.g:1220:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Pickup otherlv_3= Item otherlv_4= At ( (otherlv_5= RULE_ID ) )
            {
            // InternalFactoryLangParser.g:1220:3: ()
            // InternalFactoryLangParser.g:1221:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCranePickupOperationAccess().getCranePickupOperationAction_0(),
            					current);
            			

            }

            // InternalFactoryLangParser.g:1227:3: ( (otherlv_1= RULE_ID ) )
            // InternalFactoryLangParser.g:1228:4: (otherlv_1= RULE_ID )
            {
            // InternalFactoryLangParser.g:1228:4: (otherlv_1= RULE_ID )
            // InternalFactoryLangParser.g:1229:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCranePickupOperationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getCranePickupOperationAccess().getDeviceCraneCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,Pickup,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getCranePickupOperationAccess().getPickupKeyword_2());
            		
            otherlv_3=(Token)match(input,Item,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getCranePickupOperationAccess().getItemKeyword_3());
            		
            otherlv_4=(Token)match(input,At,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCranePickupOperationAccess().getAtKeyword_4());
            		
            // InternalFactoryLangParser.g:1252:3: ( (otherlv_5= RULE_ID ) )
            // InternalFactoryLangParser.g:1253:4: (otherlv_5= RULE_ID )
            {
            // InternalFactoryLangParser.g:1253:4: (otherlv_5= RULE_ID )
            // InternalFactoryLangParser.g:1254:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCranePickupOperationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getCranePickupOperationAccess().getTargetCraneParameterCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCranePickupOperation"


    // $ANTLR start "entryRuleCraneDropOperation"
    // InternalFactoryLangParser.g:1269:1: entryRuleCraneDropOperation returns [EObject current=null] : iv_ruleCraneDropOperation= ruleCraneDropOperation EOF ;
    public final EObject entryRuleCraneDropOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCraneDropOperation = null;


        try {
            // InternalFactoryLangParser.g:1269:59: (iv_ruleCraneDropOperation= ruleCraneDropOperation EOF )
            // InternalFactoryLangParser.g:1270:2: iv_ruleCraneDropOperation= ruleCraneDropOperation EOF
            {
             newCompositeNode(grammarAccess.getCraneDropOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCraneDropOperation=ruleCraneDropOperation();

            state._fsp--;

             current =iv_ruleCraneDropOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCraneDropOperation"


    // $ANTLR start "ruleCraneDropOperation"
    // InternalFactoryLangParser.g:1276:1: ruleCraneDropOperation returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Drop otherlv_3= Item otherlv_4= At ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleCraneDropOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:1282:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Drop otherlv_3= Item otherlv_4= At ( (otherlv_5= RULE_ID ) ) ) )
            // InternalFactoryLangParser.g:1283:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Drop otherlv_3= Item otherlv_4= At ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalFactoryLangParser.g:1283:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Drop otherlv_3= Item otherlv_4= At ( (otherlv_5= RULE_ID ) ) )
            // InternalFactoryLangParser.g:1284:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Drop otherlv_3= Item otherlv_4= At ( (otherlv_5= RULE_ID ) )
            {
            // InternalFactoryLangParser.g:1284:3: ()
            // InternalFactoryLangParser.g:1285:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCraneDropOperationAccess().getCraneDropOperationAction_0(),
            					current);
            			

            }

            // InternalFactoryLangParser.g:1291:3: ( (otherlv_1= RULE_ID ) )
            // InternalFactoryLangParser.g:1292:4: (otherlv_1= RULE_ID )
            {
            // InternalFactoryLangParser.g:1292:4: (otherlv_1= RULE_ID )
            // InternalFactoryLangParser.g:1293:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCraneDropOperationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_1, grammarAccess.getCraneDropOperationAccess().getDeviceCraneCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,Drop,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getCraneDropOperationAccess().getDropKeyword_2());
            		
            otherlv_3=(Token)match(input,Item,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getCraneDropOperationAccess().getItemKeyword_3());
            		
            otherlv_4=(Token)match(input,At,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCraneDropOperationAccess().getAtKeyword_4());
            		
            // InternalFactoryLangParser.g:1316:3: ( (otherlv_5= RULE_ID ) )
            // InternalFactoryLangParser.g:1317:4: (otherlv_5= RULE_ID )
            {
            // InternalFactoryLangParser.g:1317:4: (otherlv_5= RULE_ID )
            // InternalFactoryLangParser.g:1318:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCraneDropOperationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getCraneDropOperationAccess().getTargetCraneParameterCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCraneDropOperation"


    // $ANTLR start "entryRuleDiskOperation"
    // InternalFactoryLangParser.g:1333:1: entryRuleDiskOperation returns [EObject current=null] : iv_ruleDiskOperation= ruleDiskOperation EOF ;
    public final EObject entryRuleDiskOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskOperation = null;


        try {
            // InternalFactoryLangParser.g:1333:54: (iv_ruleDiskOperation= ruleDiskOperation EOF )
            // InternalFactoryLangParser.g:1334:2: iv_ruleDiskOperation= ruleDiskOperation EOF
            {
             newCompositeNode(grammarAccess.getDiskOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskOperation=ruleDiskOperation();

            state._fsp--;

             current =iv_ruleDiskOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiskOperation"


    // $ANTLR start "ruleDiskOperation"
    // InternalFactoryLangParser.g:1340:1: ruleDiskOperation returns [EObject current=null] : (this_DiskMoveEmptySlotOperation_0= ruleDiskMoveEmptySlotOperation | this_DiskMoveVariableSlotOperation_1= ruleDiskMoveVariableSlotOperation | this_DiskMoveSlotOperation_2= ruleDiskMoveSlotOperation | this_DiskMarkSlotOperation_3= ruleDiskMarkSlotOperation | this_DiskWaitOperation_4= ruleDiskWaitOperation ) ;
    public final EObject ruleDiskOperation() throws RecognitionException {
        EObject current = null;

        EObject this_DiskMoveEmptySlotOperation_0 = null;

        EObject this_DiskMoveVariableSlotOperation_1 = null;

        EObject this_DiskMoveSlotOperation_2 = null;

        EObject this_DiskMarkSlotOperation_3 = null;

        EObject this_DiskWaitOperation_4 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:1346:2: ( (this_DiskMoveEmptySlotOperation_0= ruleDiskMoveEmptySlotOperation | this_DiskMoveVariableSlotOperation_1= ruleDiskMoveVariableSlotOperation | this_DiskMoveSlotOperation_2= ruleDiskMoveSlotOperation | this_DiskMarkSlotOperation_3= ruleDiskMarkSlotOperation | this_DiskWaitOperation_4= ruleDiskWaitOperation ) )
            // InternalFactoryLangParser.g:1347:2: (this_DiskMoveEmptySlotOperation_0= ruleDiskMoveEmptySlotOperation | this_DiskMoveVariableSlotOperation_1= ruleDiskMoveVariableSlotOperation | this_DiskMoveSlotOperation_2= ruleDiskMoveSlotOperation | this_DiskMarkSlotOperation_3= ruleDiskMarkSlotOperation | this_DiskWaitOperation_4= ruleDiskWaitOperation )
            {
            // InternalFactoryLangParser.g:1347:2: (this_DiskMoveEmptySlotOperation_0= ruleDiskMoveEmptySlotOperation | this_DiskMoveVariableSlotOperation_1= ruleDiskMoveVariableSlotOperation | this_DiskMoveSlotOperation_2= ruleDiskMoveSlotOperation | this_DiskMarkSlotOperation_3= ruleDiskMarkSlotOperation | this_DiskWaitOperation_4= ruleDiskWaitOperation )
            int alt16=5;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case Wait:
                    {
                    alt16=5;
                    }
                    break;
                case Move:
                    {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3==Empty) ) {
                        alt16=1;
                    }
                    else if ( (LA16_3==Slot) ) {
                        int LA16_6 = input.LA(4);

                        if ( (LA16_6==Of) ) {
                            alt16=2;
                        }
                        else if ( (LA16_6==At) ) {
                            alt16=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case Mark:
                    {
                    alt16=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalFactoryLangParser.g:1348:3: this_DiskMoveEmptySlotOperation_0= ruleDiskMoveEmptySlotOperation
                    {

                    			newCompositeNode(grammarAccess.getDiskOperationAccess().getDiskMoveEmptySlotOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiskMoveEmptySlotOperation_0=ruleDiskMoveEmptySlotOperation();

                    state._fsp--;


                    			current = this_DiskMoveEmptySlotOperation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFactoryLangParser.g:1357:3: this_DiskMoveVariableSlotOperation_1= ruleDiskMoveVariableSlotOperation
                    {

                    			newCompositeNode(grammarAccess.getDiskOperationAccess().getDiskMoveVariableSlotOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiskMoveVariableSlotOperation_1=ruleDiskMoveVariableSlotOperation();

                    state._fsp--;


                    			current = this_DiskMoveVariableSlotOperation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFactoryLangParser.g:1366:3: this_DiskMoveSlotOperation_2= ruleDiskMoveSlotOperation
                    {

                    			newCompositeNode(grammarAccess.getDiskOperationAccess().getDiskMoveSlotOperationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiskMoveSlotOperation_2=ruleDiskMoveSlotOperation();

                    state._fsp--;


                    			current = this_DiskMoveSlotOperation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFactoryLangParser.g:1375:3: this_DiskMarkSlotOperation_3= ruleDiskMarkSlotOperation
                    {

                    			newCompositeNode(grammarAccess.getDiskOperationAccess().getDiskMarkSlotOperationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiskMarkSlotOperation_3=ruleDiskMarkSlotOperation();

                    state._fsp--;


                    			current = this_DiskMarkSlotOperation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFactoryLangParser.g:1384:3: this_DiskWaitOperation_4= ruleDiskWaitOperation
                    {

                    			newCompositeNode(grammarAccess.getDiskOperationAccess().getDiskWaitOperationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiskWaitOperation_4=ruleDiskWaitOperation();

                    state._fsp--;


                    			current = this_DiskWaitOperation_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiskOperation"


    // $ANTLR start "entryRuleDiskMoveSlotOperation"
    // InternalFactoryLangParser.g:1396:1: entryRuleDiskMoveSlotOperation returns [EObject current=null] : iv_ruleDiskMoveSlotOperation= ruleDiskMoveSlotOperation EOF ;
    public final EObject entryRuleDiskMoveSlotOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskMoveSlotOperation = null;


        try {
            // InternalFactoryLangParser.g:1396:62: (iv_ruleDiskMoveSlotOperation= ruleDiskMoveSlotOperation EOF )
            // InternalFactoryLangParser.g:1397:2: iv_ruleDiskMoveSlotOperation= ruleDiskMoveSlotOperation EOF
            {
             newCompositeNode(grammarAccess.getDiskMoveSlotOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskMoveSlotOperation=ruleDiskMoveSlotOperation();

            state._fsp--;

             current =iv_ruleDiskMoveSlotOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiskMoveSlotOperation"


    // $ANTLR start "ruleDiskMoveSlotOperation"
    // InternalFactoryLangParser.g:1403:1: ruleDiskMoveSlotOperation returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Move otherlv_3= Slot otherlv_4= At ( (otherlv_5= RULE_ID ) ) otherlv_6= To ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleDiskMoveSlotOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:1409:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Move otherlv_3= Slot otherlv_4= At ( (otherlv_5= RULE_ID ) ) otherlv_6= To ( (otherlv_7= RULE_ID ) ) ) )
            // InternalFactoryLangParser.g:1410:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Move otherlv_3= Slot otherlv_4= At ( (otherlv_5= RULE_ID ) ) otherlv_6= To ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalFactoryLangParser.g:1410:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Move otherlv_3= Slot otherlv_4= At ( (otherlv_5= RULE_ID ) ) otherlv_6= To ( (otherlv_7= RULE_ID ) ) )
            // InternalFactoryLangParser.g:1411:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Move otherlv_3= Slot otherlv_4= At ( (otherlv_5= RULE_ID ) ) otherlv_6= To ( (otherlv_7= RULE_ID ) )
            {
            // InternalFactoryLangParser.g:1411:3: ()
            // InternalFactoryLangParser.g:1412:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiskMoveSlotOperationAccess().getDiskMoveSlotOperationAction_0(),
            					current);
            			

            }

            // InternalFactoryLangParser.g:1418:3: ( (otherlv_1= RULE_ID ) )
            // InternalFactoryLangParser.g:1419:4: (otherlv_1= RULE_ID )
            {
            // InternalFactoryLangParser.g:1419:4: (otherlv_1= RULE_ID )
            // InternalFactoryLangParser.g:1420:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskMoveSlotOperationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getDiskMoveSlotOperationAccess().getDeviceDiskCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,Move,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getDiskMoveSlotOperationAccess().getMoveKeyword_2());
            		
            otherlv_3=(Token)match(input,Slot,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getDiskMoveSlotOperationAccess().getSlotKeyword_3());
            		
            otherlv_4=(Token)match(input,At,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getDiskMoveSlotOperationAccess().getAtKeyword_4());
            		
            // InternalFactoryLangParser.g:1443:3: ( (otherlv_5= RULE_ID ) )
            // InternalFactoryLangParser.g:1444:4: (otherlv_5= RULE_ID )
            {
            // InternalFactoryLangParser.g:1444:4: (otherlv_5= RULE_ID )
            // InternalFactoryLangParser.g:1445:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskMoveSlotOperationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_5, grammarAccess.getDiskMoveSlotOperationAccess().getSourceDiskZoneParameterCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,To,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDiskMoveSlotOperationAccess().getToKeyword_6());
            		
            // InternalFactoryLangParser.g:1460:3: ( (otherlv_7= RULE_ID ) )
            // InternalFactoryLangParser.g:1461:4: (otherlv_7= RULE_ID )
            {
            // InternalFactoryLangParser.g:1461:4: (otherlv_7= RULE_ID )
            // InternalFactoryLangParser.g:1462:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskMoveSlotOperationRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getDiskMoveSlotOperationAccess().getTargetDiskZoneParameterCrossReference_7_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiskMoveSlotOperation"


    // $ANTLR start "entryRuleDiskMoveVariableSlotOperation"
    // InternalFactoryLangParser.g:1477:1: entryRuleDiskMoveVariableSlotOperation returns [EObject current=null] : iv_ruleDiskMoveVariableSlotOperation= ruleDiskMoveVariableSlotOperation EOF ;
    public final EObject entryRuleDiskMoveVariableSlotOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskMoveVariableSlotOperation = null;


        try {
            // InternalFactoryLangParser.g:1477:70: (iv_ruleDiskMoveVariableSlotOperation= ruleDiskMoveVariableSlotOperation EOF )
            // InternalFactoryLangParser.g:1478:2: iv_ruleDiskMoveVariableSlotOperation= ruleDiskMoveVariableSlotOperation EOF
            {
             newCompositeNode(grammarAccess.getDiskMoveVariableSlotOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskMoveVariableSlotOperation=ruleDiskMoveVariableSlotOperation();

            state._fsp--;

             current =iv_ruleDiskMoveVariableSlotOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiskMoveVariableSlotOperation"


    // $ANTLR start "ruleDiskMoveVariableSlotOperation"
    // InternalFactoryLangParser.g:1484:1: ruleDiskMoveVariableSlotOperation returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Move otherlv_3= Slot otherlv_4= Of ( (otherlv_5= RULE_ID ) ) otherlv_6= To ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleDiskMoveVariableSlotOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:1490:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Move otherlv_3= Slot otherlv_4= Of ( (otherlv_5= RULE_ID ) ) otherlv_6= To ( (otherlv_7= RULE_ID ) ) ) )
            // InternalFactoryLangParser.g:1491:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Move otherlv_3= Slot otherlv_4= Of ( (otherlv_5= RULE_ID ) ) otherlv_6= To ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalFactoryLangParser.g:1491:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Move otherlv_3= Slot otherlv_4= Of ( (otherlv_5= RULE_ID ) ) otherlv_6= To ( (otherlv_7= RULE_ID ) ) )
            // InternalFactoryLangParser.g:1492:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Move otherlv_3= Slot otherlv_4= Of ( (otherlv_5= RULE_ID ) ) otherlv_6= To ( (otherlv_7= RULE_ID ) )
            {
            // InternalFactoryLangParser.g:1492:3: ()
            // InternalFactoryLangParser.g:1493:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiskMoveVariableSlotOperationAccess().getDiskMoveVariableSlotOperationAction_0(),
            					current);
            			

            }

            // InternalFactoryLangParser.g:1499:3: ( (otherlv_1= RULE_ID ) )
            // InternalFactoryLangParser.g:1500:4: (otherlv_1= RULE_ID )
            {
            // InternalFactoryLangParser.g:1500:4: (otherlv_1= RULE_ID )
            // InternalFactoryLangParser.g:1501:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskMoveVariableSlotOperationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getDiskMoveVariableSlotOperationAccess().getDeviceDiskCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,Move,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getDiskMoveVariableSlotOperationAccess().getMoveKeyword_2());
            		
            otherlv_3=(Token)match(input,Slot,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getDiskMoveVariableSlotOperationAccess().getSlotKeyword_3());
            		
            otherlv_4=(Token)match(input,Of,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getDiskMoveVariableSlotOperationAccess().getOfKeyword_4());
            		
            // InternalFactoryLangParser.g:1524:3: ( (otherlv_5= RULE_ID ) )
            // InternalFactoryLangParser.g:1525:4: (otherlv_5= RULE_ID )
            {
            // InternalFactoryLangParser.g:1525:4: (otherlv_5= RULE_ID )
            // InternalFactoryLangParser.g:1526:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskMoveVariableSlotOperationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_5, grammarAccess.getDiskMoveVariableSlotOperationAccess().getVariableVariableCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,To,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDiskMoveVariableSlotOperationAccess().getToKeyword_6());
            		
            // InternalFactoryLangParser.g:1541:3: ( (otherlv_7= RULE_ID ) )
            // InternalFactoryLangParser.g:1542:4: (otherlv_7= RULE_ID )
            {
            // InternalFactoryLangParser.g:1542:4: (otherlv_7= RULE_ID )
            // InternalFactoryLangParser.g:1543:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskMoveVariableSlotOperationRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getDiskMoveVariableSlotOperationAccess().getTargetDiskZoneParameterCrossReference_7_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiskMoveVariableSlotOperation"


    // $ANTLR start "entryRuleDiskMoveEmptySlotOperation"
    // InternalFactoryLangParser.g:1558:1: entryRuleDiskMoveEmptySlotOperation returns [EObject current=null] : iv_ruleDiskMoveEmptySlotOperation= ruleDiskMoveEmptySlotOperation EOF ;
    public final EObject entryRuleDiskMoveEmptySlotOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskMoveEmptySlotOperation = null;


        try {
            // InternalFactoryLangParser.g:1558:67: (iv_ruleDiskMoveEmptySlotOperation= ruleDiskMoveEmptySlotOperation EOF )
            // InternalFactoryLangParser.g:1559:2: iv_ruleDiskMoveEmptySlotOperation= ruleDiskMoveEmptySlotOperation EOF
            {
             newCompositeNode(grammarAccess.getDiskMoveEmptySlotOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskMoveEmptySlotOperation=ruleDiskMoveEmptySlotOperation();

            state._fsp--;

             current =iv_ruleDiskMoveEmptySlotOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiskMoveEmptySlotOperation"


    // $ANTLR start "ruleDiskMoveEmptySlotOperation"
    // InternalFactoryLangParser.g:1565:1: ruleDiskMoveEmptySlotOperation returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Move otherlv_3= Empty otherlv_4= Slot otherlv_5= To ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleDiskMoveEmptySlotOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:1571:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Move otherlv_3= Empty otherlv_4= Slot otherlv_5= To ( (otherlv_6= RULE_ID ) ) ) )
            // InternalFactoryLangParser.g:1572:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Move otherlv_3= Empty otherlv_4= Slot otherlv_5= To ( (otherlv_6= RULE_ID ) ) )
            {
            // InternalFactoryLangParser.g:1572:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Move otherlv_3= Empty otherlv_4= Slot otherlv_5= To ( (otherlv_6= RULE_ID ) ) )
            // InternalFactoryLangParser.g:1573:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Move otherlv_3= Empty otherlv_4= Slot otherlv_5= To ( (otherlv_6= RULE_ID ) )
            {
            // InternalFactoryLangParser.g:1573:3: ()
            // InternalFactoryLangParser.g:1574:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiskMoveEmptySlotOperationAccess().getDiskMoveEmptySlotOperationAction_0(),
            					current);
            			

            }

            // InternalFactoryLangParser.g:1580:3: ( (otherlv_1= RULE_ID ) )
            // InternalFactoryLangParser.g:1581:4: (otherlv_1= RULE_ID )
            {
            // InternalFactoryLangParser.g:1581:4: (otherlv_1= RULE_ID )
            // InternalFactoryLangParser.g:1582:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskMoveEmptySlotOperationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getDiskMoveEmptySlotOperationAccess().getDeviceDiskCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,Move,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getDiskMoveEmptySlotOperationAccess().getMoveKeyword_2());
            		
            otherlv_3=(Token)match(input,Empty,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getDiskMoveEmptySlotOperationAccess().getEmptyKeyword_3());
            		
            otherlv_4=(Token)match(input,Slot,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getDiskMoveEmptySlotOperationAccess().getSlotKeyword_4());
            		
            otherlv_5=(Token)match(input,To,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getDiskMoveEmptySlotOperationAccess().getToKeyword_5());
            		
            // InternalFactoryLangParser.g:1609:3: ( (otherlv_6= RULE_ID ) )
            // InternalFactoryLangParser.g:1610:4: (otherlv_6= RULE_ID )
            {
            // InternalFactoryLangParser.g:1610:4: (otherlv_6= RULE_ID )
            // InternalFactoryLangParser.g:1611:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskMoveEmptySlotOperationRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_6, grammarAccess.getDiskMoveEmptySlotOperationAccess().getTargetDiskZoneParameterCrossReference_6_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiskMoveEmptySlotOperation"


    // $ANTLR start "entryRuleDiskMarkSlotOperation"
    // InternalFactoryLangParser.g:1626:1: entryRuleDiskMarkSlotOperation returns [EObject current=null] : iv_ruleDiskMarkSlotOperation= ruleDiskMarkSlotOperation EOF ;
    public final EObject entryRuleDiskMarkSlotOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskMarkSlotOperation = null;


        try {
            // InternalFactoryLangParser.g:1626:62: (iv_ruleDiskMarkSlotOperation= ruleDiskMarkSlotOperation EOF )
            // InternalFactoryLangParser.g:1627:2: iv_ruleDiskMarkSlotOperation= ruleDiskMarkSlotOperation EOF
            {
             newCompositeNode(grammarAccess.getDiskMarkSlotOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskMarkSlotOperation=ruleDiskMarkSlotOperation();

            state._fsp--;

             current =iv_ruleDiskMarkSlotOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiskMarkSlotOperation"


    // $ANTLR start "ruleDiskMarkSlotOperation"
    // InternalFactoryLangParser.g:1633:1: ruleDiskMarkSlotOperation returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Mark otherlv_3= Slot otherlv_4= At ( (otherlv_5= RULE_ID ) ) otherlv_6= As ( (lv_diskSlotValue_7_0= ruleDiskSlotValue ) ) (otherlv_8= In ( (lv_quantity_9_0= RULE_INT ) ) ( (lv_measure_10_0= ruleTIME ) ) )? ) ;
    public final EObject ruleDiskMarkSlotOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_quantity_9_0=null;
        EObject lv_diskSlotValue_7_0 = null;

        Enumerator lv_measure_10_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:1639:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Mark otherlv_3= Slot otherlv_4= At ( (otherlv_5= RULE_ID ) ) otherlv_6= As ( (lv_diskSlotValue_7_0= ruleDiskSlotValue ) ) (otherlv_8= In ( (lv_quantity_9_0= RULE_INT ) ) ( (lv_measure_10_0= ruleTIME ) ) )? ) )
            // InternalFactoryLangParser.g:1640:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Mark otherlv_3= Slot otherlv_4= At ( (otherlv_5= RULE_ID ) ) otherlv_6= As ( (lv_diskSlotValue_7_0= ruleDiskSlotValue ) ) (otherlv_8= In ( (lv_quantity_9_0= RULE_INT ) ) ( (lv_measure_10_0= ruleTIME ) ) )? )
            {
            // InternalFactoryLangParser.g:1640:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Mark otherlv_3= Slot otherlv_4= At ( (otherlv_5= RULE_ID ) ) otherlv_6= As ( (lv_diskSlotValue_7_0= ruleDiskSlotValue ) ) (otherlv_8= In ( (lv_quantity_9_0= RULE_INT ) ) ( (lv_measure_10_0= ruleTIME ) ) )? )
            // InternalFactoryLangParser.g:1641:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Mark otherlv_3= Slot otherlv_4= At ( (otherlv_5= RULE_ID ) ) otherlv_6= As ( (lv_diskSlotValue_7_0= ruleDiskSlotValue ) ) (otherlv_8= In ( (lv_quantity_9_0= RULE_INT ) ) ( (lv_measure_10_0= ruleTIME ) ) )?
            {
            // InternalFactoryLangParser.g:1641:3: ()
            // InternalFactoryLangParser.g:1642:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiskMarkSlotOperationAccess().getDiskMarkSlotOperationAction_0(),
            					current);
            			

            }

            // InternalFactoryLangParser.g:1648:3: ( (otherlv_1= RULE_ID ) )
            // InternalFactoryLangParser.g:1649:4: (otherlv_1= RULE_ID )
            {
            // InternalFactoryLangParser.g:1649:4: (otherlv_1= RULE_ID )
            // InternalFactoryLangParser.g:1650:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskMarkSlotOperationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_1, grammarAccess.getDiskMarkSlotOperationAccess().getDeviceDiskCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,Mark,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getDiskMarkSlotOperationAccess().getMarkKeyword_2());
            		
            otherlv_3=(Token)match(input,Slot,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getDiskMarkSlotOperationAccess().getSlotKeyword_3());
            		
            otherlv_4=(Token)match(input,At,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getDiskMarkSlotOperationAccess().getAtKeyword_4());
            		
            // InternalFactoryLangParser.g:1673:3: ( (otherlv_5= RULE_ID ) )
            // InternalFactoryLangParser.g:1674:4: (otherlv_5= RULE_ID )
            {
            // InternalFactoryLangParser.g:1674:4: (otherlv_5= RULE_ID )
            // InternalFactoryLangParser.g:1675:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskMarkSlotOperationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_5, grammarAccess.getDiskMarkSlotOperationAccess().getTargetDiskZoneParameterCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,As,FOLLOW_36); 

            			newLeafNode(otherlv_6, grammarAccess.getDiskMarkSlotOperationAccess().getAsKeyword_6());
            		
            // InternalFactoryLangParser.g:1690:3: ( (lv_diskSlotValue_7_0= ruleDiskSlotValue ) )
            // InternalFactoryLangParser.g:1691:4: (lv_diskSlotValue_7_0= ruleDiskSlotValue )
            {
            // InternalFactoryLangParser.g:1691:4: (lv_diskSlotValue_7_0= ruleDiskSlotValue )
            // InternalFactoryLangParser.g:1692:5: lv_diskSlotValue_7_0= ruleDiskSlotValue
            {

            					newCompositeNode(grammarAccess.getDiskMarkSlotOperationAccess().getDiskSlotValueDiskSlotValueParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_37);
            lv_diskSlotValue_7_0=ruleDiskSlotValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiskMarkSlotOperationRule());
            					}
            					set(
            						current,
            						"diskSlotValue",
            						lv_diskSlotValue_7_0,
            						"xtext.factoryLang.FactoryLang.DiskSlotValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFactoryLangParser.g:1709:3: (otherlv_8= In ( (lv_quantity_9_0= RULE_INT ) ) ( (lv_measure_10_0= ruleTIME ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==In) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFactoryLangParser.g:1710:4: otherlv_8= In ( (lv_quantity_9_0= RULE_INT ) ) ( (lv_measure_10_0= ruleTIME ) )
                    {
                    otherlv_8=(Token)match(input,In,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getDiskMarkSlotOperationAccess().getInKeyword_8_0());
                    			
                    // InternalFactoryLangParser.g:1714:4: ( (lv_quantity_9_0= RULE_INT ) )
                    // InternalFactoryLangParser.g:1715:5: (lv_quantity_9_0= RULE_INT )
                    {
                    // InternalFactoryLangParser.g:1715:5: (lv_quantity_9_0= RULE_INT )
                    // InternalFactoryLangParser.g:1716:6: lv_quantity_9_0= RULE_INT
                    {
                    lv_quantity_9_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                    						newLeafNode(lv_quantity_9_0, grammarAccess.getDiskMarkSlotOperationAccess().getQuantityINTTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDiskMarkSlotOperationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"quantity",
                    							lv_quantity_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalFactoryLangParser.g:1732:4: ( (lv_measure_10_0= ruleTIME ) )
                    // InternalFactoryLangParser.g:1733:5: (lv_measure_10_0= ruleTIME )
                    {
                    // InternalFactoryLangParser.g:1733:5: (lv_measure_10_0= ruleTIME )
                    // InternalFactoryLangParser.g:1734:6: lv_measure_10_0= ruleTIME
                    {

                    						newCompositeNode(grammarAccess.getDiskMarkSlotOperationAccess().getMeasureTIMEEnumRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_measure_10_0=ruleTIME();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDiskMarkSlotOperationRule());
                    						}
                    						set(
                    							current,
                    							"measure",
                    							lv_measure_10_0,
                    							"xtext.factoryLang.FactoryLang.TIME");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiskMarkSlotOperation"


    // $ANTLR start "entryRuleDiskWaitOperation"
    // InternalFactoryLangParser.g:1756:1: entryRuleDiskWaitOperation returns [EObject current=null] : iv_ruleDiskWaitOperation= ruleDiskWaitOperation EOF ;
    public final EObject entryRuleDiskWaitOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskWaitOperation = null;


        try {
            // InternalFactoryLangParser.g:1756:58: (iv_ruleDiskWaitOperation= ruleDiskWaitOperation EOF )
            // InternalFactoryLangParser.g:1757:2: iv_ruleDiskWaitOperation= ruleDiskWaitOperation EOF
            {
             newCompositeNode(grammarAccess.getDiskWaitOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskWaitOperation=ruleDiskWaitOperation();

            state._fsp--;

             current =iv_ruleDiskWaitOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiskWaitOperation"


    // $ANTLR start "ruleDiskWaitOperation"
    // InternalFactoryLangParser.g:1763:1: ruleDiskWaitOperation returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Wait otherlv_3= For otherlv_4= New otherlv_5= Item ) ;
    public final EObject ruleDiskWaitOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:1769:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Wait otherlv_3= For otherlv_4= New otherlv_5= Item ) )
            // InternalFactoryLangParser.g:1770:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Wait otherlv_3= For otherlv_4= New otherlv_5= Item )
            {
            // InternalFactoryLangParser.g:1770:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Wait otherlv_3= For otherlv_4= New otherlv_5= Item )
            // InternalFactoryLangParser.g:1771:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Wait otherlv_3= For otherlv_4= New otherlv_5= Item
            {
            // InternalFactoryLangParser.g:1771:3: ()
            // InternalFactoryLangParser.g:1772:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiskWaitOperationAccess().getDiskWaitOperationAction_0(),
            					current);
            			

            }

            // InternalFactoryLangParser.g:1778:3: ( (otherlv_1= RULE_ID ) )
            // InternalFactoryLangParser.g:1779:4: (otherlv_1= RULE_ID )
            {
            // InternalFactoryLangParser.g:1779:4: (otherlv_1= RULE_ID )
            // InternalFactoryLangParser.g:1780:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskWaitOperationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_1, grammarAccess.getDiskWaitOperationAccess().getDeviceDiskCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,Wait,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getDiskWaitOperationAccess().getWaitKeyword_2());
            		
            otherlv_3=(Token)match(input,For,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getDiskWaitOperationAccess().getForKeyword_3());
            		
            otherlv_4=(Token)match(input,New,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getDiskWaitOperationAccess().getNewKeyword_4());
            		
            otherlv_5=(Token)match(input,Item,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDiskWaitOperationAccess().getItemKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiskWaitOperation"


    // $ANTLR start "entryRuleCameraOperation"
    // InternalFactoryLangParser.g:1811:1: entryRuleCameraOperation returns [EObject current=null] : iv_ruleCameraOperation= ruleCameraOperation EOF ;
    public final EObject entryRuleCameraOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCameraOperation = null;


        try {
            // InternalFactoryLangParser.g:1811:56: (iv_ruleCameraOperation= ruleCameraOperation EOF )
            // InternalFactoryLangParser.g:1812:2: iv_ruleCameraOperation= ruleCameraOperation EOF
            {
             newCompositeNode(grammarAccess.getCameraOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCameraOperation=ruleCameraOperation();

            state._fsp--;

             current =iv_ruleCameraOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCameraOperation"


    // $ANTLR start "ruleCameraOperation"
    // InternalFactoryLangParser.g:1818:1: ruleCameraOperation returns [EObject current=null] : this_CameraScanOperation_0= ruleCameraScanOperation ;
    public final EObject ruleCameraOperation() throws RecognitionException {
        EObject current = null;

        EObject this_CameraScanOperation_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:1824:2: (this_CameraScanOperation_0= ruleCameraScanOperation )
            // InternalFactoryLangParser.g:1825:2: this_CameraScanOperation_0= ruleCameraScanOperation
            {

            		newCompositeNode(grammarAccess.getCameraOperationAccess().getCameraScanOperationParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CameraScanOperation_0=ruleCameraScanOperation();

            state._fsp--;


            		current = this_CameraScanOperation_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCameraOperation"


    // $ANTLR start "entryRuleCameraScanOperation"
    // InternalFactoryLangParser.g:1836:1: entryRuleCameraScanOperation returns [EObject current=null] : iv_ruleCameraScanOperation= ruleCameraScanOperation EOF ;
    public final EObject entryRuleCameraScanOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCameraScanOperation = null;


        try {
            // InternalFactoryLangParser.g:1836:60: (iv_ruleCameraScanOperation= ruleCameraScanOperation EOF )
            // InternalFactoryLangParser.g:1837:2: iv_ruleCameraScanOperation= ruleCameraScanOperation EOF
            {
             newCompositeNode(grammarAccess.getCameraScanOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCameraScanOperation=ruleCameraScanOperation();

            state._fsp--;

             current =iv_ruleCameraScanOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCameraScanOperation"


    // $ANTLR start "ruleCameraScanOperation"
    // InternalFactoryLangParser.g:1843:1: ruleCameraScanOperation returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Scan otherlv_3= Color otherlv_4= Into ( (lv_variable_5_0= ruleGlobalVariable ) ) ) ;
    public final EObject ruleCameraScanOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_variable_5_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:1849:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Scan otherlv_3= Color otherlv_4= Into ( (lv_variable_5_0= ruleGlobalVariable ) ) ) )
            // InternalFactoryLangParser.g:1850:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Scan otherlv_3= Color otherlv_4= Into ( (lv_variable_5_0= ruleGlobalVariable ) ) )
            {
            // InternalFactoryLangParser.g:1850:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Scan otherlv_3= Color otherlv_4= Into ( (lv_variable_5_0= ruleGlobalVariable ) ) )
            // InternalFactoryLangParser.g:1851:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Scan otherlv_3= Color otherlv_4= Into ( (lv_variable_5_0= ruleGlobalVariable ) )
            {
            // InternalFactoryLangParser.g:1851:3: ()
            // InternalFactoryLangParser.g:1852:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCameraScanOperationAccess().getCameraScanOperationAction_0(),
            					current);
            			

            }

            // InternalFactoryLangParser.g:1858:3: ( (otherlv_1= RULE_ID ) )
            // InternalFactoryLangParser.g:1859:4: (otherlv_1= RULE_ID )
            {
            // InternalFactoryLangParser.g:1859:4: (otherlv_1= RULE_ID )
            // InternalFactoryLangParser.g:1860:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCameraScanOperationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(otherlv_1, grammarAccess.getCameraScanOperationAccess().getDeviceCameraCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,Scan,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getCameraScanOperationAccess().getScanKeyword_2());
            		
            otherlv_3=(Token)match(input,Color,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getCameraScanOperationAccess().getColorKeyword_3());
            		
            otherlv_4=(Token)match(input,Into,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCameraScanOperationAccess().getIntoKeyword_4());
            		
            // InternalFactoryLangParser.g:1883:3: ( (lv_variable_5_0= ruleGlobalVariable ) )
            // InternalFactoryLangParser.g:1884:4: (lv_variable_5_0= ruleGlobalVariable )
            {
            // InternalFactoryLangParser.g:1884:4: (lv_variable_5_0= ruleGlobalVariable )
            // InternalFactoryLangParser.g:1885:5: lv_variable_5_0= ruleGlobalVariable
            {

            					newCompositeNode(grammarAccess.getCameraScanOperationAccess().getVariableGlobalVariableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_variable_5_0=ruleGlobalVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCameraScanOperationRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_5_0,
            						"xtext.factoryLang.FactoryLang.GlobalVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCameraScanOperation"


    // $ANTLR start "entryRuleLoop"
    // InternalFactoryLangParser.g:1906:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalFactoryLangParser.g:1906:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalFactoryLangParser.g:1907:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalFactoryLangParser.g:1913:1: ruleLoop returns [EObject current=null] : this_ForEach_0= ruleForEach ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        EObject this_ForEach_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:1919:2: (this_ForEach_0= ruleForEach )
            // InternalFactoryLangParser.g:1920:2: this_ForEach_0= ruleForEach
            {

            		newCompositeNode(grammarAccess.getLoopAccess().getForEachParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ForEach_0=ruleForEach();

            state._fsp--;


            		current = this_ForEach_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleForEach"
    // InternalFactoryLangParser.g:1931:1: entryRuleForEach returns [EObject current=null] : iv_ruleForEach= ruleForEach EOF ;
    public final EObject entryRuleForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEach = null;


        try {
            // InternalFactoryLangParser.g:1931:48: (iv_ruleForEach= ruleForEach EOF )
            // InternalFactoryLangParser.g:1932:2: iv_ruleForEach= ruleForEach EOF
            {
             newCompositeNode(grammarAccess.getForEachRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForEach=ruleForEach();

            state._fsp--;

             current =iv_ruleForEach; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForEach"


    // $ANTLR start "ruleForEach"
    // InternalFactoryLangParser.g:1938:1: ruleForEach returns [EObject current=null] : ( () otherlv_1= For otherlv_2= Each ( (lv_variable_3_0= ruleLocalVariable ) ) otherlv_4= In ( (otherlv_5= RULE_ID ) ) otherlv_6= That otherlv_7= Is ( (lv_operator_8_0= Not ) )? ( (lv_variableValue_9_0= ruleVariableValue ) ) otherlv_10= Then this_BEGIN_11= RULE_BEGIN ( (lv_statements_12_0= ruleStatement ) )* this_END_13= RULE_END ) ;
    public final EObject ruleForEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_operator_8_0=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        EObject lv_variable_3_0 = null;

        EObject lv_variableValue_9_0 = null;

        EObject lv_statements_12_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:1944:2: ( ( () otherlv_1= For otherlv_2= Each ( (lv_variable_3_0= ruleLocalVariable ) ) otherlv_4= In ( (otherlv_5= RULE_ID ) ) otherlv_6= That otherlv_7= Is ( (lv_operator_8_0= Not ) )? ( (lv_variableValue_9_0= ruleVariableValue ) ) otherlv_10= Then this_BEGIN_11= RULE_BEGIN ( (lv_statements_12_0= ruleStatement ) )* this_END_13= RULE_END ) )
            // InternalFactoryLangParser.g:1945:2: ( () otherlv_1= For otherlv_2= Each ( (lv_variable_3_0= ruleLocalVariable ) ) otherlv_4= In ( (otherlv_5= RULE_ID ) ) otherlv_6= That otherlv_7= Is ( (lv_operator_8_0= Not ) )? ( (lv_variableValue_9_0= ruleVariableValue ) ) otherlv_10= Then this_BEGIN_11= RULE_BEGIN ( (lv_statements_12_0= ruleStatement ) )* this_END_13= RULE_END )
            {
            // InternalFactoryLangParser.g:1945:2: ( () otherlv_1= For otherlv_2= Each ( (lv_variable_3_0= ruleLocalVariable ) ) otherlv_4= In ( (otherlv_5= RULE_ID ) ) otherlv_6= That otherlv_7= Is ( (lv_operator_8_0= Not ) )? ( (lv_variableValue_9_0= ruleVariableValue ) ) otherlv_10= Then this_BEGIN_11= RULE_BEGIN ( (lv_statements_12_0= ruleStatement ) )* this_END_13= RULE_END )
            // InternalFactoryLangParser.g:1946:3: () otherlv_1= For otherlv_2= Each ( (lv_variable_3_0= ruleLocalVariable ) ) otherlv_4= In ( (otherlv_5= RULE_ID ) ) otherlv_6= That otherlv_7= Is ( (lv_operator_8_0= Not ) )? ( (lv_variableValue_9_0= ruleVariableValue ) ) otherlv_10= Then this_BEGIN_11= RULE_BEGIN ( (lv_statements_12_0= ruleStatement ) )* this_END_13= RULE_END
            {
            // InternalFactoryLangParser.g:1946:3: ()
            // InternalFactoryLangParser.g:1947:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForEachAccess().getForEachAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,For,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getForEachAccess().getForKeyword_1());
            		
            otherlv_2=(Token)match(input,Each,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachAccess().getEachKeyword_2());
            		
            // InternalFactoryLangParser.g:1961:3: ( (lv_variable_3_0= ruleLocalVariable ) )
            // InternalFactoryLangParser.g:1962:4: (lv_variable_3_0= ruleLocalVariable )
            {
            // InternalFactoryLangParser.g:1962:4: (lv_variable_3_0= ruleLocalVariable )
            // InternalFactoryLangParser.g:1963:5: lv_variable_3_0= ruleLocalVariable
            {

            					newCompositeNode(grammarAccess.getForEachAccess().getVariableLocalVariableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
            lv_variable_3_0=ruleLocalVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_3_0,
            						"xtext.factoryLang.FactoryLang.LocalVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,In,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getForEachAccess().getInKeyword_4());
            		
            // InternalFactoryLangParser.g:1984:3: ( (otherlv_5= RULE_ID ) )
            // InternalFactoryLangParser.g:1985:4: (otherlv_5= RULE_ID )
            {
            // InternalFactoryLangParser.g:1985:4: (otherlv_5= RULE_ID )
            // InternalFactoryLangParser.g:1986:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(otherlv_5, grammarAccess.getForEachAccess().getDeviceDeviceCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,That,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getForEachAccess().getThatKeyword_6());
            		
            otherlv_7=(Token)match(input,Is,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getForEachAccess().getIsKeyword_7());
            		
            // InternalFactoryLangParser.g:2005:3: ( (lv_operator_8_0= Not ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Not) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFactoryLangParser.g:2006:4: (lv_operator_8_0= Not )
                    {
                    // InternalFactoryLangParser.g:2006:4: (lv_operator_8_0= Not )
                    // InternalFactoryLangParser.g:2007:5: lv_operator_8_0= Not
                    {
                    lv_operator_8_0=(Token)match(input,Not,FOLLOW_26); 

                    					newLeafNode(lv_operator_8_0, grammarAccess.getForEachAccess().getOperatorNotKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getForEachRule());
                    					}
                    					setWithLastConsumed(current, "operator", lv_operator_8_0, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalFactoryLangParser.g:2019:3: ( (lv_variableValue_9_0= ruleVariableValue ) )
            // InternalFactoryLangParser.g:2020:4: (lv_variableValue_9_0= ruleVariableValue )
            {
            // InternalFactoryLangParser.g:2020:4: (lv_variableValue_9_0= ruleVariableValue )
            // InternalFactoryLangParser.g:2021:5: lv_variableValue_9_0= ruleVariableValue
            {

            					newCompositeNode(grammarAccess.getForEachAccess().getVariableValueVariableValueParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_23);
            lv_variableValue_9_0=ruleVariableValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachRule());
            					}
            					set(
            						current,
            						"variableValue",
            						lv_variableValue_9_0,
            						"xtext.factoryLang.FactoryLang.VariableValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,Then,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getForEachAccess().getThenKeyword_10());
            		
            this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_24); 

            			newLeafNode(this_BEGIN_11, grammarAccess.getForEachAccess().getBEGINTerminalRuleCall_11());
            		
            // InternalFactoryLangParser.g:2046:3: ( (lv_statements_12_0= ruleStatement ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==For||LA19_0==If||LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFactoryLangParser.g:2047:4: (lv_statements_12_0= ruleStatement )
            	    {
            	    // InternalFactoryLangParser.g:2047:4: (lv_statements_12_0= ruleStatement )
            	    // InternalFactoryLangParser.g:2048:5: lv_statements_12_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getForEachAccess().getStatementsStatementParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_statements_12_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForEachRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_12_0,
            	    						"xtext.factoryLang.FactoryLang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            this_END_13=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_13, grammarAccess.getForEachAccess().getENDTerminalRuleCall_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForEach"


    // $ANTLR start "entryRuleLocalVariable"
    // InternalFactoryLangParser.g:2073:1: entryRuleLocalVariable returns [EObject current=null] : iv_ruleLocalVariable= ruleLocalVariable EOF ;
    public final EObject entryRuleLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariable = null;


        try {
            // InternalFactoryLangParser.g:2073:54: (iv_ruleLocalVariable= ruleLocalVariable EOF )
            // InternalFactoryLangParser.g:2074:2: iv_ruleLocalVariable= ruleLocalVariable EOF
            {
             newCompositeNode(grammarAccess.getLocalVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalVariable=ruleLocalVariable();

            state._fsp--;

             current =iv_ruleLocalVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVariable"


    // $ANTLR start "ruleLocalVariable"
    // InternalFactoryLangParser.g:2080:1: ruleLocalVariable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:2086:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFactoryLangParser.g:2087:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFactoryLangParser.g:2087:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFactoryLangParser.g:2088:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFactoryLangParser.g:2088:3: ()
            // InternalFactoryLangParser.g:2089:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocalVariableAccess().getLocalVariableAction_0(),
            					current);
            			

            }

            // InternalFactoryLangParser.g:2095:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFactoryLangParser.g:2096:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFactoryLangParser.g:2096:4: (lv_name_1_0= RULE_ID )
            // InternalFactoryLangParser.g:2097:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLocalVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalVariable"


    // $ANTLR start "entryRuleGlobalVariable"
    // InternalFactoryLangParser.g:2117:1: entryRuleGlobalVariable returns [EObject current=null] : iv_ruleGlobalVariable= ruleGlobalVariable EOF ;
    public final EObject entryRuleGlobalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalVariable = null;


        try {
            // InternalFactoryLangParser.g:2117:55: (iv_ruleGlobalVariable= ruleGlobalVariable EOF )
            // InternalFactoryLangParser.g:2118:2: iv_ruleGlobalVariable= ruleGlobalVariable EOF
            {
             newCompositeNode(grammarAccess.getGlobalVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalVariable=ruleGlobalVariable();

            state._fsp--;

             current =iv_ruleGlobalVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalVariable"


    // $ANTLR start "ruleGlobalVariable"
    // InternalFactoryLangParser.g:2124:1: ruleGlobalVariable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGlobalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:2130:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFactoryLangParser.g:2131:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFactoryLangParser.g:2131:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFactoryLangParser.g:2132:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFactoryLangParser.g:2132:3: ()
            // InternalFactoryLangParser.g:2133:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalVariableAccess().getGlobalVariableAction_0(),
            					current);
            			

            }

            // InternalFactoryLangParser.g:2139:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFactoryLangParser.g:2140:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFactoryLangParser.g:2140:4: (lv_name_1_0= RULE_ID )
            // InternalFactoryLangParser.g:2141:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGlobalVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalVariable"


    // $ANTLR start "entryRuleDeviceValue"
    // InternalFactoryLangParser.g:2161:1: entryRuleDeviceValue returns [EObject current=null] : iv_ruleDeviceValue= ruleDeviceValue EOF ;
    public final EObject entryRuleDeviceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceValue = null;


        try {
            // InternalFactoryLangParser.g:2161:52: (iv_ruleDeviceValue= ruleDeviceValue EOF )
            // InternalFactoryLangParser.g:2162:2: iv_ruleDeviceValue= ruleDeviceValue EOF
            {
             newCompositeNode(grammarAccess.getDeviceValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceValue=ruleDeviceValue();

            state._fsp--;

             current =iv_ruleDeviceValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeviceValue"


    // $ANTLR start "ruleDeviceValue"
    // InternalFactoryLangParser.g:2168:1: ruleDeviceValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleDiskStateValue ) ) | ( (lv_value_1_0= ruleColorValue ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDeviceValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:2174:2: ( ( ( (lv_value_0_0= ruleDiskStateValue ) ) | ( (lv_value_1_0= ruleColorValue ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFactoryLangParser.g:2175:2: ( ( (lv_value_0_0= ruleDiskStateValue ) ) | ( (lv_value_1_0= ruleColorValue ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFactoryLangParser.g:2175:2: ( ( (lv_value_0_0= ruleDiskStateValue ) ) | ( (lv_value_1_0= ruleColorValue ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case Empty:
            case Full:
                {
                alt20=1;
                }
                break;
            case Green:
            case Blue:
            case Red:
                {
                alt20=2;
                }
                break;
            case RULE_ID:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalFactoryLangParser.g:2176:3: ( (lv_value_0_0= ruleDiskStateValue ) )
                    {
                    // InternalFactoryLangParser.g:2176:3: ( (lv_value_0_0= ruleDiskStateValue ) )
                    // InternalFactoryLangParser.g:2177:4: (lv_value_0_0= ruleDiskStateValue )
                    {
                    // InternalFactoryLangParser.g:2177:4: (lv_value_0_0= ruleDiskStateValue )
                    // InternalFactoryLangParser.g:2178:5: lv_value_0_0= ruleDiskStateValue
                    {

                    					newCompositeNode(grammarAccess.getDeviceValueAccess().getValueDiskStateValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleDiskStateValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeviceValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"xtext.factoryLang.FactoryLang.DiskStateValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFactoryLangParser.g:2196:3: ( (lv_value_1_0= ruleColorValue ) )
                    {
                    // InternalFactoryLangParser.g:2196:3: ( (lv_value_1_0= ruleColorValue ) )
                    // InternalFactoryLangParser.g:2197:4: (lv_value_1_0= ruleColorValue )
                    {
                    // InternalFactoryLangParser.g:2197:4: (lv_value_1_0= ruleColorValue )
                    // InternalFactoryLangParser.g:2198:5: lv_value_1_0= ruleColorValue
                    {

                    					newCompositeNode(grammarAccess.getDeviceValueAccess().getValueColorValueParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleColorValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeviceValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"xtext.factoryLang.FactoryLang.ColorValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFactoryLangParser.g:2216:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalFactoryLangParser.g:2216:3: ( (otherlv_2= RULE_ID ) )
                    // InternalFactoryLangParser.g:2217:4: (otherlv_2= RULE_ID )
                    {
                    // InternalFactoryLangParser.g:2217:4: (otherlv_2= RULE_ID )
                    // InternalFactoryLangParser.g:2218:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDeviceValueRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getDeviceValueAccess().getRefParameterCrossReference_2_0());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceValue"


    // $ANTLR start "entryRuleDiskSlotValue"
    // InternalFactoryLangParser.g:2233:1: entryRuleDiskSlotValue returns [EObject current=null] : iv_ruleDiskSlotValue= ruleDiskSlotValue EOF ;
    public final EObject entryRuleDiskSlotValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskSlotValue = null;


        try {
            // InternalFactoryLangParser.g:2233:54: (iv_ruleDiskSlotValue= ruleDiskSlotValue EOF )
            // InternalFactoryLangParser.g:2234:2: iv_ruleDiskSlotValue= ruleDiskSlotValue EOF
            {
             newCompositeNode(grammarAccess.getDiskSlotValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskSlotValue=ruleDiskSlotValue();

            state._fsp--;

             current =iv_ruleDiskSlotValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiskSlotValue"


    // $ANTLR start "ruleDiskSlotValue"
    // InternalFactoryLangParser.g:2240:1: ruleDiskSlotValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleDiskSlotStateValue ) ) | ( (lv_value_1_0= ruleColorValue ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDiskSlotValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:2246:2: ( ( ( (lv_value_0_0= ruleDiskSlotStateValue ) ) | ( (lv_value_1_0= ruleColorValue ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFactoryLangParser.g:2247:2: ( ( (lv_value_0_0= ruleDiskSlotStateValue ) ) | ( (lv_value_1_0= ruleColorValue ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFactoryLangParser.g:2247:2: ( ( (lv_value_0_0= ruleDiskSlotStateValue ) ) | ( (lv_value_1_0= ruleColorValue ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case In_progress:
            case Complete:
            case Free:
                {
                alt21=1;
                }
                break;
            case Green:
            case Blue:
            case Red:
                {
                alt21=2;
                }
                break;
            case RULE_ID:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalFactoryLangParser.g:2248:3: ( (lv_value_0_0= ruleDiskSlotStateValue ) )
                    {
                    // InternalFactoryLangParser.g:2248:3: ( (lv_value_0_0= ruleDiskSlotStateValue ) )
                    // InternalFactoryLangParser.g:2249:4: (lv_value_0_0= ruleDiskSlotStateValue )
                    {
                    // InternalFactoryLangParser.g:2249:4: (lv_value_0_0= ruleDiskSlotStateValue )
                    // InternalFactoryLangParser.g:2250:5: lv_value_0_0= ruleDiskSlotStateValue
                    {

                    					newCompositeNode(grammarAccess.getDiskSlotValueAccess().getValueDiskSlotStateValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleDiskSlotStateValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDiskSlotValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"xtext.factoryLang.FactoryLang.DiskSlotStateValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFactoryLangParser.g:2268:3: ( (lv_value_1_0= ruleColorValue ) )
                    {
                    // InternalFactoryLangParser.g:2268:3: ( (lv_value_1_0= ruleColorValue ) )
                    // InternalFactoryLangParser.g:2269:4: (lv_value_1_0= ruleColorValue )
                    {
                    // InternalFactoryLangParser.g:2269:4: (lv_value_1_0= ruleColorValue )
                    // InternalFactoryLangParser.g:2270:5: lv_value_1_0= ruleColorValue
                    {

                    					newCompositeNode(grammarAccess.getDiskSlotValueAccess().getValueColorValueParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleColorValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDiskSlotValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"xtext.factoryLang.FactoryLang.ColorValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFactoryLangParser.g:2288:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalFactoryLangParser.g:2288:3: ( (otherlv_2= RULE_ID ) )
                    // InternalFactoryLangParser.g:2289:4: (otherlv_2= RULE_ID )
                    {
                    // InternalFactoryLangParser.g:2289:4: (otherlv_2= RULE_ID )
                    // InternalFactoryLangParser.g:2290:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDiskSlotValueRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getDiskSlotValueAccess().getRefVariableCrossReference_2_0());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiskSlotValue"


    // $ANTLR start "entryRuleVariableValue"
    // InternalFactoryLangParser.g:2305:1: entryRuleVariableValue returns [EObject current=null] : iv_ruleVariableValue= ruleVariableValue EOF ;
    public final EObject entryRuleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue = null;


        try {
            // InternalFactoryLangParser.g:2305:54: (iv_ruleVariableValue= ruleVariableValue EOF )
            // InternalFactoryLangParser.g:2306:2: iv_ruleVariableValue= ruleVariableValue EOF
            {
             newCompositeNode(grammarAccess.getVariableValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableValue=ruleVariableValue();

            state._fsp--;

             current =iv_ruleVariableValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableValue"


    // $ANTLR start "ruleVariableValue"
    // InternalFactoryLangParser.g:2312:1: ruleVariableValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleDiskSlotStateValue ) ) | ( (lv_value_1_0= ruleColorValue ) ) | ( (lv_value_2_0= ruleNumber ) ) | ( (lv_value_3_0= ruleDiskStateValue ) ) | ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:2318:2: ( ( ( (lv_value_0_0= ruleDiskSlotStateValue ) ) | ( (lv_value_1_0= ruleColorValue ) ) | ( (lv_value_2_0= ruleNumber ) ) | ( (lv_value_3_0= ruleDiskStateValue ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            // InternalFactoryLangParser.g:2319:2: ( ( (lv_value_0_0= ruleDiskSlotStateValue ) ) | ( (lv_value_1_0= ruleColorValue ) ) | ( (lv_value_2_0= ruleNumber ) ) | ( (lv_value_3_0= ruleDiskStateValue ) ) | ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalFactoryLangParser.g:2319:2: ( ( (lv_value_0_0= ruleDiskSlotStateValue ) ) | ( (lv_value_1_0= ruleColorValue ) ) | ( (lv_value_2_0= ruleNumber ) ) | ( (lv_value_3_0= ruleDiskStateValue ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case In_progress:
            case Complete:
            case Free:
                {
                alt22=1;
                }
                break;
            case Green:
            case Blue:
            case Red:
                {
                alt22=2;
                }
                break;
            case RULE_INT:
                {
                alt22=3;
                }
                break;
            case Empty:
            case Full:
                {
                alt22=4;
                }
                break;
            case RULE_ID:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalFactoryLangParser.g:2320:3: ( (lv_value_0_0= ruleDiskSlotStateValue ) )
                    {
                    // InternalFactoryLangParser.g:2320:3: ( (lv_value_0_0= ruleDiskSlotStateValue ) )
                    // InternalFactoryLangParser.g:2321:4: (lv_value_0_0= ruleDiskSlotStateValue )
                    {
                    // InternalFactoryLangParser.g:2321:4: (lv_value_0_0= ruleDiskSlotStateValue )
                    // InternalFactoryLangParser.g:2322:5: lv_value_0_0= ruleDiskSlotStateValue
                    {

                    					newCompositeNode(grammarAccess.getVariableValueAccess().getValueDiskSlotStateValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleDiskSlotStateValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"xtext.factoryLang.FactoryLang.DiskSlotStateValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFactoryLangParser.g:2340:3: ( (lv_value_1_0= ruleColorValue ) )
                    {
                    // InternalFactoryLangParser.g:2340:3: ( (lv_value_1_0= ruleColorValue ) )
                    // InternalFactoryLangParser.g:2341:4: (lv_value_1_0= ruleColorValue )
                    {
                    // InternalFactoryLangParser.g:2341:4: (lv_value_1_0= ruleColorValue )
                    // InternalFactoryLangParser.g:2342:5: lv_value_1_0= ruleColorValue
                    {

                    					newCompositeNode(grammarAccess.getVariableValueAccess().getValueColorValueParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleColorValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"xtext.factoryLang.FactoryLang.ColorValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFactoryLangParser.g:2360:3: ( (lv_value_2_0= ruleNumber ) )
                    {
                    // InternalFactoryLangParser.g:2360:3: ( (lv_value_2_0= ruleNumber ) )
                    // InternalFactoryLangParser.g:2361:4: (lv_value_2_0= ruleNumber )
                    {
                    // InternalFactoryLangParser.g:2361:4: (lv_value_2_0= ruleNumber )
                    // InternalFactoryLangParser.g:2362:5: lv_value_2_0= ruleNumber
                    {

                    					newCompositeNode(grammarAccess.getVariableValueAccess().getValueNumberParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleNumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"xtext.factoryLang.FactoryLang.Number");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFactoryLangParser.g:2380:3: ( (lv_value_3_0= ruleDiskStateValue ) )
                    {
                    // InternalFactoryLangParser.g:2380:3: ( (lv_value_3_0= ruleDiskStateValue ) )
                    // InternalFactoryLangParser.g:2381:4: (lv_value_3_0= ruleDiskStateValue )
                    {
                    // InternalFactoryLangParser.g:2381:4: (lv_value_3_0= ruleDiskStateValue )
                    // InternalFactoryLangParser.g:2382:5: lv_value_3_0= ruleDiskStateValue
                    {

                    					newCompositeNode(grammarAccess.getVariableValueAccess().getValueDiskStateValueParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleDiskStateValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"xtext.factoryLang.FactoryLang.DiskStateValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalFactoryLangParser.g:2400:3: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalFactoryLangParser.g:2400:3: ( (otherlv_4= RULE_ID ) )
                    // InternalFactoryLangParser.g:2401:4: (otherlv_4= RULE_ID )
                    {
                    // InternalFactoryLangParser.g:2401:4: (otherlv_4= RULE_ID )
                    // InternalFactoryLangParser.g:2402:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableValueRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getVariableValueAccess().getRefVariableCrossReference_4_0());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableValue"


    // $ANTLR start "entryRuleDiskStateValue"
    // InternalFactoryLangParser.g:2417:1: entryRuleDiskStateValue returns [EObject current=null] : iv_ruleDiskStateValue= ruleDiskStateValue EOF ;
    public final EObject entryRuleDiskStateValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskStateValue = null;


        try {
            // InternalFactoryLangParser.g:2417:55: (iv_ruleDiskStateValue= ruleDiskStateValue EOF )
            // InternalFactoryLangParser.g:2418:2: iv_ruleDiskStateValue= ruleDiskStateValue EOF
            {
             newCompositeNode(grammarAccess.getDiskStateValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskStateValue=ruleDiskStateValue();

            state._fsp--;

             current =iv_ruleDiskStateValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiskStateValue"


    // $ANTLR start "ruleDiskStateValue"
    // InternalFactoryLangParser.g:2424:1: ruleDiskStateValue returns [EObject current=null] : ( (lv_value_0_0= ruleDISK_STATES ) ) ;
    public final EObject ruleDiskStateValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:2430:2: ( ( (lv_value_0_0= ruleDISK_STATES ) ) )
            // InternalFactoryLangParser.g:2431:2: ( (lv_value_0_0= ruleDISK_STATES ) )
            {
            // InternalFactoryLangParser.g:2431:2: ( (lv_value_0_0= ruleDISK_STATES ) )
            // InternalFactoryLangParser.g:2432:3: (lv_value_0_0= ruleDISK_STATES )
            {
            // InternalFactoryLangParser.g:2432:3: (lv_value_0_0= ruleDISK_STATES )
            // InternalFactoryLangParser.g:2433:4: lv_value_0_0= ruleDISK_STATES
            {

            				newCompositeNode(grammarAccess.getDiskStateValueAccess().getValueDISK_STATESEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDISK_STATES();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDiskStateValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"xtext.factoryLang.FactoryLang.DISK_STATES");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiskStateValue"


    // $ANTLR start "entryRuleDiskSlotStateValue"
    // InternalFactoryLangParser.g:2453:1: entryRuleDiskSlotStateValue returns [EObject current=null] : iv_ruleDiskSlotStateValue= ruleDiskSlotStateValue EOF ;
    public final EObject entryRuleDiskSlotStateValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskSlotStateValue = null;


        try {
            // InternalFactoryLangParser.g:2453:59: (iv_ruleDiskSlotStateValue= ruleDiskSlotStateValue EOF )
            // InternalFactoryLangParser.g:2454:2: iv_ruleDiskSlotStateValue= ruleDiskSlotStateValue EOF
            {
             newCompositeNode(grammarAccess.getDiskSlotStateValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskSlotStateValue=ruleDiskSlotStateValue();

            state._fsp--;

             current =iv_ruleDiskSlotStateValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiskSlotStateValue"


    // $ANTLR start "ruleDiskSlotStateValue"
    // InternalFactoryLangParser.g:2460:1: ruleDiskSlotStateValue returns [EObject current=null] : ( (lv_value_0_0= ruleDISK_SLOT_STATES ) ) ;
    public final EObject ruleDiskSlotStateValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:2466:2: ( ( (lv_value_0_0= ruleDISK_SLOT_STATES ) ) )
            // InternalFactoryLangParser.g:2467:2: ( (lv_value_0_0= ruleDISK_SLOT_STATES ) )
            {
            // InternalFactoryLangParser.g:2467:2: ( (lv_value_0_0= ruleDISK_SLOT_STATES ) )
            // InternalFactoryLangParser.g:2468:3: (lv_value_0_0= ruleDISK_SLOT_STATES )
            {
            // InternalFactoryLangParser.g:2468:3: (lv_value_0_0= ruleDISK_SLOT_STATES )
            // InternalFactoryLangParser.g:2469:4: lv_value_0_0= ruleDISK_SLOT_STATES
            {

            				newCompositeNode(grammarAccess.getDiskSlotStateValueAccess().getValueDISK_SLOT_STATESEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDISK_SLOT_STATES();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDiskSlotStateValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"xtext.factoryLang.FactoryLang.DISK_SLOT_STATES");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiskSlotStateValue"


    // $ANTLR start "entryRuleColorValue"
    // InternalFactoryLangParser.g:2489:1: entryRuleColorValue returns [EObject current=null] : iv_ruleColorValue= ruleColorValue EOF ;
    public final EObject entryRuleColorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorValue = null;


        try {
            // InternalFactoryLangParser.g:2489:51: (iv_ruleColorValue= ruleColorValue EOF )
            // InternalFactoryLangParser.g:2490:2: iv_ruleColorValue= ruleColorValue EOF
            {
             newCompositeNode(grammarAccess.getColorValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorValue=ruleColorValue();

            state._fsp--;

             current =iv_ruleColorValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColorValue"


    // $ANTLR start "ruleColorValue"
    // InternalFactoryLangParser.g:2496:1: ruleColorValue returns [EObject current=null] : ( (lv_value_0_0= ruleCOLOR ) ) ;
    public final EObject ruleColorValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalFactoryLangParser.g:2502:2: ( ( (lv_value_0_0= ruleCOLOR ) ) )
            // InternalFactoryLangParser.g:2503:2: ( (lv_value_0_0= ruleCOLOR ) )
            {
            // InternalFactoryLangParser.g:2503:2: ( (lv_value_0_0= ruleCOLOR ) )
            // InternalFactoryLangParser.g:2504:3: (lv_value_0_0= ruleCOLOR )
            {
            // InternalFactoryLangParser.g:2504:3: (lv_value_0_0= ruleCOLOR )
            // InternalFactoryLangParser.g:2505:4: lv_value_0_0= ruleCOLOR
            {

            				newCompositeNode(grammarAccess.getColorValueAccess().getValueCOLOREnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleCOLOR();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getColorValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"xtext.factoryLang.FactoryLang.COLOR");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorValue"


    // $ANTLR start "entryRuleNumber"
    // InternalFactoryLangParser.g:2525:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalFactoryLangParser.g:2525:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalFactoryLangParser.g:2526:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalFactoryLangParser.g:2532:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:2538:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalFactoryLangParser.g:2539:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalFactoryLangParser.g:2539:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalFactoryLangParser.g:2540:3: (lv_value_0_0= RULE_INT )
            {
            // InternalFactoryLangParser.g:2540:3: (lv_value_0_0= RULE_INT )
            // InternalFactoryLangParser.g:2541:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "ruleCOMPARISON_OPERATOR"
    // InternalFactoryLangParser.g:2560:1: ruleCOMPARISON_OPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= Undefined ) | (enumLiteral_1= LessThan ) | (enumLiteral_2= GreaterThan ) | (enumLiteral_3= Not ) ) ;
    public final Enumerator ruleCOMPARISON_OPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:2566:2: ( ( (enumLiteral_0= Undefined ) | (enumLiteral_1= LessThan ) | (enumLiteral_2= GreaterThan ) | (enumLiteral_3= Not ) ) )
            // InternalFactoryLangParser.g:2567:2: ( (enumLiteral_0= Undefined ) | (enumLiteral_1= LessThan ) | (enumLiteral_2= GreaterThan ) | (enumLiteral_3= Not ) )
            {
            // InternalFactoryLangParser.g:2567:2: ( (enumLiteral_0= Undefined ) | (enumLiteral_1= LessThan ) | (enumLiteral_2= GreaterThan ) | (enumLiteral_3= Not ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case Undefined:
                {
                alt23=1;
                }
                break;
            case LessThan:
                {
                alt23=2;
                }
                break;
            case GreaterThan:
                {
                alt23=3;
                }
                break;
            case Not:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalFactoryLangParser.g:2568:3: (enumLiteral_0= Undefined )
                    {
                    // InternalFactoryLangParser.g:2568:3: (enumLiteral_0= Undefined )
                    // InternalFactoryLangParser.g:2569:4: enumLiteral_0= Undefined
                    {
                    enumLiteral_0=(Token)match(input,Undefined,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPERATORAccess().getUNDEFINEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOMPARISON_OPERATORAccess().getUNDEFINEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFactoryLangParser.g:2576:3: (enumLiteral_1= LessThan )
                    {
                    // InternalFactoryLangParser.g:2576:3: (enumLiteral_1= LessThan )
                    // InternalFactoryLangParser.g:2577:4: enumLiteral_1= LessThan
                    {
                    enumLiteral_1=(Token)match(input,LessThan,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPERATORAccess().getLESS_THANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOMPARISON_OPERATORAccess().getLESS_THANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFactoryLangParser.g:2584:3: (enumLiteral_2= GreaterThan )
                    {
                    // InternalFactoryLangParser.g:2584:3: (enumLiteral_2= GreaterThan )
                    // InternalFactoryLangParser.g:2585:4: enumLiteral_2= GreaterThan
                    {
                    enumLiteral_2=(Token)match(input,GreaterThan,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPERATORAccess().getGREATER_THANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOMPARISON_OPERATORAccess().getGREATER_THANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFactoryLangParser.g:2592:3: (enumLiteral_3= Not )
                    {
                    // InternalFactoryLangParser.g:2592:3: (enumLiteral_3= Not )
                    // InternalFactoryLangParser.g:2593:4: enumLiteral_3= Not
                    {
                    enumLiteral_3=(Token)match(input,Not,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPERATORAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCOMPARISON_OPERATORAccess().getNOTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOMPARISON_OPERATOR"


    // $ANTLR start "ruleCOLOR"
    // InternalFactoryLangParser.g:2603:1: ruleCOLOR returns [Enumerator current=null] : ( (enumLiteral_0= Red ) | (enumLiteral_1= Green ) | (enumLiteral_2= Blue ) ) ;
    public final Enumerator ruleCOLOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:2609:2: ( ( (enumLiteral_0= Red ) | (enumLiteral_1= Green ) | (enumLiteral_2= Blue ) ) )
            // InternalFactoryLangParser.g:2610:2: ( (enumLiteral_0= Red ) | (enumLiteral_1= Green ) | (enumLiteral_2= Blue ) )
            {
            // InternalFactoryLangParser.g:2610:2: ( (enumLiteral_0= Red ) | (enumLiteral_1= Green ) | (enumLiteral_2= Blue ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case Red:
                {
                alt24=1;
                }
                break;
            case Green:
                {
                alt24=2;
                }
                break;
            case Blue:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalFactoryLangParser.g:2611:3: (enumLiteral_0= Red )
                    {
                    // InternalFactoryLangParser.g:2611:3: (enumLiteral_0= Red )
                    // InternalFactoryLangParser.g:2612:4: enumLiteral_0= Red
                    {
                    enumLiteral_0=(Token)match(input,Red,FOLLOW_2); 

                    				current = grammarAccess.getCOLORAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOLORAccess().getREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFactoryLangParser.g:2619:3: (enumLiteral_1= Green )
                    {
                    // InternalFactoryLangParser.g:2619:3: (enumLiteral_1= Green )
                    // InternalFactoryLangParser.g:2620:4: enumLiteral_1= Green
                    {
                    enumLiteral_1=(Token)match(input,Green,FOLLOW_2); 

                    				current = grammarAccess.getCOLORAccess().getGREENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOLORAccess().getGREENEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFactoryLangParser.g:2627:3: (enumLiteral_2= Blue )
                    {
                    // InternalFactoryLangParser.g:2627:3: (enumLiteral_2= Blue )
                    // InternalFactoryLangParser.g:2628:4: enumLiteral_2= Blue
                    {
                    enumLiteral_2=(Token)match(input,Blue,FOLLOW_2); 

                    				current = grammarAccess.getCOLORAccess().getBLUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOLORAccess().getBLUEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOLOR"


    // $ANTLR start "ruleDISK_SLOT_STATES"
    // InternalFactoryLangParser.g:2638:1: ruleDISK_SLOT_STATES returns [Enumerator current=null] : ( (enumLiteral_0= Free ) | (enumLiteral_1= In_progress ) | (enumLiteral_2= Complete ) ) ;
    public final Enumerator ruleDISK_SLOT_STATES() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:2644:2: ( ( (enumLiteral_0= Free ) | (enumLiteral_1= In_progress ) | (enumLiteral_2= Complete ) ) )
            // InternalFactoryLangParser.g:2645:2: ( (enumLiteral_0= Free ) | (enumLiteral_1= In_progress ) | (enumLiteral_2= Complete ) )
            {
            // InternalFactoryLangParser.g:2645:2: ( (enumLiteral_0= Free ) | (enumLiteral_1= In_progress ) | (enumLiteral_2= Complete ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case Free:
                {
                alt25=1;
                }
                break;
            case In_progress:
                {
                alt25=2;
                }
                break;
            case Complete:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalFactoryLangParser.g:2646:3: (enumLiteral_0= Free )
                    {
                    // InternalFactoryLangParser.g:2646:3: (enumLiteral_0= Free )
                    // InternalFactoryLangParser.g:2647:4: enumLiteral_0= Free
                    {
                    enumLiteral_0=(Token)match(input,Free,FOLLOW_2); 

                    				current = grammarAccess.getDISK_SLOT_STATESAccess().getFREEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDISK_SLOT_STATESAccess().getFREEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFactoryLangParser.g:2654:3: (enumLiteral_1= In_progress )
                    {
                    // InternalFactoryLangParser.g:2654:3: (enumLiteral_1= In_progress )
                    // InternalFactoryLangParser.g:2655:4: enumLiteral_1= In_progress
                    {
                    enumLiteral_1=(Token)match(input,In_progress,FOLLOW_2); 

                    				current = grammarAccess.getDISK_SLOT_STATESAccess().getIN_PROGRESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDISK_SLOT_STATESAccess().getIN_PROGRESSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFactoryLangParser.g:2662:3: (enumLiteral_2= Complete )
                    {
                    // InternalFactoryLangParser.g:2662:3: (enumLiteral_2= Complete )
                    // InternalFactoryLangParser.g:2663:4: enumLiteral_2= Complete
                    {
                    enumLiteral_2=(Token)match(input,Complete,FOLLOW_2); 

                    				current = grammarAccess.getDISK_SLOT_STATESAccess().getCOMPLETEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDISK_SLOT_STATESAccess().getCOMPLETEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDISK_SLOT_STATES"


    // $ANTLR start "ruleDISK_STATES"
    // InternalFactoryLangParser.g:2673:1: ruleDISK_STATES returns [Enumerator current=null] : ( (enumLiteral_0= Full ) | (enumLiteral_1= Empty ) ) ;
    public final Enumerator ruleDISK_STATES() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:2679:2: ( ( (enumLiteral_0= Full ) | (enumLiteral_1= Empty ) ) )
            // InternalFactoryLangParser.g:2680:2: ( (enumLiteral_0= Full ) | (enumLiteral_1= Empty ) )
            {
            // InternalFactoryLangParser.g:2680:2: ( (enumLiteral_0= Full ) | (enumLiteral_1= Empty ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Full) ) {
                alt26=1;
            }
            else if ( (LA26_0==Empty) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalFactoryLangParser.g:2681:3: (enumLiteral_0= Full )
                    {
                    // InternalFactoryLangParser.g:2681:3: (enumLiteral_0= Full )
                    // InternalFactoryLangParser.g:2682:4: enumLiteral_0= Full
                    {
                    enumLiteral_0=(Token)match(input,Full,FOLLOW_2); 

                    				current = grammarAccess.getDISK_STATESAccess().getFULLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDISK_STATESAccess().getFULLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFactoryLangParser.g:2689:3: (enumLiteral_1= Empty )
                    {
                    // InternalFactoryLangParser.g:2689:3: (enumLiteral_1= Empty )
                    // InternalFactoryLangParser.g:2690:4: enumLiteral_1= Empty
                    {
                    enumLiteral_1=(Token)match(input,Empty,FOLLOW_2); 

                    				current = grammarAccess.getDISK_STATESAccess().getEMPTYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDISK_STATESAccess().getEMPTYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDISK_STATES"


    // $ANTLR start "ruleTIME"
    // InternalFactoryLangParser.g:2700:1: ruleTIME returns [Enumerator current=null] : ( (enumLiteral_0= Seconds ) | (enumLiteral_1= Second ) | (enumLiteral_2= Minutes ) | (enumLiteral_3= Minute ) | (enumLiteral_4= Hours ) | (enumLiteral_5= Hour ) ) ;
    public final Enumerator ruleTIME() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalFactoryLangParser.g:2706:2: ( ( (enumLiteral_0= Seconds ) | (enumLiteral_1= Second ) | (enumLiteral_2= Minutes ) | (enumLiteral_3= Minute ) | (enumLiteral_4= Hours ) | (enumLiteral_5= Hour ) ) )
            // InternalFactoryLangParser.g:2707:2: ( (enumLiteral_0= Seconds ) | (enumLiteral_1= Second ) | (enumLiteral_2= Minutes ) | (enumLiteral_3= Minute ) | (enumLiteral_4= Hours ) | (enumLiteral_5= Hour ) )
            {
            // InternalFactoryLangParser.g:2707:2: ( (enumLiteral_0= Seconds ) | (enumLiteral_1= Second ) | (enumLiteral_2= Minutes ) | (enumLiteral_3= Minute ) | (enumLiteral_4= Hours ) | (enumLiteral_5= Hour ) )
            int alt27=6;
            switch ( input.LA(1) ) {
            case Seconds:
                {
                alt27=1;
                }
                break;
            case Second:
                {
                alt27=2;
                }
                break;
            case Minutes:
                {
                alt27=3;
                }
                break;
            case Minute:
                {
                alt27=4;
                }
                break;
            case Hours:
                {
                alt27=5;
                }
                break;
            case Hour:
                {
                alt27=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalFactoryLangParser.g:2708:3: (enumLiteral_0= Seconds )
                    {
                    // InternalFactoryLangParser.g:2708:3: (enumLiteral_0= Seconds )
                    // InternalFactoryLangParser.g:2709:4: enumLiteral_0= Seconds
                    {
                    enumLiteral_0=(Token)match(input,Seconds,FOLLOW_2); 

                    				current = grammarAccess.getTIMEAccess().getSECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTIMEAccess().getSECONDSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFactoryLangParser.g:2716:3: (enumLiteral_1= Second )
                    {
                    // InternalFactoryLangParser.g:2716:3: (enumLiteral_1= Second )
                    // InternalFactoryLangParser.g:2717:4: enumLiteral_1= Second
                    {
                    enumLiteral_1=(Token)match(input,Second,FOLLOW_2); 

                    				current = grammarAccess.getTIMEAccess().getSECONDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTIMEAccess().getSECONDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFactoryLangParser.g:2724:3: (enumLiteral_2= Minutes )
                    {
                    // InternalFactoryLangParser.g:2724:3: (enumLiteral_2= Minutes )
                    // InternalFactoryLangParser.g:2725:4: enumLiteral_2= Minutes
                    {
                    enumLiteral_2=(Token)match(input,Minutes,FOLLOW_2); 

                    				current = grammarAccess.getTIMEAccess().getMINUTESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTIMEAccess().getMINUTESEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFactoryLangParser.g:2732:3: (enumLiteral_3= Minute )
                    {
                    // InternalFactoryLangParser.g:2732:3: (enumLiteral_3= Minute )
                    // InternalFactoryLangParser.g:2733:4: enumLiteral_3= Minute
                    {
                    enumLiteral_3=(Token)match(input,Minute,FOLLOW_2); 

                    				current = grammarAccess.getTIMEAccess().getMINUTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTIMEAccess().getMINUTEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalFactoryLangParser.g:2740:3: (enumLiteral_4= Hours )
                    {
                    // InternalFactoryLangParser.g:2740:3: (enumLiteral_4= Hours )
                    // InternalFactoryLangParser.g:2741:4: enumLiteral_4= Hours
                    {
                    enumLiteral_4=(Token)match(input,Hours,FOLLOW_2); 

                    				current = grammarAccess.getTIMEAccess().getHOURSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTIMEAccess().getHOURSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalFactoryLangParser.g:2748:3: (enumLiteral_5= Hour )
                    {
                    // InternalFactoryLangParser.g:2748:3: (enumLiteral_5= Hour )
                    // InternalFactoryLangParser.g:2749:4: enumLiteral_5= Hour
                    {
                    enumLiteral_5=(Token)match(input,Hour,FOLLOW_2); 

                    				current = grammarAccess.getTIMEAccess().getHOUREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTIMEAccess().getHOUREnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTIME"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0408200000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0408200000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010204000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0200080000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001000008800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0405800108C00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0608200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0C01800188C00370L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0401000088800220L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000002010A3000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000010000000000L});

}