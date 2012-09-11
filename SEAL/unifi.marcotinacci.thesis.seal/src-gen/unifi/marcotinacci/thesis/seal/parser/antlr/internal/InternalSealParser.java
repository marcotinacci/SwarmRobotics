package unifi.marcotinacci.thesis.seal.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import unifi.marcotinacci.thesis.seal.services.SealGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSealParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_BOOL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'actions'", "'{'", "'}'", "'subject'", "'environment'", "'is empty'", "'ranges'", "','", "'.'", "'in'", "'['", "']'", "'delta'", "'='", "'module'", "';'", "'target'", "'never'", "'int'", "'float'", "'bool'", "'=>'", "'#'", "'<'", "'>'", "'noaction'", "'|{'", "'}|'", "'and'", "'or'", "'<='", "'=='", "'!='", "'>='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'not'", "'exists'", "':'", "'such that'", "'this'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_BOOL=7;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_FLOAT=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalSealParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSealParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSealParser.tokenNames; }
    public String getGrammarFileName() { return "../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g"; }



     	private SealGrammarAccess grammarAccess;
     	
        public InternalSealParser(TokenStream input, SealGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected SealGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:76:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'actions' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )+ otherlv_3= '}' otherlv_4= 'subject' ( (lv_modules_5_0= ruleModuleDefine ) ) ( (lv_modules_6_0= ruleModuleDefine ) )* otherlv_7= 'environment' ( ( (lv_environment_8_0= ruleEnvironment ) ) | ( (lv_isEmptyEnv_9_0= 'is empty' ) ) ) (otherlv_10= 'ranges' otherlv_11= '{' ( (lv_ranges_12_0= ruleRange ) ) (otherlv_13= ',' ( (lv_ranges_14_0= ruleRange ) ) )* otherlv_15= '}' )? ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token lv_isEmptyEnv_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_actions_2_0 = null;

        EObject lv_modules_5_0 = null;

        EObject lv_modules_6_0 = null;

        EObject lv_environment_8_0 = null;

        EObject lv_ranges_12_0 = null;

        EObject lv_ranges_14_0 = null;


         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:79:28: ( (otherlv_0= 'actions' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )+ otherlv_3= '}' otherlv_4= 'subject' ( (lv_modules_5_0= ruleModuleDefine ) ) ( (lv_modules_6_0= ruleModuleDefine ) )* otherlv_7= 'environment' ( ( (lv_environment_8_0= ruleEnvironment ) ) | ( (lv_isEmptyEnv_9_0= 'is empty' ) ) ) (otherlv_10= 'ranges' otherlv_11= '{' ( (lv_ranges_12_0= ruleRange ) ) (otherlv_13= ',' ( (lv_ranges_14_0= ruleRange ) ) )* otherlv_15= '}' )? ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:80:1: (otherlv_0= 'actions' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )+ otherlv_3= '}' otherlv_4= 'subject' ( (lv_modules_5_0= ruleModuleDefine ) ) ( (lv_modules_6_0= ruleModuleDefine ) )* otherlv_7= 'environment' ( ( (lv_environment_8_0= ruleEnvironment ) ) | ( (lv_isEmptyEnv_9_0= 'is empty' ) ) ) (otherlv_10= 'ranges' otherlv_11= '{' ( (lv_ranges_12_0= ruleRange ) ) (otherlv_13= ',' ( (lv_ranges_14_0= ruleRange ) ) )* otherlv_15= '}' )? )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:80:1: (otherlv_0= 'actions' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )+ otherlv_3= '}' otherlv_4= 'subject' ( (lv_modules_5_0= ruleModuleDefine ) ) ( (lv_modules_6_0= ruleModuleDefine ) )* otherlv_7= 'environment' ( ( (lv_environment_8_0= ruleEnvironment ) ) | ( (lv_isEmptyEnv_9_0= 'is empty' ) ) ) (otherlv_10= 'ranges' otherlv_11= '{' ( (lv_ranges_12_0= ruleRange ) ) (otherlv_13= ',' ( (lv_ranges_14_0= ruleRange ) ) )* otherlv_15= '}' )? )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:80:3: otherlv_0= 'actions' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )+ otherlv_3= '}' otherlv_4= 'subject' ( (lv_modules_5_0= ruleModuleDefine ) ) ( (lv_modules_6_0= ruleModuleDefine ) )* otherlv_7= 'environment' ( ( (lv_environment_8_0= ruleEnvironment ) ) | ( (lv_isEmptyEnv_9_0= 'is empty' ) ) ) (otherlv_10= 'ranges' otherlv_11= '{' ( (lv_ranges_12_0= ruleRange ) ) (otherlv_13= ',' ( (lv_ranges_14_0= ruleRange ) ) )* otherlv_15= '}' )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleProgram122); 

                	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getActionsKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleProgram134); 

                	newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1());
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:88:1: ( (lv_actions_2_0= ruleAction ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:89:1: (lv_actions_2_0= ruleAction )
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:89:1: (lv_actions_2_0= ruleAction )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:90:3: lv_actions_2_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getActionsActionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleProgram155);
            	    lv_actions_2_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_2_0, 
            	            		"Action");
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleProgram168); 

                	newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleProgram180); 

                	newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getSubjectKeyword_4());
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:114:1: ( (lv_modules_5_0= ruleModuleDefine ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:115:1: (lv_modules_5_0= ruleModuleDefine )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:115:1: (lv_modules_5_0= ruleModuleDefine )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:116:3: lv_modules_5_0= ruleModuleDefine
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getModulesModuleDefineParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleModuleDefine_in_ruleProgram201);
            lv_modules_5_0=ruleModuleDefine();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		add(
                   			current, 
                   			"modules",
                    		lv_modules_5_0, 
                    		"ModuleDefine");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:132:2: ( (lv_modules_6_0= ruleModuleDefine ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:133:1: (lv_modules_6_0= ruleModuleDefine )
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:133:1: (lv_modules_6_0= ruleModuleDefine )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:134:3: lv_modules_6_0= ruleModuleDefine
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getModulesModuleDefineParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModuleDefine_in_ruleProgram222);
            	    lv_modules_6_0=ruleModuleDefine();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modules",
            	            		lv_modules_6_0, 
            	            		"ModuleDefine");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleProgram235); 

                	newLeafNode(otherlv_7, grammarAccess.getProgramAccess().getEnvironmentKeyword_7());
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:154:1: ( ( (lv_environment_8_0= ruleEnvironment ) ) | ( (lv_isEmptyEnv_9_0= 'is empty' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:154:2: ( (lv_environment_8_0= ruleEnvironment ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:154:2: ( (lv_environment_8_0= ruleEnvironment ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:155:1: (lv_environment_8_0= ruleEnvironment )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:155:1: (lv_environment_8_0= ruleEnvironment )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:156:3: lv_environment_8_0= ruleEnvironment
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getEnvironmentEnvironmentParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnvironment_in_ruleProgram257);
                    lv_environment_8_0=ruleEnvironment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		set(
                           			current, 
                           			"environment",
                            		lv_environment_8_0, 
                            		"Environment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:173:6: ( (lv_isEmptyEnv_9_0= 'is empty' ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:173:6: ( (lv_isEmptyEnv_9_0= 'is empty' ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:174:1: (lv_isEmptyEnv_9_0= 'is empty' )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:174:1: (lv_isEmptyEnv_9_0= 'is empty' )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:175:3: lv_isEmptyEnv_9_0= 'is empty'
                    {
                    lv_isEmptyEnv_9_0=(Token)match(input,18,FOLLOW_18_in_ruleProgram281); 

                            newLeafNode(lv_isEmptyEnv_9_0, grammarAccess.getProgramAccess().getIsEmptyEnvIsEmptyKeyword_8_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProgramRule());
                    	        }
                           		setWithLastConsumed(current, "isEmptyEnv", true, "is empty");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:188:3: (otherlv_10= 'ranges' otherlv_11= '{' ( (lv_ranges_12_0= ruleRange ) ) (otherlv_13= ',' ( (lv_ranges_14_0= ruleRange ) ) )* otherlv_15= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:188:5: otherlv_10= 'ranges' otherlv_11= '{' ( (lv_ranges_12_0= ruleRange ) ) (otherlv_13= ',' ( (lv_ranges_14_0= ruleRange ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleProgram308); 

                        	newLeafNode(otherlv_10, grammarAccess.getProgramAccess().getRangesKeyword_9_0());
                        
                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleProgram320); 

                        	newLeafNode(otherlv_11, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:196:1: ( (lv_ranges_12_0= ruleRange ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:197:1: (lv_ranges_12_0= ruleRange )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:197:1: (lv_ranges_12_0= ruleRange )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:198:3: lv_ranges_12_0= ruleRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getRangesRangeParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRange_in_ruleProgram341);
                    lv_ranges_12_0=ruleRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		add(
                           			current, 
                           			"ranges",
                            		lv_ranges_12_0, 
                            		"Range");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:214:2: (otherlv_13= ',' ( (lv_ranges_14_0= ruleRange ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==20) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:214:4: otherlv_13= ',' ( (lv_ranges_14_0= ruleRange ) )
                    	    {
                    	    otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleProgram354); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getProgramAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:218:1: ( (lv_ranges_14_0= ruleRange ) )
                    	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:219:1: (lv_ranges_14_0= ruleRange )
                    	    {
                    	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:219:1: (lv_ranges_14_0= ruleRange )
                    	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:220:3: lv_ranges_14_0= ruleRange
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProgramAccess().getRangesRangeParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRange_in_ruleProgram375);
                    	    lv_ranges_14_0=ruleRange();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ranges",
                    	            		lv_ranges_14_0, 
                    	            		"Range");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleProgram389); 

                        	newLeafNode(otherlv_15, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9_4());
                        

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleRange"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:248:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:249:2: (iv_ruleRange= ruleRange EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:250:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange427);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange437); 

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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:257:1: ruleRange returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'in' otherlv_4= '[' ( (lv_from_5_0= ruleValue ) ) otherlv_6= ',' ( (lv_to_7_0= ruleValue ) ) otherlv_8= ']' (otherlv_9= 'delta' otherlv_10= '=' ( (lv_delta_11_0= ruleValue ) ) )? ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_from_5_0 = null;

        AntlrDatatypeRuleToken lv_to_7_0 = null;

        AntlrDatatypeRuleToken lv_delta_11_0 = null;


         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:260:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'in' otherlv_4= '[' ( (lv_from_5_0= ruleValue ) ) otherlv_6= ',' ( (lv_to_7_0= ruleValue ) ) otherlv_8= ']' (otherlv_9= 'delta' otherlv_10= '=' ( (lv_delta_11_0= ruleValue ) ) )? ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:261:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'in' otherlv_4= '[' ( (lv_from_5_0= ruleValue ) ) otherlv_6= ',' ( (lv_to_7_0= ruleValue ) ) otherlv_8= ']' (otherlv_9= 'delta' otherlv_10= '=' ( (lv_delta_11_0= ruleValue ) ) )? )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:261:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'in' otherlv_4= '[' ( (lv_from_5_0= ruleValue ) ) otherlv_6= ',' ( (lv_to_7_0= ruleValue ) ) otherlv_8= ']' (otherlv_9= 'delta' otherlv_10= '=' ( (lv_delta_11_0= ruleValue ) ) )? )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:261:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'in' otherlv_4= '[' ( (lv_from_5_0= ruleValue ) ) otherlv_6= ',' ( (lv_to_7_0= ruleValue ) ) otherlv_8= ']' (otherlv_9= 'delta' otherlv_10= '=' ( (lv_delta_11_0= ruleValue ) ) )?
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:261:2: ( (otherlv_0= RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:262:1: (otherlv_0= RULE_ID )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:262:1: (otherlv_0= RULE_ID )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:263:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRangeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRange482); 

            		newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getModuleModuleDefineCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleRange494); 

                	newLeafNode(otherlv_1, grammarAccess.getRangeAccess().getFullStopKeyword_1());
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:278:1: ( (otherlv_2= RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:279:1: (otherlv_2= RULE_ID )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:279:1: (otherlv_2= RULE_ID )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:280:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRangeRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRange514); 

            		newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getVariableVariableDeclarationCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleRange526); 

                	newLeafNode(otherlv_3, grammarAccess.getRangeAccess().getInKeyword_3());
                
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleRange538); 

                	newLeafNode(otherlv_4, grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_4());
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:299:1: ( (lv_from_5_0= ruleValue ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:300:1: (lv_from_5_0= ruleValue )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:300:1: (lv_from_5_0= ruleValue )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:301:3: lv_from_5_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getRangeAccess().getFromValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleRange559);
            lv_from_5_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRangeRule());
            	        }
                   		set(
                   			current, 
                   			"from",
                    		lv_from_5_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleRange571); 

                	newLeafNode(otherlv_6, grammarAccess.getRangeAccess().getCommaKeyword_6());
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:321:1: ( (lv_to_7_0= ruleValue ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:322:1: (lv_to_7_0= ruleValue )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:322:1: (lv_to_7_0= ruleValue )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:323:3: lv_to_7_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getRangeAccess().getToValueParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleRange592);
            lv_to_7_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRangeRule());
            	        }
                   		set(
                   			current, 
                   			"to",
                    		lv_to_7_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleRange604); 

                	newLeafNode(otherlv_8, grammarAccess.getRangeAccess().getRightSquareBracketKeyword_8());
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:343:1: (otherlv_9= 'delta' otherlv_10= '=' ( (lv_delta_11_0= ruleValue ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:343:3: otherlv_9= 'delta' otherlv_10= '=' ( (lv_delta_11_0= ruleValue ) )
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleRange617); 

                        	newLeafNode(otherlv_9, grammarAccess.getRangeAccess().getDeltaKeyword_9_0());
                        
                    otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleRange629); 

                        	newLeafNode(otherlv_10, grammarAccess.getRangeAccess().getEqualsSignKeyword_9_1());
                        
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:351:1: ( (lv_delta_11_0= ruleValue ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:352:1: (lv_delta_11_0= ruleValue )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:352:1: (lv_delta_11_0= ruleValue )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:353:3: lv_delta_11_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getRangeAccess().getDeltaValueParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleRange650);
                    lv_delta_11_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRangeRule());
                    	        }
                           		set(
                           			current, 
                           			"delta",
                            		lv_delta_11_0, 
                            		"Value");
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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleAction"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:377:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:378:2: (iv_ruleAction= ruleAction EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:379:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction688);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction698); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:386:1: ruleAction returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:389:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:390:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:390:1: ( (lv_name_0_0= RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:391:1: (lv_name_0_0= RULE_ID )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:391:1: (lv_name_0_0= RULE_ID )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:392:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction739); 

            			newLeafNode(lv_name_0_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleModuleDefine"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:416:1: entryRuleModuleDefine returns [EObject current=null] : iv_ruleModuleDefine= ruleModuleDefine EOF ;
    public final EObject entryRuleModuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleDefine = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:417:2: (iv_ruleModuleDefine= ruleModuleDefine EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:418:2: iv_ruleModuleDefine= ruleModuleDefine EOF
            {
             newCompositeNode(grammarAccess.getModuleDefineRule()); 
            pushFollow(FOLLOW_ruleModuleDefine_in_entryRuleModuleDefine779);
            iv_ruleModuleDefine=ruleModuleDefine();

            state._fsp--;

             current =iv_ruleModuleDefine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleDefine789); 

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
    // $ANTLR end "entryRuleModuleDefine"


    // $ANTLR start "ruleModuleDefine"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:425:1: ruleModuleDefine returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_variables_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )+ ( ( (lv_rules_5_0= ruleRule ) ) otherlv_6= ';' )+ (otherlv_7= 'target' otherlv_8= 'never' ( (lv_never_9_0= ruleExpression ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleModuleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_variables_3_0 = null;

        EObject lv_rules_5_0 = null;

        EObject lv_never_9_0 = null;


         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:428:28: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_variables_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )+ ( ( (lv_rules_5_0= ruleRule ) ) otherlv_6= ';' )+ (otherlv_7= 'target' otherlv_8= 'never' ( (lv_never_9_0= ruleExpression ) ) )* otherlv_10= '}' ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:429:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_variables_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )+ ( ( (lv_rules_5_0= ruleRule ) ) otherlv_6= ';' )+ (otherlv_7= 'target' otherlv_8= 'never' ( (lv_never_9_0= ruleExpression ) ) )* otherlv_10= '}' )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:429:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_variables_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )+ ( ( (lv_rules_5_0= ruleRule ) ) otherlv_6= ';' )+ (otherlv_7= 'target' otherlv_8= 'never' ( (lv_never_9_0= ruleExpression ) ) )* otherlv_10= '}' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:429:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_variables_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )+ ( ( (lv_rules_5_0= ruleRule ) ) otherlv_6= ';' )+ (otherlv_7= 'target' otherlv_8= 'never' ( (lv_never_9_0= ruleExpression ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleModuleDefine826); 

                	newLeafNode(otherlv_0, grammarAccess.getModuleDefineAccess().getModuleKeyword_0());
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:433:1: ( (lv_name_1_0= RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:434:1: (lv_name_1_0= RULE_ID )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:434:1: (lv_name_1_0= RULE_ID )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:435:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModuleDefine843); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModuleDefineAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModuleDefineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleModuleDefine860); 

                	newLeafNode(otherlv_2, grammarAccess.getModuleDefineAccess().getLeftCurlyBracketKeyword_2());
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:455:1: ( ( (lv_variables_3_0= ruleVariableDeclaration ) ) otherlv_4= ';' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=31 && LA7_0<=33)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:455:2: ( (lv_variables_3_0= ruleVariableDeclaration ) ) otherlv_4= ';'
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:455:2: ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:456:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:456:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:457:3: lv_variables_3_0= ruleVariableDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleDefineAccess().getVariablesVariableDeclarationParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleModuleDefine882);
            	    lv_variables_3_0=ruleVariableDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleDefineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_3_0, 
            	            		"VariableDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleModuleDefine894); 

            	        	newLeafNode(otherlv_4, grammarAccess.getModuleDefineAccess().getSemicolonKeyword_3_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:477:3: ( ( (lv_rules_5_0= ruleRule ) ) otherlv_6= ';' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_BOOL)||LA8_0==51||(LA8_0>=53 && LA8_0<=54)||LA8_0==57) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:477:4: ( (lv_rules_5_0= ruleRule ) ) otherlv_6= ';'
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:477:4: ( (lv_rules_5_0= ruleRule ) )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:478:1: (lv_rules_5_0= ruleRule )
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:478:1: (lv_rules_5_0= ruleRule )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:479:3: lv_rules_5_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleDefineAccess().getRulesRuleParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleModuleDefine918);
            	    lv_rules_5_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleDefineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_5_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleModuleDefine930); 

            	        	newLeafNode(otherlv_6, grammarAccess.getModuleDefineAccess().getSemicolonKeyword_4_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:499:3: (otherlv_7= 'target' otherlv_8= 'never' ( (lv_never_9_0= ruleExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:499:5: otherlv_7= 'target' otherlv_8= 'never' ( (lv_never_9_0= ruleExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleModuleDefine945); 

            	        	newLeafNode(otherlv_7, grammarAccess.getModuleDefineAccess().getTargetKeyword_5_0());
            	        
            	    otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleModuleDefine957); 

            	        	newLeafNode(otherlv_8, grammarAccess.getModuleDefineAccess().getNeverKeyword_5_1());
            	        
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:507:1: ( (lv_never_9_0= ruleExpression ) )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:508:1: (lv_never_9_0= ruleExpression )
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:508:1: (lv_never_9_0= ruleExpression )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:509:3: lv_never_9_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleDefineAccess().getNeverExpressionParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleModuleDefine978);
            	    lv_never_9_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleDefineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"never",
            	            		lv_never_9_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleModuleDefine992); 

                	newLeafNode(otherlv_10, grammarAccess.getModuleDefineAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleModuleDefine"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:537:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:538:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:539:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1028);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration1038); 

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:546:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:549:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:550:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:550:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:550:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:550:2: ( (lv_type_0_0= ruleType ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:551:1: (lv_type_0_0= ruleType )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:551:1: (lv_type_0_0= ruleType )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:552:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVariableDeclaration1084);
            lv_type_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:568:2: ( (lv_name_1_0= RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:569:1: (lv_name_1_0= RULE_ID )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:569:1: (lv_name_1_0= RULE_ID )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:570:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration1101); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleVariableDeclaration1118); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:590:1: ( (lv_expr_3_0= ruleExpression ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:591:1: (lv_expr_3_0= ruleExpression )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:591:1: (lv_expr_3_0= ruleExpression )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:592:3: lv_expr_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExprExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleVariableDeclaration1139);
            lv_expr_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_3_0, 
                    		"Expression");
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleType"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:616:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:617:2: (iv_ruleType= ruleType EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:618:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1175);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1185); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:625:1: ruleType returns [EObject current=null] : ( ( (lv_name_0_0= 'int' ) ) | ( (lv_name_1_0= 'float' ) ) | ( (lv_name_2_0= 'bool' ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:628:28: ( ( ( (lv_name_0_0= 'int' ) ) | ( (lv_name_1_0= 'float' ) ) | ( (lv_name_2_0= 'bool' ) ) ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:629:1: ( ( (lv_name_0_0= 'int' ) ) | ( (lv_name_1_0= 'float' ) ) | ( (lv_name_2_0= 'bool' ) ) )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:629:1: ( ( (lv_name_0_0= 'int' ) ) | ( (lv_name_1_0= 'float' ) ) | ( (lv_name_2_0= 'bool' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 32:
                {
                alt10=2;
                }
                break;
            case 33:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:629:2: ( (lv_name_0_0= 'int' ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:629:2: ( (lv_name_0_0= 'int' ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:630:1: (lv_name_0_0= 'int' )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:630:1: (lv_name_0_0= 'int' )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:631:3: lv_name_0_0= 'int'
                    {
                    lv_name_0_0=(Token)match(input,31,FOLLOW_31_in_ruleType1228); 

                            newLeafNode(lv_name_0_0, grammarAccess.getTypeAccess().getNameIntKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "int");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:645:6: ( (lv_name_1_0= 'float' ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:645:6: ( (lv_name_1_0= 'float' ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:646:1: (lv_name_1_0= 'float' )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:646:1: (lv_name_1_0= 'float' )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:647:3: lv_name_1_0= 'float'
                    {
                    lv_name_1_0=(Token)match(input,32,FOLLOW_32_in_ruleType1265); 

                            newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameFloatKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_1_0, "float");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:661:6: ( (lv_name_2_0= 'bool' ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:661:6: ( (lv_name_2_0= 'bool' ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:662:1: (lv_name_2_0= 'bool' )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:662:1: (lv_name_2_0= 'bool' )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:663:3: lv_name_2_0= 'bool'
                    {
                    lv_name_2_0=(Token)match(input,33,FOLLOW_33_in_ruleType1302); 

                            newLeafNode(lv_name_2_0, grammarAccess.getTypeAccess().getNameBoolKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_2_0, "bool");
                    	    

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleRule"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:684:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:685:2: (iv_ruleRule= ruleRule EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:686:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule1351);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule1361); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:693:1: ruleRule returns [EObject current=null] : ( ( (lv_cond_0_0= ruleExpression ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ( (lv_ndCases_4_0= ruleNDCase ) )+ ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_cond_0_0 = null;

        EObject lv_ndCases_4_0 = null;


         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:696:28: ( ( ( (lv_cond_0_0= ruleExpression ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ( (lv_ndCases_4_0= ruleNDCase ) )+ ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:697:1: ( ( (lv_cond_0_0= ruleExpression ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ( (lv_ndCases_4_0= ruleNDCase ) )+ )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:697:1: ( ( (lv_cond_0_0= ruleExpression ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ( (lv_ndCases_4_0= ruleNDCase ) )+ )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:697:2: ( (lv_cond_0_0= ruleExpression ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ( (lv_ndCases_4_0= ruleNDCase ) )+
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:697:2: ( (lv_cond_0_0= ruleExpression ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:698:1: (lv_cond_0_0= ruleExpression )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:698:1: (lv_cond_0_0= ruleExpression )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:699:3: lv_cond_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getCondExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleRule1407);
            lv_cond_0_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		set(
                   			current, 
                   			"cond",
                    		lv_cond_0_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleRule1419); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_1());
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:719:1: ( (otherlv_2= RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:720:1: (otherlv_2= RULE_ID )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:720:1: (otherlv_2= RULE_ID )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:721:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule1439); 

            		newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getActionActionCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleRule1451); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getRightSquareBracketKeyword_3());
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:736:1: ( (lv_ndCases_4_0= ruleNDCase ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:737:1: (lv_ndCases_4_0= ruleNDCase )
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:737:1: (lv_ndCases_4_0= ruleNDCase )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:738:3: lv_ndCases_4_0= ruleNDCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getNdCasesNDCaseParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNDCase_in_ruleRule1472);
            	    lv_ndCases_4_0=ruleNDCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ndCases",
            	            		lv_ndCases_4_0, 
            	            		"NDCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleNDCase"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:762:1: entryRuleNDCase returns [EObject current=null] : iv_ruleNDCase= ruleNDCase EOF ;
    public final EObject entryRuleNDCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNDCase = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:763:2: (iv_ruleNDCase= ruleNDCase EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:764:2: iv_ruleNDCase= ruleNDCase EOF
            {
             newCompositeNode(grammarAccess.getNDCaseRule()); 
            pushFollow(FOLLOW_ruleNDCase_in_entryRuleNDCase1509);
            iv_ruleNDCase=ruleNDCase();

            state._fsp--;

             current =iv_ruleNDCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNDCase1519); 

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
    // $ANTLR end "entryRuleNDCase"


    // $ANTLR start "ruleNDCase"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:771:1: ruleNDCase returns [EObject current=null] : (otherlv_0= '=>' ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '#' ( (lv_cases_3_0= ruleCase ) ) )* ) ;
    public final EObject ruleNDCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cases_1_0 = null;

        EObject lv_cases_3_0 = null;


         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:774:28: ( (otherlv_0= '=>' ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '#' ( (lv_cases_3_0= ruleCase ) ) )* ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:775:1: (otherlv_0= '=>' ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '#' ( (lv_cases_3_0= ruleCase ) ) )* )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:775:1: (otherlv_0= '=>' ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '#' ( (lv_cases_3_0= ruleCase ) ) )* )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:775:3: otherlv_0= '=>' ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '#' ( (lv_cases_3_0= ruleCase ) ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleNDCase1556); 

                	newLeafNode(otherlv_0, grammarAccess.getNDCaseAccess().getEqualsSignGreaterThanSignKeyword_0());
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:779:1: ( (lv_cases_1_0= ruleCase ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:780:1: (lv_cases_1_0= ruleCase )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:780:1: (lv_cases_1_0= ruleCase )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:781:3: lv_cases_1_0= ruleCase
            {
             
            	        newCompositeNode(grammarAccess.getNDCaseAccess().getCasesCaseParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCase_in_ruleNDCase1577);
            lv_cases_1_0=ruleCase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNDCaseRule());
            	        }
                   		add(
                   			current, 
                   			"cases",
                    		lv_cases_1_0, 
                    		"Case");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:797:2: (otherlv_2= '#' ( (lv_cases_3_0= ruleCase ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:797:4: otherlv_2= '#' ( (lv_cases_3_0= ruleCase ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleNDCase1590); 

            	        	newLeafNode(otherlv_2, grammarAccess.getNDCaseAccess().getNumberSignKeyword_2_0());
            	        
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:801:1: ( (lv_cases_3_0= ruleCase ) )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:802:1: (lv_cases_3_0= ruleCase )
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:802:1: (lv_cases_3_0= ruleCase )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:803:3: lv_cases_3_0= ruleCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNDCaseAccess().getCasesCaseParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCase_in_ruleNDCase1611);
            	    lv_cases_3_0=ruleCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNDCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cases",
            	            		lv_cases_3_0, 
            	            		"Case");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
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
    // $ANTLR end "ruleNDCase"


    // $ANTLR start "entryRuleCase"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:827:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:828:2: (iv_ruleCase= ruleCase EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:829:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase1649);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase1659); 

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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:836:1: ruleCase returns [EObject current=null] : (otherlv_0= '<' ( (lv_weight_1_0= ruleExpression ) ) ( ( (lv_hasCondition_2_0= ',' ) ) ( (lv_cond_3_0= ruleExpression ) ) )? otherlv_4= '>' ( (lv_update_5_0= ruleUpdate ) ) (otherlv_6= ',' ( (lv_update_7_0= ruleUpdate ) ) )* ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hasCondition_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_weight_1_0 = null;

        EObject lv_cond_3_0 = null;

        EObject lv_update_5_0 = null;

        EObject lv_update_7_0 = null;


         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:839:28: ( (otherlv_0= '<' ( (lv_weight_1_0= ruleExpression ) ) ( ( (lv_hasCondition_2_0= ',' ) ) ( (lv_cond_3_0= ruleExpression ) ) )? otherlv_4= '>' ( (lv_update_5_0= ruleUpdate ) ) (otherlv_6= ',' ( (lv_update_7_0= ruleUpdate ) ) )* ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:840:1: (otherlv_0= '<' ( (lv_weight_1_0= ruleExpression ) ) ( ( (lv_hasCondition_2_0= ',' ) ) ( (lv_cond_3_0= ruleExpression ) ) )? otherlv_4= '>' ( (lv_update_5_0= ruleUpdate ) ) (otherlv_6= ',' ( (lv_update_7_0= ruleUpdate ) ) )* )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:840:1: (otherlv_0= '<' ( (lv_weight_1_0= ruleExpression ) ) ( ( (lv_hasCondition_2_0= ',' ) ) ( (lv_cond_3_0= ruleExpression ) ) )? otherlv_4= '>' ( (lv_update_5_0= ruleUpdate ) ) (otherlv_6= ',' ( (lv_update_7_0= ruleUpdate ) ) )* )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:840:3: otherlv_0= '<' ( (lv_weight_1_0= ruleExpression ) ) ( ( (lv_hasCondition_2_0= ',' ) ) ( (lv_cond_3_0= ruleExpression ) ) )? otherlv_4= '>' ( (lv_update_5_0= ruleUpdate ) ) (otherlv_6= ',' ( (lv_update_7_0= ruleUpdate ) ) )*
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleCase1696); 

                	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getLessThanSignKeyword_0());
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:844:1: ( (lv_weight_1_0= ruleExpression ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:845:1: (lv_weight_1_0= ruleExpression )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:845:1: (lv_weight_1_0= ruleExpression )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:846:3: lv_weight_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getCaseAccess().getWeightExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCase1717);
            lv_weight_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	        }
                   		set(
                   			current, 
                   			"weight",
                    		lv_weight_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:862:2: ( ( (lv_hasCondition_2_0= ',' ) ) ( (lv_cond_3_0= ruleExpression ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:862:3: ( (lv_hasCondition_2_0= ',' ) ) ( (lv_cond_3_0= ruleExpression ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:862:3: ( (lv_hasCondition_2_0= ',' ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:863:1: (lv_hasCondition_2_0= ',' )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:863:1: (lv_hasCondition_2_0= ',' )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:864:3: lv_hasCondition_2_0= ','
                    {
                    lv_hasCondition_2_0=(Token)match(input,20,FOLLOW_20_in_ruleCase1736); 

                            newLeafNode(lv_hasCondition_2_0, grammarAccess.getCaseAccess().getHasConditionCommaKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCaseRule());
                    	        }
                           		setWithLastConsumed(current, "hasCondition", true, ",");
                    	    

                    }


                    }

                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:877:2: ( (lv_cond_3_0= ruleExpression ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:878:1: (lv_cond_3_0= ruleExpression )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:878:1: (lv_cond_3_0= ruleExpression )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:879:3: lv_cond_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getCaseAccess().getCondExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleCase1770);
                    lv_cond_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"cond",
                            		lv_cond_3_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleCase1784); 

                	newLeafNode(otherlv_4, grammarAccess.getCaseAccess().getGreaterThanSignKeyword_3());
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:899:1: ( (lv_update_5_0= ruleUpdate ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:900:1: (lv_update_5_0= ruleUpdate )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:900:1: (lv_update_5_0= ruleUpdate )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:901:3: lv_update_5_0= ruleUpdate
            {
             
            	        newCompositeNode(grammarAccess.getCaseAccess().getUpdateUpdateParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdate_in_ruleCase1805);
            lv_update_5_0=ruleUpdate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	        }
                   		add(
                   			current, 
                   			"update",
                    		lv_update_5_0, 
                    		"Update");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:917:2: (otherlv_6= ',' ( (lv_update_7_0= ruleUpdate ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:917:4: otherlv_6= ',' ( (lv_update_7_0= ruleUpdate ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleCase1818); 

            	        	newLeafNode(otherlv_6, grammarAccess.getCaseAccess().getCommaKeyword_5_0());
            	        
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:921:1: ( (lv_update_7_0= ruleUpdate ) )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:922:1: (lv_update_7_0= ruleUpdate )
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:922:1: (lv_update_7_0= ruleUpdate )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:923:3: lv_update_7_0= ruleUpdate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCaseAccess().getUpdateUpdateParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdate_in_ruleCase1839);
            	    lv_update_7_0=ruleUpdate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"update",
            	            		lv_update_7_0, 
            	            		"Update");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleUpdate"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:947:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:948:2: (iv_ruleUpdate= ruleUpdate EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:949:2: iv_ruleUpdate= ruleUpdate EOF
            {
             newCompositeNode(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_ruleUpdate_in_entryRuleUpdate1877);
            iv_ruleUpdate=ruleUpdate();

            state._fsp--;

             current =iv_ruleUpdate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdate1887); 

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
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:956:1: ruleUpdate returns [EObject current=null] : ( ( () otherlv_1= 'noaction' ) | ( () ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (lv_expr_5_0= ruleExpression ) ) ) ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expr_5_0 = null;


         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:959:28: ( ( ( () otherlv_1= 'noaction' ) | ( () ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (lv_expr_5_0= ruleExpression ) ) ) ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:960:1: ( ( () otherlv_1= 'noaction' ) | ( () ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (lv_expr_5_0= ruleExpression ) ) ) )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:960:1: ( ( () otherlv_1= 'noaction' ) | ( () ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (lv_expr_5_0= ruleExpression ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:960:2: ( () otherlv_1= 'noaction' )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:960:2: ( () otherlv_1= 'noaction' )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:960:3: () otherlv_1= 'noaction'
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:960:3: ()
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:961:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUpdateAccess().getNoActionAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleUpdate1934); 

                        	newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getNoactionKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:971:6: ( () ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (lv_expr_5_0= ruleExpression ) ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:971:6: ( () ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (lv_expr_5_0= ruleExpression ) ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:971:7: () ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (lv_expr_5_0= ruleExpression ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:971:7: ()
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:972:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUpdateAccess().getAssignAction_1_0(),
                                current);
                        

                    }

                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:977:2: ( (otherlv_3= RULE_ID ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:978:1: (otherlv_3= RULE_ID )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:978:1: (otherlv_3= RULE_ID )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:979:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUpdateRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdate1971); 

                    		newLeafNode(otherlv_3, grammarAccess.getUpdateAccess().getVariableVariableDeclarationCrossReference_1_1_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleUpdate1983); 

                        	newLeafNode(otherlv_4, grammarAccess.getUpdateAccess().getEqualsSignKeyword_1_2());
                        
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:994:1: ( (lv_expr_5_0= ruleExpression ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:995:1: (lv_expr_5_0= ruleExpression )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:995:1: (lv_expr_5_0= ruleExpression )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:996:3: lv_expr_5_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateAccess().getExprExpressionParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleUpdate2004);
                    lv_expr_5_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUpdateRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_5_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleEnvironment"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1020:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1021:2: (iv_ruleEnvironment= ruleEnvironment EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1022:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_ruleEnvironment_in_entryRuleEnvironment2041);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnvironment2051); 

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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1029:1: ruleEnvironment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}|' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1032:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}|' ( (otherlv_4= RULE_ID ) ) )* ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1033:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}|' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1033:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}|' ( (otherlv_4= RULE_ID ) ) )* )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1033:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}|' ( (otherlv_4= RULE_ID ) ) )*
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1033:2: ( (otherlv_0= RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1034:1: (otherlv_0= RULE_ID )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1034:1: (otherlv_0= RULE_ID )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1035:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEnvironmentRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnvironment2096); 

            		newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getModulesModuleDefineCrossReference_0_0()); 
            	

            }


            }

            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1046:2: (otherlv_1= '|{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}|' ( (otherlv_4= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==39) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1046:4: otherlv_1= '|{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}|' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleEnvironment2109); 

            	        	newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getVerticalLineLeftCurlyBracketKeyword_1_0());
            	        
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1050:1: ( (otherlv_2= RULE_ID ) )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==RULE_ID) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1051:1: (otherlv_2= RULE_ID )
            	    	    {
            	    	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1051:1: (otherlv_2= RULE_ID )
            	    	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1052:3: otherlv_2= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getEnvironmentRule());
            	    	    	        }
            	    	            
            	    	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnvironment2129); 

            	    	    		newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getActionsActionCrossReference_1_1_0()); 
            	    	    	

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt16 >= 1 ) break loop16;
            	                EarlyExitException eee =
            	                    new EarlyExitException(16, input);
            	                throw eee;
            	        }
            	        cnt16++;
            	    } while (true);

            	    otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleEnvironment2142); 

            	        	newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getRightCurlyBracketVerticalLineKeyword_1_2());
            	        
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1067:1: ( (otherlv_4= RULE_ID ) )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1068:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1068:1: (otherlv_4= RULE_ID )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1069:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEnvironmentRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnvironment2162); 

            	    		newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getModulesModuleDefineCrossReference_1_3_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleExpression"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1088:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1089:2: (iv_ruleExpression= ruleExpression EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1090:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2200);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2210); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1097:1: ruleExpression returns [EObject current=null] : this_Logical_0= ruleLogical ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Logical_0 = null;


         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1100:28: (this_Logical_0= ruleLogical )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1102:5: this_Logical_0= ruleLogical
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getLogicalParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleLogical_in_ruleExpression2256);
            this_Logical_0=ruleLogical();

            state._fsp--;

             
                    current = this_Logical_0; 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLogical"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1118:1: entryRuleLogical returns [EObject current=null] : iv_ruleLogical= ruleLogical EOF ;
    public final EObject entryRuleLogical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogical = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1119:2: (iv_ruleLogical= ruleLogical EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1120:2: iv_ruleLogical= ruleLogical EOF
            {
             newCompositeNode(grammarAccess.getLogicalRule()); 
            pushFollow(FOLLOW_ruleLogical_in_entryRuleLogical2290);
            iv_ruleLogical=ruleLogical();

            state._fsp--;

             current =iv_ruleLogical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogical2300); 

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
    // $ANTLR end "entryRuleLogical"


    // $ANTLR start "ruleLogical"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1127:1: ruleLogical returns [EObject current=null] : (this_Relation_0= ruleRelation ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleRelation ) ) )* ) ;
    public final EObject ruleLogical() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Relation_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1130:28: ( (this_Relation_0= ruleRelation ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleRelation ) ) )* ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1131:1: (this_Relation_0= ruleRelation ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleRelation ) ) )* )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1131:1: (this_Relation_0= ruleRelation ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleRelation ) ) )* )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1132:5: this_Relation_0= ruleRelation ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleRelation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogicalAccess().getRelationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleRelation_in_ruleLogical2347);
            this_Relation_0=ruleRelation();

            state._fsp--;

             
                    current = this_Relation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1140:1: ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleRelation ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=41 && LA19_0<=42)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1140:2: ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleRelation ) )
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1140:2: ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==41) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==42) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1140:3: ( () otherlv_2= 'and' )
            	            {
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1140:3: ( () otherlv_2= 'and' )
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1140:4: () otherlv_2= 'and'
            	            {
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1140:4: ()
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1141:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleLogical2370); 

            	                	newLeafNode(otherlv_2, grammarAccess.getLogicalAccess().getAndKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1151:6: ( () otherlv_4= 'or' )
            	            {
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1151:6: ( () otherlv_4= 'or' )
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1151:7: () otherlv_4= 'or'
            	            {
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1151:7: ()
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1152:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleLogical2399); 

            	                	newLeafNode(otherlv_4, grammarAccess.getLogicalAccess().getOrKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1161:3: ( (lv_right_5_0= ruleRelation ) )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1162:1: (lv_right_5_0= ruleRelation )
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1162:1: (lv_right_5_0= ruleRelation )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1163:3: lv_right_5_0= ruleRelation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalAccess().getRightRelationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelation_in_ruleLogical2422);
            	    lv_right_5_0=ruleRelation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"Relation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
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
    // $ANTLR end "ruleLogical"


    // $ANTLR start "entryRuleRelation"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1187:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1188:2: (iv_ruleRelation= ruleRelation EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1189:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation2460);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation2470); 

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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1196:1: ruleRelation returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '>=' ) | ( () otherlv_12= '>' ) ) ( (lv_right_13_0= ruleAddition ) ) )? ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_Addition_0 = null;

        EObject lv_right_13_0 = null;


         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1199:28: ( (this_Addition_0= ruleAddition ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '>=' ) | ( () otherlv_12= '>' ) ) ( (lv_right_13_0= ruleAddition ) ) )? ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1200:1: (this_Addition_0= ruleAddition ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '>=' ) | ( () otherlv_12= '>' ) ) ( (lv_right_13_0= ruleAddition ) ) )? )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1200:1: (this_Addition_0= ruleAddition ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '>=' ) | ( () otherlv_12= '>' ) ) ( (lv_right_13_0= ruleAddition ) ) )? )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1201:5: this_Addition_0= ruleAddition ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '>=' ) | ( () otherlv_12= '>' ) ) ( (lv_right_13_0= ruleAddition ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getRelationAccess().getAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleRelation2517);
            this_Addition_0=ruleAddition();

            state._fsp--;

             
                    current = this_Addition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1209:1: ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '>=' ) | ( () otherlv_12= '>' ) ) ( (lv_right_13_0= ruleAddition ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36||(LA21_0>=43 && LA21_0<=46)) ) {
                alt21=1;
            }
            else if ( (LA21_0==37) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==RULE_ID) ) {
                    int LA21_4 = input.LA(3);

                    if ( (LA21_4==EOF||LA21_4==15||(LA21_4>=20 && LA21_4<=21)||LA21_4==23||(LA21_4>=28 && LA21_4<=29)||(LA21_4>=34 && LA21_4<=35)||LA21_4==37||(LA21_4>=41 && LA21_4<=42)||(LA21_4>=47 && LA21_4<=50)||LA21_4==52) ) {
                        alt21=1;
                    }
                }
                else if ( ((LA21_2>=RULE_INT && LA21_2<=RULE_BOOL)||LA21_2==51||(LA21_2>=53 && LA21_2<=54)||LA21_2==57) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1209:2: ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '>=' ) | ( () otherlv_12= '>' ) ) ( (lv_right_13_0= ruleAddition ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1209:2: ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '>=' ) | ( () otherlv_12= '>' ) )
                    int alt20=6;
                    switch ( input.LA(1) ) {
                    case 43:
                        {
                        alt20=1;
                        }
                        break;
                    case 36:
                        {
                        alt20=2;
                        }
                        break;
                    case 44:
                        {
                        alt20=3;
                        }
                        break;
                    case 45:
                        {
                        alt20=4;
                        }
                        break;
                    case 46:
                        {
                        alt20=5;
                        }
                        break;
                    case 37:
                        {
                        alt20=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }

                    switch (alt20) {
                        case 1 :
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1209:3: ( () otherlv_2= '<=' )
                            {
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1209:3: ( () otherlv_2= '<=' )
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1209:4: () otherlv_2= '<='
                            {
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1209:4: ()
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1210:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0(),
                                        current);
                                

                            }

                            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleRelation2540); 

                                	newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_1_0_0_1());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1220:6: ( () otherlv_4= '<' )
                            {
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1220:6: ( () otherlv_4= '<' )
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1220:7: () otherlv_4= '<'
                            {
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1220:7: ()
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1221:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0(),
                                        current);
                                

                            }

                            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleRelation2569); 

                                	newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getLessThanSignKeyword_1_0_1_1());
                                

                            }


                            }
                            break;
                        case 3 :
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1231:6: ( () otherlv_6= '==' )
                            {
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1231:6: ( () otherlv_6= '==' )
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1231:7: () otherlv_6= '=='
                            {
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1231:7: ()
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1232:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0(),
                                        current);
                                

                            }

                            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleRelation2598); 

                                	newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_1_0_2_1());
                                

                            }


                            }
                            break;
                        case 4 :
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1242:6: ( () otherlv_8= '!=' )
                            {
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1242:6: ( () otherlv_8= '!=' )
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1242:7: () otherlv_8= '!='
                            {
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1242:7: ()
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1243:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0(),
                                        current);
                                

                            }

                            otherlv_8=(Token)match(input,45,FOLLOW_45_in_ruleRelation2627); 

                                	newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getExclamationMarkEqualsSignKeyword_1_0_3_1());
                                

                            }


                            }
                            break;
                        case 5 :
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1253:6: ( () otherlv_10= '>=' )
                            {
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1253:6: ( () otherlv_10= '>=' )
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1253:7: () otherlv_10= '>='
                            {
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1253:7: ()
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1254:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0(),
                                        current);
                                

                            }

                            otherlv_10=(Token)match(input,46,FOLLOW_46_in_ruleRelation2656); 

                                	newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_1_0_4_1());
                                

                            }


                            }
                            break;
                        case 6 :
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1264:6: ( () otherlv_12= '>' )
                            {
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1264:6: ( () otherlv_12= '>' )
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1264:7: () otherlv_12= '>'
                            {
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1264:7: ()
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1265:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0(),
                                        current);
                                

                            }

                            otherlv_12=(Token)match(input,37,FOLLOW_37_in_ruleRelation2685); 

                                	newLeafNode(otherlv_12, grammarAccess.getRelationAccess().getGreaterThanSignKeyword_1_0_5_1());
                                

                            }


                            }
                            break;

                    }

                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1274:3: ( (lv_right_13_0= ruleAddition ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1275:1: (lv_right_13_0= ruleAddition )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1275:1: (lv_right_13_0= ruleAddition )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1276:3: lv_right_13_0= ruleAddition
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddition_in_ruleRelation2708);
                    lv_right_13_0=ruleAddition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_13_0, 
                            		"Addition");
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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleAddition"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1300:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1301:2: (iv_ruleAddition= ruleAddition EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1302:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition2746);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition2756); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1309:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1312:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1313:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1313:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1314:5: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2803);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1322:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=47 && LA23_0<=48)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1322:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1322:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==47) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==48) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1322:3: ( () otherlv_2= '+' )
            	            {
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1322:3: ( () otherlv_2= '+' )
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1322:4: () otherlv_2= '+'
            	            {
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1322:4: ()
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1323:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleAddition2826); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1333:6: ( () otherlv_4= '-' )
            	            {
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1333:6: ( () otherlv_4= '-' )
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1333:7: () otherlv_4= '-'
            	            {
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1333:7: ()
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1334:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleAddition2855); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1343:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1344:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1344:1: (lv_right_5_0= ruleMultiplication )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1345:3: lv_right_5_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2878);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"Multiplication");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1369:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1370:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1371:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication2916);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication2926); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1378:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1381:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1382:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1382:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1383:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication2973);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;

             
                    current = this_PrimaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1391:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=49 && LA25_0<=50)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1391:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1391:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==49) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==50) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1391:3: ( () otherlv_2= '*' )
            	            {
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1391:3: ( () otherlv_2= '*' )
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1391:4: () otherlv_2= '*'
            	            {
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1391:4: ()
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1392:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleMultiplication2996); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1402:6: ( () otherlv_4= '/' )
            	            {
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1402:6: ( () otherlv_4= '/' )
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1402:7: () otherlv_4= '/'
            	            {
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1402:7: ()
            	            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1403:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleMultiplication3025); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1412:3: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1413:1: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1413:1: (lv_right_5_0= rulePrimaryExpression )
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1414:3: lv_right_5_0= rulePrimaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication3048);
            	    lv_right_5_0=rulePrimaryExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"PrimaryExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1438:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1439:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1440:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3086);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression3096); 

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1447:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_cond_5_0= rulePrimaryExpression ) ) ) | ( () ( (lv_value_7_0= ruleValue ) ) ) | ( () otherlv_9= 'exists' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'such that' ( (lv_cond_14_0= rulePrimaryExpression ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '.' ( (otherlv_18= RULE_ID ) ) ) | ( () (otherlv_20= 'this' otherlv_21= '.' )? ( (otherlv_22= RULE_ID ) ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject this_Expression_1 = null;

        EObject lv_cond_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;

        EObject lv_cond_14_0 = null;


         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1450:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_cond_5_0= rulePrimaryExpression ) ) ) | ( () ( (lv_value_7_0= ruleValue ) ) ) | ( () otherlv_9= 'exists' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'such that' ( (lv_cond_14_0= rulePrimaryExpression ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '.' ( (otherlv_18= RULE_ID ) ) ) | ( () (otherlv_20= 'this' otherlv_21= '.' )? ( (otherlv_22= RULE_ID ) ) ) ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1451:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_cond_5_0= rulePrimaryExpression ) ) ) | ( () ( (lv_value_7_0= ruleValue ) ) ) | ( () otherlv_9= 'exists' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'such that' ( (lv_cond_14_0= rulePrimaryExpression ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '.' ( (otherlv_18= RULE_ID ) ) ) | ( () (otherlv_20= 'this' otherlv_21= '.' )? ( (otherlv_22= RULE_ID ) ) ) )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1451:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_cond_5_0= rulePrimaryExpression ) ) ) | ( () ( (lv_value_7_0= ruleValue ) ) ) | ( () otherlv_9= 'exists' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'such that' ( (lv_cond_14_0= rulePrimaryExpression ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '.' ( (otherlv_18= RULE_ID ) ) ) | ( () (otherlv_20= 'this' otherlv_21= '.' )? ( (otherlv_22= RULE_ID ) ) ) )
            int alt27=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt27=1;
                }
                break;
            case 53:
                {
                alt27=2;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOL:
                {
                alt27=3;
                }
                break;
            case 54:
                {
                alt27=4;
                }
                break;
            case RULE_ID:
                {
                int LA27_5 = input.LA(2);

                if ( (LA27_5==EOF||LA27_5==15||LA27_5==20||LA27_5==23||(LA27_5>=28 && LA27_5<=29)||(LA27_5>=34 && LA27_5<=37)||(LA27_5>=41 && LA27_5<=50)||LA27_5==52) ) {
                    alt27=6;
                }
                else if ( (LA27_5==21) ) {
                    alt27=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 5, input);

                    throw nvae;
                }
                }
                break;
            case 57:
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
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1451:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1451:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1451:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,51,FOLLOW_51_in_rulePrimaryExpression3134); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression3156);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,52,FOLLOW_52_in_rulePrimaryExpression3167); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1469:6: ( () otherlv_4= 'not' ( (lv_cond_5_0= rulePrimaryExpression ) ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1469:6: ( () otherlv_4= 'not' ( (lv_cond_5_0= rulePrimaryExpression ) ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1469:7: () otherlv_4= 'not' ( (lv_cond_5_0= rulePrimaryExpression ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1469:7: ()
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1470:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,53,FOLLOW_53_in_rulePrimaryExpression3196); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getNotKeyword_1_1());
                        
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1479:1: ( (lv_cond_5_0= rulePrimaryExpression ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1480:1: (lv_cond_5_0= rulePrimaryExpression )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1480:1: (lv_cond_5_0= rulePrimaryExpression )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1481:3: lv_cond_5_0= rulePrimaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCondPrimaryExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryExpression_in_rulePrimaryExpression3217);
                    lv_cond_5_0=rulePrimaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"cond",
                            		lv_cond_5_0, 
                            		"PrimaryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1498:6: ( () ( (lv_value_7_0= ruleValue ) ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1498:6: ( () ( (lv_value_7_0= ruleValue ) ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1498:7: () ( (lv_value_7_0= ruleValue ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1498:7: ()
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1499:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getLiteralAction_2_0(),
                                current);
                        

                    }

                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1504:2: ( (lv_value_7_0= ruleValue ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1505:1: (lv_value_7_0= ruleValue )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1505:1: (lv_value_7_0= ruleValue )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1506:3: lv_value_7_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueValueParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_rulePrimaryExpression3255);
                    lv_value_7_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_7_0, 
                            		"Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1523:6: ( () otherlv_9= 'exists' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'such that' ( (lv_cond_14_0= rulePrimaryExpression ) ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1523:6: ( () otherlv_9= 'exists' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'such that' ( (lv_cond_14_0= rulePrimaryExpression ) ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1523:7: () otherlv_9= 'exists' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'such that' ( (lv_cond_14_0= rulePrimaryExpression ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1523:7: ()
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1524:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getQuantifierAction_3_0(),
                                current);
                        

                    }

                    otherlv_9=(Token)match(input,54,FOLLOW_54_in_rulePrimaryExpression3284); 

                        	newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getExistsKeyword_3_1());
                        
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1533:1: ( (lv_name_10_0= RULE_ID ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1534:1: (lv_name_10_0= RULE_ID )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1534:1: (lv_name_10_0= RULE_ID )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1535:3: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3301); 

                    			newLeafNode(lv_name_10_0, grammarAccess.getPrimaryExpressionAccess().getNameIDTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_10_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,55,FOLLOW_55_in_rulePrimaryExpression3318); 

                        	newLeafNode(otherlv_11, grammarAccess.getPrimaryExpressionAccess().getColonKeyword_3_3());
                        
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1555:1: ( (otherlv_12= RULE_ID ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1556:1: (otherlv_12= RULE_ID )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1556:1: (otherlv_12= RULE_ID )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1557:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3338); 

                    		newLeafNode(otherlv_12, grammarAccess.getPrimaryExpressionAccess().getModuleModuleDefineCrossReference_3_4_0()); 
                    	

                    }


                    }

                    otherlv_13=(Token)match(input,56,FOLLOW_56_in_rulePrimaryExpression3350); 

                        	newLeafNode(otherlv_13, grammarAccess.getPrimaryExpressionAccess().getSuchThatKeyword_3_5());
                        
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1572:1: ( (lv_cond_14_0= rulePrimaryExpression ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1573:1: (lv_cond_14_0= rulePrimaryExpression )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1573:1: (lv_cond_14_0= rulePrimaryExpression )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1574:3: lv_cond_14_0= rulePrimaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCondPrimaryExpressionParserRuleCall_3_6_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryExpression_in_rulePrimaryExpression3371);
                    lv_cond_14_0=rulePrimaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"cond",
                            		lv_cond_14_0, 
                            		"PrimaryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1591:6: ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '.' ( (otherlv_18= RULE_ID ) ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1591:6: ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '.' ( (otherlv_18= RULE_ID ) ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1591:7: () ( (otherlv_16= RULE_ID ) ) otherlv_17= '.' ( (otherlv_18= RULE_ID ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1591:7: ()
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1592:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getExternalReferenceAction_4_0(),
                                current);
                        

                    }

                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1597:2: ( (otherlv_16= RULE_ID ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1598:1: (otherlv_16= RULE_ID )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1598:1: (otherlv_16= RULE_ID )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1599:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3408); 

                    		newLeafNode(otherlv_16, grammarAccess.getPrimaryExpressionAccess().getModuleQuantifierCrossReference_4_1_0()); 
                    	

                    }


                    }

                    otherlv_17=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression3420); 

                        	newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_4_2());
                        
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1614:1: ( (otherlv_18= RULE_ID ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1615:1: (otherlv_18= RULE_ID )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1615:1: (otherlv_18= RULE_ID )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1616:3: otherlv_18= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                            
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3440); 

                    		newLeafNode(otherlv_18, grammarAccess.getPrimaryExpressionAccess().getVariableVariableDeclarationCrossReference_4_3_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1628:6: ( () (otherlv_20= 'this' otherlv_21= '.' )? ( (otherlv_22= RULE_ID ) ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1628:6: ( () (otherlv_20= 'this' otherlv_21= '.' )? ( (otherlv_22= RULE_ID ) ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1628:7: () (otherlv_20= 'this' otherlv_21= '.' )? ( (otherlv_22= RULE_ID ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1628:7: ()
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1629:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getLocalReferenceAction_5_0(),
                                current);
                        

                    }

                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1634:2: (otherlv_20= 'this' otherlv_21= '.' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==57) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1634:4: otherlv_20= 'this' otherlv_21= '.'
                            {
                            otherlv_20=(Token)match(input,57,FOLLOW_57_in_rulePrimaryExpression3470); 

                                	newLeafNode(otherlv_20, grammarAccess.getPrimaryExpressionAccess().getThisKeyword_5_1_0());
                                
                            otherlv_21=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression3482); 

                                	newLeafNode(otherlv_21, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_5_1_1());
                                

                            }
                            break;

                    }

                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1642:3: ( (otherlv_22= RULE_ID ) )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1643:1: (otherlv_22= RULE_ID )
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1643:1: (otherlv_22= RULE_ID )
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1644:3: otherlv_22= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                            
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3504); 

                    		newLeafNode(otherlv_22, grammarAccess.getPrimaryExpressionAccess().getVariableVariableDeclarationCrossReference_5_2_0()); 
                    	

                    }


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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleValue"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1663:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1664:2: (iv_ruleValue= ruleValue EOF )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1665:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue3542);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue3553); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1672:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT | this_BOOL_2= RULE_BOOL ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_FLOAT_1=null;
        Token this_BOOL_2=null;

         enterRule(); 
            
        try {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1675:28: ( (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT | this_BOOL_2= RULE_BOOL ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1676:1: (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT | this_BOOL_2= RULE_BOOL )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1676:1: (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT | this_BOOL_2= RULE_BOOL )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt28=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt28=2;
                }
                break;
            case RULE_BOOL:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1676:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue3593); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1684:10: this_FLOAT_1= RULE_FLOAT
                    {
                    this_FLOAT_1=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleValue3619); 

                    		current.merge(this_FLOAT_1);
                        
                     
                        newLeafNode(this_FLOAT_1, grammarAccess.getValueAccess().getFLOATTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1692:10: this_BOOL_2= RULE_BOOL
                    {
                    this_BOOL_2=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleValue3645); 

                    		current.merge(this_BOOL_2);
                        
                     
                        newLeafNode(this_BOOL_2, grammarAccess.getValueAccess().getBOOLTerminalRuleCall_2()); 
                        

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
    // $ANTLR end "ruleValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleProgram122 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProgram134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAction_in_ruleProgram155 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleProgram168 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProgram180 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleModuleDefine_in_ruleProgram201 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_ruleModuleDefine_in_ruleProgram222 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_17_in_ruleProgram235 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleEnvironment_in_ruleProgram257 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_18_in_ruleProgram281 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleProgram308 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProgram320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRange_in_ruleProgram341 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_20_in_ruleProgram354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRange_in_ruleProgram375 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15_in_ruleProgram389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRange482 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRange494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRange514 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRange526 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRange538 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleRange559 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRange571 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleRange592 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRange604 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleRange617 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRange629 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleRange650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleDefine_in_entryRuleModuleDefine779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleDefine789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleModuleDefine826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModuleDefine843 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModuleDefine860 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleModuleDefine882 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleModuleDefine894 = new BitSet(new long[]{0x02680003800000F0L});
    public static final BitSet FOLLOW_ruleRule_in_ruleModuleDefine918 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleModuleDefine930 = new BitSet(new long[]{0x02680000200080F0L});
    public static final BitSet FOLLOW_29_in_ruleModuleDefine945 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleModuleDefine957 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleModuleDefine978 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_15_in_ruleModuleDefine992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration1084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration1101 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleVariableDeclaration1118 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDeclaration1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleType1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleType1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleType1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule1351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRule1407 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRule1419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule1439 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRule1451 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleNDCase_in_ruleRule1472 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleNDCase_in_entryRuleNDCase1509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNDCase1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleNDCase1556 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleCase_in_ruleNDCase1577 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleNDCase1590 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleCase_in_ruleNDCase1611 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase1649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCase1696 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCase1717 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_20_in_ruleCase1736 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCase1770 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleCase1784 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_ruleUpdate_in_ruleCase1805 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleCase1818 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_ruleUpdate_in_ruleCase1839 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleUpdate_in_entryRuleUpdate1877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdate1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleUpdate1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdate1971 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleUpdate1983 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleUpdate2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironment_in_entryRuleEnvironment2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironment2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnvironment2096 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleEnvironment2109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnvironment2129 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_40_in_ruleEnvironment2142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnvironment2162 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_in_ruleExpression2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_in_entryRuleLogical2290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogical2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleLogical2347 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_ruleLogical2370 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_42_in_ruleLogical2399 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleLogical2422 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation2460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelation2517 = new BitSet(new long[]{0x0000783000000002L});
    public static final BitSet FOLLOW_43_in_ruleRelation2540 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_36_in_ruleRelation2569 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_44_in_ruleRelation2598 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_45_in_ruleRelation2627 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_46_in_ruleRelation2656 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_37_in_ruleRelation2685 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelation2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition2746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2803 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_47_in_ruleAddition2826 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_48_in_ruleAddition2855 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2878 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication2916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication2973 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_ruleMultiplication2996 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_50_in_ruleMultiplication3025 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication3048 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePrimaryExpression3134 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression3156 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_rulePrimaryExpression3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePrimaryExpression3196 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePrimaryExpression3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rulePrimaryExpression3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePrimaryExpression3284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3301 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_rulePrimaryExpression3318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3338 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression3350 = new BitSet(new long[]{0x02680000000000F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePrimaryExpression3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3408 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression3420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePrimaryExpression3470 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression3482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue3542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleValue3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleValue3645 = new BitSet(new long[]{0x0000000000000002L});

}