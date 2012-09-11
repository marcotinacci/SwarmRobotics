package unifi.marcotinacci.thesis.seal.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import unifi.marcotinacci.thesis.seal.services.SealGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSealParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_FLOAT", "RULE_BOOL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'actions'", "'{'", "'}'", "'subject'", "'environment'", "'ranges'", "','", "'.'", "'in'", "'['", "']'", "'delta'", "'='", "'module'", "';'", "'target'", "'never'", "'=>'", "'#'", "'<'", "'>'", "'noaction'", "'|{'", "'}|'", "'and'", "'or'", "'<='", "'=='", "'!='", "'>='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'not'", "'exists'", "':'", "'such that'", "'this'", "'is empty'", "'int'", "'float'", "'bool'"
    };
    public static final int RULE_ID=7;
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
    public static final int RULE_BOOL=6;
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
    public static final int RULE_INT=4;
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
    public static final int RULE_FLOAT=5;
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
    public String getGrammarFileName() { return "../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g"; }


     
     	private SealGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SealGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleProgram"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:61:1: ( ruleProgram EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:62:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:69:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:73:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:74:1: ( ( rule__Program__Group__0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:74:1: ( ( rule__Program__Group__0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:75:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:76:1: ( rule__Program__Group__0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:76:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram94);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleRange"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:88:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:89:1: ( ruleRange EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:90:1: ruleRange EOF
            {
             before(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange121);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:97:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:101:2: ( ( ( rule__Range__Group__0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:102:1: ( ( rule__Range__Group__0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:102:1: ( ( rule__Range__Group__0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:103:1: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:104:1: ( rule__Range__Group__0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:104:2: rule__Range__Group__0
            {
            pushFollow(FOLLOW_rule__Range__Group__0_in_ruleRange154);
            rule__Range__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleAction"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:116:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:117:1: ( ruleAction EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:118:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction181);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:125:1: ruleAction : ( ( rule__Action__NameAssignment ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:129:2: ( ( ( rule__Action__NameAssignment ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:130:1: ( ( rule__Action__NameAssignment ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:130:1: ( ( rule__Action__NameAssignment ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:131:1: ( rule__Action__NameAssignment )
            {
             before(grammarAccess.getActionAccess().getNameAssignment()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:132:1: ( rule__Action__NameAssignment )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:132:2: rule__Action__NameAssignment
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_in_ruleAction214);
            rule__Action__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleModuleDefine"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:144:1: entryRuleModuleDefine : ruleModuleDefine EOF ;
    public final void entryRuleModuleDefine() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:145:1: ( ruleModuleDefine EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:146:1: ruleModuleDefine EOF
            {
             before(grammarAccess.getModuleDefineRule()); 
            pushFollow(FOLLOW_ruleModuleDefine_in_entryRuleModuleDefine241);
            ruleModuleDefine();

            state._fsp--;

             after(grammarAccess.getModuleDefineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleDefine248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModuleDefine"


    // $ANTLR start "ruleModuleDefine"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:153:1: ruleModuleDefine : ( ( rule__ModuleDefine__Group__0 ) ) ;
    public final void ruleModuleDefine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:157:2: ( ( ( rule__ModuleDefine__Group__0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:158:1: ( ( rule__ModuleDefine__Group__0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:158:1: ( ( rule__ModuleDefine__Group__0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:159:1: ( rule__ModuleDefine__Group__0 )
            {
             before(grammarAccess.getModuleDefineAccess().getGroup()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:160:1: ( rule__ModuleDefine__Group__0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:160:2: rule__ModuleDefine__Group__0
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group__0_in_ruleModuleDefine274);
            rule__ModuleDefine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleDefineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModuleDefine"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:172:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:173:1: ( ruleVariableDeclaration EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:174:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration301);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:181:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:185:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:186:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:186:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:187:1: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:188:1: ( rule__VariableDeclaration__Group__0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:188:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration334);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleType"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:200:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:201:1: ( ruleType EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:202:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType361);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:209:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:213:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:214:1: ( ( rule__Type__Alternatives ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:214:1: ( ( rule__Type__Alternatives ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:215:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:216:1: ( rule__Type__Alternatives )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:216:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType394);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleRule"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:228:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:229:1: ( ruleRule EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:230:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule421);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:237:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:241:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:242:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:242:1: ( ( rule__Rule__Group__0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:243:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:244:1: ( rule__Rule__Group__0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:244:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule454);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleNDCase"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:256:1: entryRuleNDCase : ruleNDCase EOF ;
    public final void entryRuleNDCase() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:257:1: ( ruleNDCase EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:258:1: ruleNDCase EOF
            {
             before(grammarAccess.getNDCaseRule()); 
            pushFollow(FOLLOW_ruleNDCase_in_entryRuleNDCase481);
            ruleNDCase();

            state._fsp--;

             after(grammarAccess.getNDCaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNDCase488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNDCase"


    // $ANTLR start "ruleNDCase"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:265:1: ruleNDCase : ( ( rule__NDCase__Group__0 ) ) ;
    public final void ruleNDCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:269:2: ( ( ( rule__NDCase__Group__0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:270:1: ( ( rule__NDCase__Group__0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:270:1: ( ( rule__NDCase__Group__0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:271:1: ( rule__NDCase__Group__0 )
            {
             before(grammarAccess.getNDCaseAccess().getGroup()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:272:1: ( rule__NDCase__Group__0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:272:2: rule__NDCase__Group__0
            {
            pushFollow(FOLLOW_rule__NDCase__Group__0_in_ruleNDCase514);
            rule__NDCase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNDCaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNDCase"


    // $ANTLR start "entryRuleCase"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:284:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:285:1: ( ruleCase EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:286:1: ruleCase EOF
            {
             before(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase541);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getCaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:293:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:297:2: ( ( ( rule__Case__Group__0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:298:1: ( ( rule__Case__Group__0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:298:1: ( ( rule__Case__Group__0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:299:1: ( rule__Case__Group__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:300:1: ( rule__Case__Group__0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:300:2: rule__Case__Group__0
            {
            pushFollow(FOLLOW_rule__Case__Group__0_in_ruleCase574);
            rule__Case__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleUpdate"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:312:1: entryRuleUpdate : ruleUpdate EOF ;
    public final void entryRuleUpdate() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:313:1: ( ruleUpdate EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:314:1: ruleUpdate EOF
            {
             before(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_ruleUpdate_in_entryRuleUpdate601);
            ruleUpdate();

            state._fsp--;

             after(grammarAccess.getUpdateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdate608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:321:1: ruleUpdate : ( ( rule__Update__Alternatives ) ) ;
    public final void ruleUpdate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:325:2: ( ( ( rule__Update__Alternatives ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:326:1: ( ( rule__Update__Alternatives ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:326:1: ( ( rule__Update__Alternatives ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:327:1: ( rule__Update__Alternatives )
            {
             before(grammarAccess.getUpdateAccess().getAlternatives()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:328:1: ( rule__Update__Alternatives )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:328:2: rule__Update__Alternatives
            {
            pushFollow(FOLLOW_rule__Update__Alternatives_in_ruleUpdate634);
            rule__Update__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleEnvironment"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:340:1: entryRuleEnvironment : ruleEnvironment EOF ;
    public final void entryRuleEnvironment() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:341:1: ( ruleEnvironment EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:342:1: ruleEnvironment EOF
            {
             before(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_ruleEnvironment_in_entryRuleEnvironment661);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getEnvironmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnvironment668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:349:1: ruleEnvironment : ( ( rule__Environment__Group__0 ) ) ;
    public final void ruleEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:353:2: ( ( ( rule__Environment__Group__0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:354:1: ( ( rule__Environment__Group__0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:354:1: ( ( rule__Environment__Group__0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:355:1: ( rule__Environment__Group__0 )
            {
             before(grammarAccess.getEnvironmentAccess().getGroup()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:356:1: ( rule__Environment__Group__0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:356:2: rule__Environment__Group__0
            {
            pushFollow(FOLLOW_rule__Environment__Group__0_in_ruleEnvironment694);
            rule__Environment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleExpression"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:368:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:369:1: ( ruleExpression EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:370:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression721);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:377:1: ruleExpression : ( ruleLogical ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:381:2: ( ( ruleLogical ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:382:1: ( ruleLogical )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:382:1: ( ruleLogical )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:383:1: ruleLogical
            {
             before(grammarAccess.getExpressionAccess().getLogicalParserRuleCall()); 
            pushFollow(FOLLOW_ruleLogical_in_ruleExpression754);
            ruleLogical();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLogicalParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLogical"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:396:1: entryRuleLogical : ruleLogical EOF ;
    public final void entryRuleLogical() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:397:1: ( ruleLogical EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:398:1: ruleLogical EOF
            {
             before(grammarAccess.getLogicalRule()); 
            pushFollow(FOLLOW_ruleLogical_in_entryRuleLogical780);
            ruleLogical();

            state._fsp--;

             after(grammarAccess.getLogicalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogical787); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogical"


    // $ANTLR start "ruleLogical"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:405:1: ruleLogical : ( ( rule__Logical__Group__0 ) ) ;
    public final void ruleLogical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:409:2: ( ( ( rule__Logical__Group__0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:410:1: ( ( rule__Logical__Group__0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:410:1: ( ( rule__Logical__Group__0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:411:1: ( rule__Logical__Group__0 )
            {
             before(grammarAccess.getLogicalAccess().getGroup()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:412:1: ( rule__Logical__Group__0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:412:2: rule__Logical__Group__0
            {
            pushFollow(FOLLOW_rule__Logical__Group__0_in_ruleLogical813);
            rule__Logical__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogical"


    // $ANTLR start "entryRuleRelation"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:424:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:425:1: ( ruleRelation EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:426:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation840);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation847); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:433:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:437:2: ( ( ( rule__Relation__Group__0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:438:1: ( ( rule__Relation__Group__0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:438:1: ( ( rule__Relation__Group__0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:439:1: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:440:1: ( rule__Relation__Group__0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:440:2: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_rule__Relation__Group__0_in_ruleRelation873);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleAddition"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:452:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:453:1: ( ruleAddition EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:454:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition900);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition907); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:461:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:465:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:466:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:466:1: ( ( rule__Addition__Group__0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:467:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:468:1: ( rule__Addition__Group__0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:468:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition933);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:480:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:481:1: ( ruleMultiplication EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:482:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication960);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication967); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:489:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:493:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:494:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:494:1: ( ( rule__Multiplication__Group__0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:495:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:496:1: ( rule__Multiplication__Group__0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:496:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication993);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:508:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:509:1: ( rulePrimaryExpression EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:510:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1020);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1027); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:517:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:521:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:522:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:522:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:523:1: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:524:1: ( rule__PrimaryExpression__Alternatives )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:524:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1053);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleValue"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:536:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:537:1: ( ruleValue EOF )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:538:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1080);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1087); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:545:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:549:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:550:1: ( ( rule__Value__Alternatives ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:550:1: ( ( rule__Value__Alternatives ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:551:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:552:1: ( rule__Value__Alternatives )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:552:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue1113);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "rule__Program__Alternatives_8"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:564:1: rule__Program__Alternatives_8 : ( ( ( rule__Program__EnvironmentAssignment_8_0 ) ) | ( ( rule__Program__IsEmptyEnvAssignment_8_1 ) ) );
    public final void rule__Program__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:568:1: ( ( ( rule__Program__EnvironmentAssignment_8_0 ) ) | ( ( rule__Program__IsEmptyEnvAssignment_8_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==54) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:569:1: ( ( rule__Program__EnvironmentAssignment_8_0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:569:1: ( ( rule__Program__EnvironmentAssignment_8_0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:570:1: ( rule__Program__EnvironmentAssignment_8_0 )
                    {
                     before(grammarAccess.getProgramAccess().getEnvironmentAssignment_8_0()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:571:1: ( rule__Program__EnvironmentAssignment_8_0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:571:2: rule__Program__EnvironmentAssignment_8_0
                    {
                    pushFollow(FOLLOW_rule__Program__EnvironmentAssignment_8_0_in_rule__Program__Alternatives_81149);
                    rule__Program__EnvironmentAssignment_8_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgramAccess().getEnvironmentAssignment_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:575:6: ( ( rule__Program__IsEmptyEnvAssignment_8_1 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:575:6: ( ( rule__Program__IsEmptyEnvAssignment_8_1 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:576:1: ( rule__Program__IsEmptyEnvAssignment_8_1 )
                    {
                     before(grammarAccess.getProgramAccess().getIsEmptyEnvAssignment_8_1()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:577:1: ( rule__Program__IsEmptyEnvAssignment_8_1 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:577:2: rule__Program__IsEmptyEnvAssignment_8_1
                    {
                    pushFollow(FOLLOW_rule__Program__IsEmptyEnvAssignment_8_1_in_rule__Program__Alternatives_81167);
                    rule__Program__IsEmptyEnvAssignment_8_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgramAccess().getIsEmptyEnvAssignment_8_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Alternatives_8"


    // $ANTLR start "rule__Type__Alternatives"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:586:1: rule__Type__Alternatives : ( ( ( rule__Type__NameAssignment_0 ) ) | ( ( rule__Type__NameAssignment_1 ) ) | ( ( rule__Type__NameAssignment_2 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:590:1: ( ( ( rule__Type__NameAssignment_0 ) ) | ( ( rule__Type__NameAssignment_1 ) ) | ( ( rule__Type__NameAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt2=1;
                }
                break;
            case 56:
                {
                alt2=2;
                }
                break;
            case 57:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:591:1: ( ( rule__Type__NameAssignment_0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:591:1: ( ( rule__Type__NameAssignment_0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:592:1: ( rule__Type__NameAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getNameAssignment_0()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:593:1: ( rule__Type__NameAssignment_0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:593:2: rule__Type__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__NameAssignment_0_in_rule__Type__Alternatives1200);
                    rule__Type__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:597:6: ( ( rule__Type__NameAssignment_1 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:597:6: ( ( rule__Type__NameAssignment_1 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:598:1: ( rule__Type__NameAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:599:1: ( rule__Type__NameAssignment_1 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:599:2: rule__Type__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__NameAssignment_1_in_rule__Type__Alternatives1218);
                    rule__Type__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:603:6: ( ( rule__Type__NameAssignment_2 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:603:6: ( ( rule__Type__NameAssignment_2 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:604:1: ( rule__Type__NameAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getNameAssignment_2()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:605:1: ( rule__Type__NameAssignment_2 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:605:2: rule__Type__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Type__NameAssignment_2_in_rule__Type__Alternatives1236);
                    rule__Type__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getNameAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Update__Alternatives"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:614:1: rule__Update__Alternatives : ( ( ( rule__Update__Group_0__0 ) ) | ( ( rule__Update__Group_1__0 ) ) );
    public final void rule__Update__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:618:1: ( ( ( rule__Update__Group_0__0 ) ) | ( ( rule__Update__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:619:1: ( ( rule__Update__Group_0__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:619:1: ( ( rule__Update__Group_0__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:620:1: ( rule__Update__Group_0__0 )
                    {
                     before(grammarAccess.getUpdateAccess().getGroup_0()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:621:1: ( rule__Update__Group_0__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:621:2: rule__Update__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Update__Group_0__0_in_rule__Update__Alternatives1269);
                    rule__Update__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUpdateAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:625:6: ( ( rule__Update__Group_1__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:625:6: ( ( rule__Update__Group_1__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:626:1: ( rule__Update__Group_1__0 )
                    {
                     before(grammarAccess.getUpdateAccess().getGroup_1()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:627:1: ( rule__Update__Group_1__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:627:2: rule__Update__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Update__Group_1__0_in_rule__Update__Alternatives1287);
                    rule__Update__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUpdateAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Alternatives"


    // $ANTLR start "rule__Logical__Alternatives_1_0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:636:1: rule__Logical__Alternatives_1_0 : ( ( ( rule__Logical__Group_1_0_0__0 ) ) | ( ( rule__Logical__Group_1_0_1__0 ) ) );
    public final void rule__Logical__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:640:1: ( ( ( rule__Logical__Group_1_0_0__0 ) ) | ( ( rule__Logical__Group_1_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==37) ) {
                alt4=1;
            }
            else if ( (LA4_0==38) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:641:1: ( ( rule__Logical__Group_1_0_0__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:641:1: ( ( rule__Logical__Group_1_0_0__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:642:1: ( rule__Logical__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getLogicalAccess().getGroup_1_0_0()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:643:1: ( rule__Logical__Group_1_0_0__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:643:2: rule__Logical__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Logical__Group_1_0_0__0_in_rule__Logical__Alternatives_1_01320);
                    rule__Logical__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicalAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:647:6: ( ( rule__Logical__Group_1_0_1__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:647:6: ( ( rule__Logical__Group_1_0_1__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:648:1: ( rule__Logical__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getLogicalAccess().getGroup_1_0_1()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:649:1: ( rule__Logical__Group_1_0_1__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:649:2: rule__Logical__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Logical__Group_1_0_1__0_in_rule__Logical__Alternatives_1_01338);
                    rule__Logical__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicalAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Alternatives_1_0"


    // $ANTLR start "rule__Relation__Alternatives_1_0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:658:1: rule__Relation__Alternatives_1_0 : ( ( ( rule__Relation__Group_1_0_0__0 ) ) | ( ( rule__Relation__Group_1_0_1__0 ) ) | ( ( rule__Relation__Group_1_0_2__0 ) ) | ( ( rule__Relation__Group_1_0_3__0 ) ) | ( ( rule__Relation__Group_1_0_4__0 ) ) | ( ( rule__Relation__Group_1_0_5__0 ) ) );
    public final void rule__Relation__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:662:1: ( ( ( rule__Relation__Group_1_0_0__0 ) ) | ( ( rule__Relation__Group_1_0_1__0 ) ) | ( ( rule__Relation__Group_1_0_2__0 ) ) | ( ( rule__Relation__Group_1_0_3__0 ) ) | ( ( rule__Relation__Group_1_0_4__0 ) ) | ( ( rule__Relation__Group_1_0_5__0 ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 40:
                {
                alt5=3;
                }
                break;
            case 41:
                {
                alt5=4;
                }
                break;
            case 42:
                {
                alt5=5;
                }
                break;
            case 33:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:663:1: ( ( rule__Relation__Group_1_0_0__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:663:1: ( ( rule__Relation__Group_1_0_0__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:664:1: ( rule__Relation__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getRelationAccess().getGroup_1_0_0()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:665:1: ( rule__Relation__Group_1_0_0__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:665:2: rule__Relation__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Relation__Group_1_0_0__0_in_rule__Relation__Alternatives_1_01371);
                    rule__Relation__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:669:6: ( ( rule__Relation__Group_1_0_1__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:669:6: ( ( rule__Relation__Group_1_0_1__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:670:1: ( rule__Relation__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getRelationAccess().getGroup_1_0_1()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:671:1: ( rule__Relation__Group_1_0_1__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:671:2: rule__Relation__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Relation__Group_1_0_1__0_in_rule__Relation__Alternatives_1_01389);
                    rule__Relation__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:675:6: ( ( rule__Relation__Group_1_0_2__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:675:6: ( ( rule__Relation__Group_1_0_2__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:676:1: ( rule__Relation__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getRelationAccess().getGroup_1_0_2()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:677:1: ( rule__Relation__Group_1_0_2__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:677:2: rule__Relation__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Relation__Group_1_0_2__0_in_rule__Relation__Alternatives_1_01407);
                    rule__Relation__Group_1_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:681:6: ( ( rule__Relation__Group_1_0_3__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:681:6: ( ( rule__Relation__Group_1_0_3__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:682:1: ( rule__Relation__Group_1_0_3__0 )
                    {
                     before(grammarAccess.getRelationAccess().getGroup_1_0_3()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:683:1: ( rule__Relation__Group_1_0_3__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:683:2: rule__Relation__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_rule__Relation__Group_1_0_3__0_in_rule__Relation__Alternatives_1_01425);
                    rule__Relation__Group_1_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationAccess().getGroup_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:687:6: ( ( rule__Relation__Group_1_0_4__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:687:6: ( ( rule__Relation__Group_1_0_4__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:688:1: ( rule__Relation__Group_1_0_4__0 )
                    {
                     before(grammarAccess.getRelationAccess().getGroup_1_0_4()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:689:1: ( rule__Relation__Group_1_0_4__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:689:2: rule__Relation__Group_1_0_4__0
                    {
                    pushFollow(FOLLOW_rule__Relation__Group_1_0_4__0_in_rule__Relation__Alternatives_1_01443);
                    rule__Relation__Group_1_0_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationAccess().getGroup_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:693:6: ( ( rule__Relation__Group_1_0_5__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:693:6: ( ( rule__Relation__Group_1_0_5__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:694:1: ( rule__Relation__Group_1_0_5__0 )
                    {
                     before(grammarAccess.getRelationAccess().getGroup_1_0_5()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:695:1: ( rule__Relation__Group_1_0_5__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:695:2: rule__Relation__Group_1_0_5__0
                    {
                    pushFollow(FOLLOW_rule__Relation__Group_1_0_5__0_in_rule__Relation__Alternatives_1_01461);
                    rule__Relation__Group_1_0_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationAccess().getGroup_1_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Alternatives_1_0"


    // $ANTLR start "rule__Addition__Alternatives_1_0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:704:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:708:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==43) ) {
                alt6=1;
            }
            else if ( (LA6_0==44) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:709:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:709:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:710:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:711:1: ( rule__Addition__Group_1_0_0__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:711:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01494);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:715:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:715:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:716:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:717:1: ( rule__Addition__Group_1_0_1__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:717:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01512);
                    rule__Addition__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Alternatives_1_0"


    // $ANTLR start "rule__Multiplication__Alternatives_1_0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:726:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:730:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==45) ) {
                alt7=1;
            }
            else if ( (LA7_0==46) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:731:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:731:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:732:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:733:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:733:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_01545);
                    rule__Multiplication__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:737:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:737:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:738:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:739:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:739:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_01563);
                    rule__Multiplication__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Alternatives_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:748:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:752:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt8=1;
                }
                break;
            case 49:
                {
                alt8=2;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOL:
                {
                alt8=3;
                }
                break;
            case 50:
                {
                alt8=4;
                }
                break;
            case RULE_ID:
                {
                int LA8_5 = input.LA(2);

                if ( (LA8_5==20) ) {
                    alt8=5;
                }
                else if ( (LA8_5==EOF||LA8_5==15||LA8_5==19||LA8_5==22||(LA8_5>=27 && LA8_5<=28)||(LA8_5>=30 && LA8_5<=33)||(LA8_5>=37 && LA8_5<=46)||LA8_5==48) ) {
                    alt8=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 5, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:753:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:753:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:754:1: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:755:1: ( rule__PrimaryExpression__Group_0__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:755:2: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives1596);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:759:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:759:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:760:1: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:761:1: ( rule__PrimaryExpression__Group_1__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:761:2: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives1614);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:765:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:765:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:766:1: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:767:1: ( rule__PrimaryExpression__Group_2__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:767:2: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives1632);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:771:6: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:771:6: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:772:1: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:773:1: ( rule__PrimaryExpression__Group_3__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:773:2: rule__PrimaryExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__0_in_rule__PrimaryExpression__Alternatives1650);
                    rule__PrimaryExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:777:6: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:777:6: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:778:1: ( rule__PrimaryExpression__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:779:1: ( rule__PrimaryExpression__Group_4__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:779:2: rule__PrimaryExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_4__0_in_rule__PrimaryExpression__Alternatives1668);
                    rule__PrimaryExpression__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:783:6: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:783:6: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:784:1: ( rule__PrimaryExpression__Group_5__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_5()); 
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:785:1: ( rule__PrimaryExpression__Group_5__0 )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:785:2: rule__PrimaryExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__0_in_rule__PrimaryExpression__Alternatives1686);
                    rule__PrimaryExpression__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:794:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( RULE_FLOAT ) | ( RULE_BOOL ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:798:1: ( ( RULE_INT ) | ( RULE_FLOAT ) | ( RULE_BOOL ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt9=2;
                }
                break;
            case RULE_BOOL:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:799:1: ( RULE_INT )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:799:1: ( RULE_INT )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:800:1: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Value__Alternatives1719); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:805:6: ( RULE_FLOAT )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:805:6: ( RULE_FLOAT )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:806:1: RULE_FLOAT
                    {
                     before(grammarAccess.getValueAccess().getFLOATTerminalRuleCall_1()); 
                    match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Value__Alternatives1736); 
                     after(grammarAccess.getValueAccess().getFLOATTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:811:6: ( RULE_BOOL )
                    {
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:811:6: ( RULE_BOOL )
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:812:1: RULE_BOOL
                    {
                     before(grammarAccess.getValueAccess().getBOOLTerminalRuleCall_2()); 
                    match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__Value__Alternatives1753); 
                     after(grammarAccess.getValueAccess().getBOOLTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:824:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:828:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:829:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01783);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01786);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:836:1: rule__Program__Group__0__Impl : ( 'actions' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:840:1: ( ( 'actions' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:841:1: ( 'actions' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:841:1: ( 'actions' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:842:1: 'actions'
            {
             before(grammarAccess.getProgramAccess().getActionsKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Program__Group__0__Impl1814); 
             after(grammarAccess.getProgramAccess().getActionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:855:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:859:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:860:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11845);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11848);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:867:1: rule__Program__Group__1__Impl : ( '{' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:871:1: ( ( '{' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:872:1: ( '{' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:872:1: ( '{' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:873:1: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Program__Group__1__Impl1876); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:886:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:890:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:891:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21907);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__3_in_rule__Program__Group__21910);
            rule__Program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:898:1: rule__Program__Group__2__Impl : ( ( ( rule__Program__ActionsAssignment_2 ) ) ( ( rule__Program__ActionsAssignment_2 )* ) ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:902:1: ( ( ( ( rule__Program__ActionsAssignment_2 ) ) ( ( rule__Program__ActionsAssignment_2 )* ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:903:1: ( ( ( rule__Program__ActionsAssignment_2 ) ) ( ( rule__Program__ActionsAssignment_2 )* ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:903:1: ( ( ( rule__Program__ActionsAssignment_2 ) ) ( ( rule__Program__ActionsAssignment_2 )* ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:904:1: ( ( rule__Program__ActionsAssignment_2 ) ) ( ( rule__Program__ActionsAssignment_2 )* )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:904:1: ( ( rule__Program__ActionsAssignment_2 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:905:1: ( rule__Program__ActionsAssignment_2 )
            {
             before(grammarAccess.getProgramAccess().getActionsAssignment_2()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:906:1: ( rule__Program__ActionsAssignment_2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:906:2: rule__Program__ActionsAssignment_2
            {
            pushFollow(FOLLOW_rule__Program__ActionsAssignment_2_in_rule__Program__Group__2__Impl1939);
            rule__Program__ActionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getActionsAssignment_2()); 

            }

            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:909:1: ( ( rule__Program__ActionsAssignment_2 )* )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:910:1: ( rule__Program__ActionsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getActionsAssignment_2()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:911:1: ( rule__Program__ActionsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:911:2: rule__Program__ActionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Program__ActionsAssignment_2_in_rule__Program__Group__2__Impl1951);
            	    rule__Program__ActionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getActionsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:922:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:926:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:927:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__31984);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__4_in_rule__Program__Group__31987);
            rule__Program__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:934:1: rule__Program__Group__3__Impl : ( '}' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:938:1: ( ( '}' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:939:1: ( '}' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:939:1: ( '}' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:940:1: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Program__Group__3__Impl2015); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:953:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:957:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:958:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__42046);
            rule__Program__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__5_in_rule__Program__Group__42049);
            rule__Program__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:965:1: rule__Program__Group__4__Impl : ( 'subject' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:969:1: ( ( 'subject' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:970:1: ( 'subject' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:970:1: ( 'subject' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:971:1: 'subject'
            {
             before(grammarAccess.getProgramAccess().getSubjectKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Program__Group__4__Impl2077); 
             after(grammarAccess.getProgramAccess().getSubjectKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Program__Group__5"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:984:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:988:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:989:2: rule__Program__Group__5__Impl rule__Program__Group__6
            {
            pushFollow(FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__52108);
            rule__Program__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__6_in_rule__Program__Group__52111);
            rule__Program__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5"


    // $ANTLR start "rule__Program__Group__5__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:996:1: rule__Program__Group__5__Impl : ( ( rule__Program__ModulesAssignment_5 ) ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1000:1: ( ( ( rule__Program__ModulesAssignment_5 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1001:1: ( ( rule__Program__ModulesAssignment_5 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1001:1: ( ( rule__Program__ModulesAssignment_5 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1002:1: ( rule__Program__ModulesAssignment_5 )
            {
             before(grammarAccess.getProgramAccess().getModulesAssignment_5()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1003:1: ( rule__Program__ModulesAssignment_5 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1003:2: rule__Program__ModulesAssignment_5
            {
            pushFollow(FOLLOW_rule__Program__ModulesAssignment_5_in_rule__Program__Group__5__Impl2138);
            rule__Program__ModulesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getModulesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5__Impl"


    // $ANTLR start "rule__Program__Group__6"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1013:1: rule__Program__Group__6 : rule__Program__Group__6__Impl rule__Program__Group__7 ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1017:1: ( rule__Program__Group__6__Impl rule__Program__Group__7 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1018:2: rule__Program__Group__6__Impl rule__Program__Group__7
            {
            pushFollow(FOLLOW_rule__Program__Group__6__Impl_in_rule__Program__Group__62168);
            rule__Program__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__7_in_rule__Program__Group__62171);
            rule__Program__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__6"


    // $ANTLR start "rule__Program__Group__6__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1025:1: rule__Program__Group__6__Impl : ( ( rule__Program__ModulesAssignment_6 )* ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1029:1: ( ( ( rule__Program__ModulesAssignment_6 )* ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1030:1: ( ( rule__Program__ModulesAssignment_6 )* )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1030:1: ( ( rule__Program__ModulesAssignment_6 )* )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1031:1: ( rule__Program__ModulesAssignment_6 )*
            {
             before(grammarAccess.getProgramAccess().getModulesAssignment_6()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1032:1: ( rule__Program__ModulesAssignment_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1032:2: rule__Program__ModulesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Program__ModulesAssignment_6_in_rule__Program__Group__6__Impl2198);
            	    rule__Program__ModulesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getModulesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__6__Impl"


    // $ANTLR start "rule__Program__Group__7"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1042:1: rule__Program__Group__7 : rule__Program__Group__7__Impl rule__Program__Group__8 ;
    public final void rule__Program__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1046:1: ( rule__Program__Group__7__Impl rule__Program__Group__8 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1047:2: rule__Program__Group__7__Impl rule__Program__Group__8
            {
            pushFollow(FOLLOW_rule__Program__Group__7__Impl_in_rule__Program__Group__72229);
            rule__Program__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__8_in_rule__Program__Group__72232);
            rule__Program__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__7"


    // $ANTLR start "rule__Program__Group__7__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1054:1: rule__Program__Group__7__Impl : ( 'environment' ) ;
    public final void rule__Program__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1058:1: ( ( 'environment' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1059:1: ( 'environment' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1059:1: ( 'environment' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1060:1: 'environment'
            {
             before(grammarAccess.getProgramAccess().getEnvironmentKeyword_7()); 
            match(input,17,FOLLOW_17_in_rule__Program__Group__7__Impl2260); 
             after(grammarAccess.getProgramAccess().getEnvironmentKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__7__Impl"


    // $ANTLR start "rule__Program__Group__8"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1073:1: rule__Program__Group__8 : rule__Program__Group__8__Impl rule__Program__Group__9 ;
    public final void rule__Program__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1077:1: ( rule__Program__Group__8__Impl rule__Program__Group__9 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1078:2: rule__Program__Group__8__Impl rule__Program__Group__9
            {
            pushFollow(FOLLOW_rule__Program__Group__8__Impl_in_rule__Program__Group__82291);
            rule__Program__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__9_in_rule__Program__Group__82294);
            rule__Program__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__8"


    // $ANTLR start "rule__Program__Group__8__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1085:1: rule__Program__Group__8__Impl : ( ( rule__Program__Alternatives_8 ) ) ;
    public final void rule__Program__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1089:1: ( ( ( rule__Program__Alternatives_8 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1090:1: ( ( rule__Program__Alternatives_8 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1090:1: ( ( rule__Program__Alternatives_8 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1091:1: ( rule__Program__Alternatives_8 )
            {
             before(grammarAccess.getProgramAccess().getAlternatives_8()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1092:1: ( rule__Program__Alternatives_8 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1092:2: rule__Program__Alternatives_8
            {
            pushFollow(FOLLOW_rule__Program__Alternatives_8_in_rule__Program__Group__8__Impl2321);
            rule__Program__Alternatives_8();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getAlternatives_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__8__Impl"


    // $ANTLR start "rule__Program__Group__9"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1102:1: rule__Program__Group__9 : rule__Program__Group__9__Impl ;
    public final void rule__Program__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1106:1: ( rule__Program__Group__9__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1107:2: rule__Program__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__9__Impl_in_rule__Program__Group__92351);
            rule__Program__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__9"


    // $ANTLR start "rule__Program__Group__9__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1113:1: rule__Program__Group__9__Impl : ( ( rule__Program__Group_9__0 )? ) ;
    public final void rule__Program__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1117:1: ( ( ( rule__Program__Group_9__0 )? ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1118:1: ( ( rule__Program__Group_9__0 )? )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1118:1: ( ( rule__Program__Group_9__0 )? )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1119:1: ( rule__Program__Group_9__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_9()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1120:1: ( rule__Program__Group_9__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1120:2: rule__Program__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_9__0_in_rule__Program__Group__9__Impl2378);
                    rule__Program__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__9__Impl"


    // $ANTLR start "rule__Program__Group_9__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1150:1: rule__Program__Group_9__0 : rule__Program__Group_9__0__Impl rule__Program__Group_9__1 ;
    public final void rule__Program__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1154:1: ( rule__Program__Group_9__0__Impl rule__Program__Group_9__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1155:2: rule__Program__Group_9__0__Impl rule__Program__Group_9__1
            {
            pushFollow(FOLLOW_rule__Program__Group_9__0__Impl_in_rule__Program__Group_9__02429);
            rule__Program__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_9__1_in_rule__Program__Group_9__02432);
            rule__Program__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__0"


    // $ANTLR start "rule__Program__Group_9__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1162:1: rule__Program__Group_9__0__Impl : ( 'ranges' ) ;
    public final void rule__Program__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1166:1: ( ( 'ranges' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1167:1: ( 'ranges' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1167:1: ( 'ranges' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1168:1: 'ranges'
            {
             before(grammarAccess.getProgramAccess().getRangesKeyword_9_0()); 
            match(input,18,FOLLOW_18_in_rule__Program__Group_9__0__Impl2460); 
             after(grammarAccess.getProgramAccess().getRangesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__0__Impl"


    // $ANTLR start "rule__Program__Group_9__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1181:1: rule__Program__Group_9__1 : rule__Program__Group_9__1__Impl rule__Program__Group_9__2 ;
    public final void rule__Program__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1185:1: ( rule__Program__Group_9__1__Impl rule__Program__Group_9__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1186:2: rule__Program__Group_9__1__Impl rule__Program__Group_9__2
            {
            pushFollow(FOLLOW_rule__Program__Group_9__1__Impl_in_rule__Program__Group_9__12491);
            rule__Program__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_9__2_in_rule__Program__Group_9__12494);
            rule__Program__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__1"


    // $ANTLR start "rule__Program__Group_9__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1193:1: rule__Program__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Program__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1197:1: ( ( '{' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1198:1: ( '{' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1198:1: ( '{' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1199:1: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,14,FOLLOW_14_in_rule__Program__Group_9__1__Impl2522); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__1__Impl"


    // $ANTLR start "rule__Program__Group_9__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1212:1: rule__Program__Group_9__2 : rule__Program__Group_9__2__Impl rule__Program__Group_9__3 ;
    public final void rule__Program__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1216:1: ( rule__Program__Group_9__2__Impl rule__Program__Group_9__3 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1217:2: rule__Program__Group_9__2__Impl rule__Program__Group_9__3
            {
            pushFollow(FOLLOW_rule__Program__Group_9__2__Impl_in_rule__Program__Group_9__22553);
            rule__Program__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_9__3_in_rule__Program__Group_9__22556);
            rule__Program__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__2"


    // $ANTLR start "rule__Program__Group_9__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1224:1: rule__Program__Group_9__2__Impl : ( ( rule__Program__RangesAssignment_9_2 ) ) ;
    public final void rule__Program__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1228:1: ( ( ( rule__Program__RangesAssignment_9_2 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1229:1: ( ( rule__Program__RangesAssignment_9_2 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1229:1: ( ( rule__Program__RangesAssignment_9_2 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1230:1: ( rule__Program__RangesAssignment_9_2 )
            {
             before(grammarAccess.getProgramAccess().getRangesAssignment_9_2()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1231:1: ( rule__Program__RangesAssignment_9_2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1231:2: rule__Program__RangesAssignment_9_2
            {
            pushFollow(FOLLOW_rule__Program__RangesAssignment_9_2_in_rule__Program__Group_9__2__Impl2583);
            rule__Program__RangesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getRangesAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__2__Impl"


    // $ANTLR start "rule__Program__Group_9__3"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1241:1: rule__Program__Group_9__3 : rule__Program__Group_9__3__Impl rule__Program__Group_9__4 ;
    public final void rule__Program__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1245:1: ( rule__Program__Group_9__3__Impl rule__Program__Group_9__4 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1246:2: rule__Program__Group_9__3__Impl rule__Program__Group_9__4
            {
            pushFollow(FOLLOW_rule__Program__Group_9__3__Impl_in_rule__Program__Group_9__32613);
            rule__Program__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_9__4_in_rule__Program__Group_9__32616);
            rule__Program__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__3"


    // $ANTLR start "rule__Program__Group_9__3__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1253:1: rule__Program__Group_9__3__Impl : ( ( rule__Program__Group_9_3__0 )* ) ;
    public final void rule__Program__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1257:1: ( ( ( rule__Program__Group_9_3__0 )* ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1258:1: ( ( rule__Program__Group_9_3__0 )* )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1258:1: ( ( rule__Program__Group_9_3__0 )* )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1259:1: ( rule__Program__Group_9_3__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_9_3()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1260:1: ( rule__Program__Group_9_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1260:2: rule__Program__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_9_3__0_in_rule__Program__Group_9__3__Impl2643);
            	    rule__Program__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__3__Impl"


    // $ANTLR start "rule__Program__Group_9__4"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1270:1: rule__Program__Group_9__4 : rule__Program__Group_9__4__Impl ;
    public final void rule__Program__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1274:1: ( rule__Program__Group_9__4__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1275:2: rule__Program__Group_9__4__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_9__4__Impl_in_rule__Program__Group_9__42674);
            rule__Program__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__4"


    // $ANTLR start "rule__Program__Group_9__4__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1281:1: rule__Program__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Program__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1285:1: ( ( '}' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1286:1: ( '}' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1286:1: ( '}' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1287:1: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,15,FOLLOW_15_in_rule__Program__Group_9__4__Impl2702); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9__4__Impl"


    // $ANTLR start "rule__Program__Group_9_3__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1310:1: rule__Program__Group_9_3__0 : rule__Program__Group_9_3__0__Impl rule__Program__Group_9_3__1 ;
    public final void rule__Program__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1314:1: ( rule__Program__Group_9_3__0__Impl rule__Program__Group_9_3__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1315:2: rule__Program__Group_9_3__0__Impl rule__Program__Group_9_3__1
            {
            pushFollow(FOLLOW_rule__Program__Group_9_3__0__Impl_in_rule__Program__Group_9_3__02743);
            rule__Program__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_9_3__1_in_rule__Program__Group_9_3__02746);
            rule__Program__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9_3__0"


    // $ANTLR start "rule__Program__Group_9_3__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1322:1: rule__Program__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1326:1: ( ( ',' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1327:1: ( ',' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1327:1: ( ',' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1328:1: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_9_3_0()); 
            match(input,19,FOLLOW_19_in_rule__Program__Group_9_3__0__Impl2774); 
             after(grammarAccess.getProgramAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9_3__0__Impl"


    // $ANTLR start "rule__Program__Group_9_3__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1341:1: rule__Program__Group_9_3__1 : rule__Program__Group_9_3__1__Impl ;
    public final void rule__Program__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1345:1: ( rule__Program__Group_9_3__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1346:2: rule__Program__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_9_3__1__Impl_in_rule__Program__Group_9_3__12805);
            rule__Program__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9_3__1"


    // $ANTLR start "rule__Program__Group_9_3__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1352:1: rule__Program__Group_9_3__1__Impl : ( ( rule__Program__RangesAssignment_9_3_1 ) ) ;
    public final void rule__Program__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1356:1: ( ( ( rule__Program__RangesAssignment_9_3_1 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1357:1: ( ( rule__Program__RangesAssignment_9_3_1 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1357:1: ( ( rule__Program__RangesAssignment_9_3_1 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1358:1: ( rule__Program__RangesAssignment_9_3_1 )
            {
             before(grammarAccess.getProgramAccess().getRangesAssignment_9_3_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1359:1: ( rule__Program__RangesAssignment_9_3_1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1359:2: rule__Program__RangesAssignment_9_3_1
            {
            pushFollow(FOLLOW_rule__Program__RangesAssignment_9_3_1_in_rule__Program__Group_9_3__1__Impl2832);
            rule__Program__RangesAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getRangesAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_9_3__1__Impl"


    // $ANTLR start "rule__Range__Group__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1373:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1377:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1378:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__02866);
            rule__Range__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Range__Group__1_in_rule__Range__Group__02869);
            rule__Range__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0"


    // $ANTLR start "rule__Range__Group__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1385:1: rule__Range__Group__0__Impl : ( ( rule__Range__ModuleAssignment_0 ) ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1389:1: ( ( ( rule__Range__ModuleAssignment_0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1390:1: ( ( rule__Range__ModuleAssignment_0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1390:1: ( ( rule__Range__ModuleAssignment_0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1391:1: ( rule__Range__ModuleAssignment_0 )
            {
             before(grammarAccess.getRangeAccess().getModuleAssignment_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1392:1: ( rule__Range__ModuleAssignment_0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1392:2: rule__Range__ModuleAssignment_0
            {
            pushFollow(FOLLOW_rule__Range__ModuleAssignment_0_in_rule__Range__Group__0__Impl2896);
            rule__Range__ModuleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getModuleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0__Impl"


    // $ANTLR start "rule__Range__Group__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1402:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1406:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1407:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__12926);
            rule__Range__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Range__Group__2_in_rule__Range__Group__12929);
            rule__Range__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1"


    // $ANTLR start "rule__Range__Group__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1414:1: rule__Range__Group__1__Impl : ( '.' ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1418:1: ( ( '.' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1419:1: ( '.' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1419:1: ( '.' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1420:1: '.'
            {
             before(grammarAccess.getRangeAccess().getFullStopKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Range__Group__1__Impl2957); 
             after(grammarAccess.getRangeAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1__Impl"


    // $ANTLR start "rule__Range__Group__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1433:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1437:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1438:2: rule__Range__Group__2__Impl rule__Range__Group__3
            {
            pushFollow(FOLLOW_rule__Range__Group__2__Impl_in_rule__Range__Group__22988);
            rule__Range__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Range__Group__3_in_rule__Range__Group__22991);
            rule__Range__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2"


    // $ANTLR start "rule__Range__Group__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1445:1: rule__Range__Group__2__Impl : ( ( rule__Range__VariableAssignment_2 ) ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1449:1: ( ( ( rule__Range__VariableAssignment_2 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1450:1: ( ( rule__Range__VariableAssignment_2 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1450:1: ( ( rule__Range__VariableAssignment_2 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1451:1: ( rule__Range__VariableAssignment_2 )
            {
             before(grammarAccess.getRangeAccess().getVariableAssignment_2()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1452:1: ( rule__Range__VariableAssignment_2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1452:2: rule__Range__VariableAssignment_2
            {
            pushFollow(FOLLOW_rule__Range__VariableAssignment_2_in_rule__Range__Group__2__Impl3018);
            rule__Range__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2__Impl"


    // $ANTLR start "rule__Range__Group__3"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1462:1: rule__Range__Group__3 : rule__Range__Group__3__Impl rule__Range__Group__4 ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1466:1: ( rule__Range__Group__3__Impl rule__Range__Group__4 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1467:2: rule__Range__Group__3__Impl rule__Range__Group__4
            {
            pushFollow(FOLLOW_rule__Range__Group__3__Impl_in_rule__Range__Group__33048);
            rule__Range__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Range__Group__4_in_rule__Range__Group__33051);
            rule__Range__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3"


    // $ANTLR start "rule__Range__Group__3__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1474:1: rule__Range__Group__3__Impl : ( 'in' ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1478:1: ( ( 'in' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1479:1: ( 'in' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1479:1: ( 'in' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1480:1: 'in'
            {
             before(grammarAccess.getRangeAccess().getInKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Range__Group__3__Impl3079); 
             after(grammarAccess.getRangeAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3__Impl"


    // $ANTLR start "rule__Range__Group__4"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1493:1: rule__Range__Group__4 : rule__Range__Group__4__Impl rule__Range__Group__5 ;
    public final void rule__Range__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1497:1: ( rule__Range__Group__4__Impl rule__Range__Group__5 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1498:2: rule__Range__Group__4__Impl rule__Range__Group__5
            {
            pushFollow(FOLLOW_rule__Range__Group__4__Impl_in_rule__Range__Group__43110);
            rule__Range__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Range__Group__5_in_rule__Range__Group__43113);
            rule__Range__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__4"


    // $ANTLR start "rule__Range__Group__4__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1505:1: rule__Range__Group__4__Impl : ( '[' ) ;
    public final void rule__Range__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1509:1: ( ( '[' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1510:1: ( '[' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1510:1: ( '[' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1511:1: '['
            {
             before(grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__Range__Group__4__Impl3141); 
             after(grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__4__Impl"


    // $ANTLR start "rule__Range__Group__5"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1524:1: rule__Range__Group__5 : rule__Range__Group__5__Impl rule__Range__Group__6 ;
    public final void rule__Range__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1528:1: ( rule__Range__Group__5__Impl rule__Range__Group__6 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1529:2: rule__Range__Group__5__Impl rule__Range__Group__6
            {
            pushFollow(FOLLOW_rule__Range__Group__5__Impl_in_rule__Range__Group__53172);
            rule__Range__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Range__Group__6_in_rule__Range__Group__53175);
            rule__Range__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__5"


    // $ANTLR start "rule__Range__Group__5__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1536:1: rule__Range__Group__5__Impl : ( ( rule__Range__FromAssignment_5 ) ) ;
    public final void rule__Range__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1540:1: ( ( ( rule__Range__FromAssignment_5 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1541:1: ( ( rule__Range__FromAssignment_5 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1541:1: ( ( rule__Range__FromAssignment_5 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1542:1: ( rule__Range__FromAssignment_5 )
            {
             before(grammarAccess.getRangeAccess().getFromAssignment_5()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1543:1: ( rule__Range__FromAssignment_5 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1543:2: rule__Range__FromAssignment_5
            {
            pushFollow(FOLLOW_rule__Range__FromAssignment_5_in_rule__Range__Group__5__Impl3202);
            rule__Range__FromAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getFromAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__5__Impl"


    // $ANTLR start "rule__Range__Group__6"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1553:1: rule__Range__Group__6 : rule__Range__Group__6__Impl rule__Range__Group__7 ;
    public final void rule__Range__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1557:1: ( rule__Range__Group__6__Impl rule__Range__Group__7 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1558:2: rule__Range__Group__6__Impl rule__Range__Group__7
            {
            pushFollow(FOLLOW_rule__Range__Group__6__Impl_in_rule__Range__Group__63232);
            rule__Range__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Range__Group__7_in_rule__Range__Group__63235);
            rule__Range__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__6"


    // $ANTLR start "rule__Range__Group__6__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1565:1: rule__Range__Group__6__Impl : ( ',' ) ;
    public final void rule__Range__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1569:1: ( ( ',' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1570:1: ( ',' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1570:1: ( ',' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1571:1: ','
            {
             before(grammarAccess.getRangeAccess().getCommaKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Range__Group__6__Impl3263); 
             after(grammarAccess.getRangeAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__6__Impl"


    // $ANTLR start "rule__Range__Group__7"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1584:1: rule__Range__Group__7 : rule__Range__Group__7__Impl rule__Range__Group__8 ;
    public final void rule__Range__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1588:1: ( rule__Range__Group__7__Impl rule__Range__Group__8 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1589:2: rule__Range__Group__7__Impl rule__Range__Group__8
            {
            pushFollow(FOLLOW_rule__Range__Group__7__Impl_in_rule__Range__Group__73294);
            rule__Range__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Range__Group__8_in_rule__Range__Group__73297);
            rule__Range__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__7"


    // $ANTLR start "rule__Range__Group__7__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1596:1: rule__Range__Group__7__Impl : ( ( rule__Range__ToAssignment_7 ) ) ;
    public final void rule__Range__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1600:1: ( ( ( rule__Range__ToAssignment_7 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1601:1: ( ( rule__Range__ToAssignment_7 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1601:1: ( ( rule__Range__ToAssignment_7 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1602:1: ( rule__Range__ToAssignment_7 )
            {
             before(grammarAccess.getRangeAccess().getToAssignment_7()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1603:1: ( rule__Range__ToAssignment_7 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1603:2: rule__Range__ToAssignment_7
            {
            pushFollow(FOLLOW_rule__Range__ToAssignment_7_in_rule__Range__Group__7__Impl3324);
            rule__Range__ToAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getToAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__7__Impl"


    // $ANTLR start "rule__Range__Group__8"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1613:1: rule__Range__Group__8 : rule__Range__Group__8__Impl rule__Range__Group__9 ;
    public final void rule__Range__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1617:1: ( rule__Range__Group__8__Impl rule__Range__Group__9 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1618:2: rule__Range__Group__8__Impl rule__Range__Group__9
            {
            pushFollow(FOLLOW_rule__Range__Group__8__Impl_in_rule__Range__Group__83354);
            rule__Range__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Range__Group__9_in_rule__Range__Group__83357);
            rule__Range__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__8"


    // $ANTLR start "rule__Range__Group__8__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1625:1: rule__Range__Group__8__Impl : ( ']' ) ;
    public final void rule__Range__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1629:1: ( ( ']' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1630:1: ( ']' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1630:1: ( ']' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1631:1: ']'
            {
             before(grammarAccess.getRangeAccess().getRightSquareBracketKeyword_8()); 
            match(input,23,FOLLOW_23_in_rule__Range__Group__8__Impl3385); 
             after(grammarAccess.getRangeAccess().getRightSquareBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__8__Impl"


    // $ANTLR start "rule__Range__Group__9"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1644:1: rule__Range__Group__9 : rule__Range__Group__9__Impl ;
    public final void rule__Range__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1648:1: ( rule__Range__Group__9__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1649:2: rule__Range__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Range__Group__9__Impl_in_rule__Range__Group__93416);
            rule__Range__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__9"


    // $ANTLR start "rule__Range__Group__9__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1655:1: rule__Range__Group__9__Impl : ( ( rule__Range__Group_9__0 )? ) ;
    public final void rule__Range__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1659:1: ( ( ( rule__Range__Group_9__0 )? ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1660:1: ( ( rule__Range__Group_9__0 )? )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1660:1: ( ( rule__Range__Group_9__0 )? )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1661:1: ( rule__Range__Group_9__0 )?
            {
             before(grammarAccess.getRangeAccess().getGroup_9()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1662:1: ( rule__Range__Group_9__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1662:2: rule__Range__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Range__Group_9__0_in_rule__Range__Group__9__Impl3443);
                    rule__Range__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRangeAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__9__Impl"


    // $ANTLR start "rule__Range__Group_9__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1692:1: rule__Range__Group_9__0 : rule__Range__Group_9__0__Impl rule__Range__Group_9__1 ;
    public final void rule__Range__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1696:1: ( rule__Range__Group_9__0__Impl rule__Range__Group_9__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1697:2: rule__Range__Group_9__0__Impl rule__Range__Group_9__1
            {
            pushFollow(FOLLOW_rule__Range__Group_9__0__Impl_in_rule__Range__Group_9__03494);
            rule__Range__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Range__Group_9__1_in_rule__Range__Group_9__03497);
            rule__Range__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_9__0"


    // $ANTLR start "rule__Range__Group_9__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1704:1: rule__Range__Group_9__0__Impl : ( 'delta' ) ;
    public final void rule__Range__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1708:1: ( ( 'delta' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1709:1: ( 'delta' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1709:1: ( 'delta' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1710:1: 'delta'
            {
             before(grammarAccess.getRangeAccess().getDeltaKeyword_9_0()); 
            match(input,24,FOLLOW_24_in_rule__Range__Group_9__0__Impl3525); 
             after(grammarAccess.getRangeAccess().getDeltaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_9__0__Impl"


    // $ANTLR start "rule__Range__Group_9__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1723:1: rule__Range__Group_9__1 : rule__Range__Group_9__1__Impl rule__Range__Group_9__2 ;
    public final void rule__Range__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1727:1: ( rule__Range__Group_9__1__Impl rule__Range__Group_9__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1728:2: rule__Range__Group_9__1__Impl rule__Range__Group_9__2
            {
            pushFollow(FOLLOW_rule__Range__Group_9__1__Impl_in_rule__Range__Group_9__13556);
            rule__Range__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Range__Group_9__2_in_rule__Range__Group_9__13559);
            rule__Range__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_9__1"


    // $ANTLR start "rule__Range__Group_9__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1735:1: rule__Range__Group_9__1__Impl : ( '=' ) ;
    public final void rule__Range__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1739:1: ( ( '=' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1740:1: ( '=' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1740:1: ( '=' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1741:1: '='
            {
             before(grammarAccess.getRangeAccess().getEqualsSignKeyword_9_1()); 
            match(input,25,FOLLOW_25_in_rule__Range__Group_9__1__Impl3587); 
             after(grammarAccess.getRangeAccess().getEqualsSignKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_9__1__Impl"


    // $ANTLR start "rule__Range__Group_9__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1754:1: rule__Range__Group_9__2 : rule__Range__Group_9__2__Impl ;
    public final void rule__Range__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1758:1: ( rule__Range__Group_9__2__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1759:2: rule__Range__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Range__Group_9__2__Impl_in_rule__Range__Group_9__23618);
            rule__Range__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_9__2"


    // $ANTLR start "rule__Range__Group_9__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1765:1: rule__Range__Group_9__2__Impl : ( ( rule__Range__DeltaAssignment_9_2 ) ) ;
    public final void rule__Range__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1769:1: ( ( ( rule__Range__DeltaAssignment_9_2 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1770:1: ( ( rule__Range__DeltaAssignment_9_2 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1770:1: ( ( rule__Range__DeltaAssignment_9_2 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1771:1: ( rule__Range__DeltaAssignment_9_2 )
            {
             before(grammarAccess.getRangeAccess().getDeltaAssignment_9_2()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1772:1: ( rule__Range__DeltaAssignment_9_2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1772:2: rule__Range__DeltaAssignment_9_2
            {
            pushFollow(FOLLOW_rule__Range__DeltaAssignment_9_2_in_rule__Range__Group_9__2__Impl3645);
            rule__Range__DeltaAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getDeltaAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_9__2__Impl"


    // $ANTLR start "rule__ModuleDefine__Group__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1788:1: rule__ModuleDefine__Group__0 : rule__ModuleDefine__Group__0__Impl rule__ModuleDefine__Group__1 ;
    public final void rule__ModuleDefine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1792:1: ( rule__ModuleDefine__Group__0__Impl rule__ModuleDefine__Group__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1793:2: rule__ModuleDefine__Group__0__Impl rule__ModuleDefine__Group__1
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group__0__Impl_in_rule__ModuleDefine__Group__03681);
            rule__ModuleDefine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleDefine__Group__1_in_rule__ModuleDefine__Group__03684);
            rule__ModuleDefine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group__0"


    // $ANTLR start "rule__ModuleDefine__Group__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1800:1: rule__ModuleDefine__Group__0__Impl : ( 'module' ) ;
    public final void rule__ModuleDefine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1804:1: ( ( 'module' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1805:1: ( 'module' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1805:1: ( 'module' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1806:1: 'module'
            {
             before(grammarAccess.getModuleDefineAccess().getModuleKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__ModuleDefine__Group__0__Impl3712); 
             after(grammarAccess.getModuleDefineAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group__0__Impl"


    // $ANTLR start "rule__ModuleDefine__Group__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1819:1: rule__ModuleDefine__Group__1 : rule__ModuleDefine__Group__1__Impl rule__ModuleDefine__Group__2 ;
    public final void rule__ModuleDefine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1823:1: ( rule__ModuleDefine__Group__1__Impl rule__ModuleDefine__Group__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1824:2: rule__ModuleDefine__Group__1__Impl rule__ModuleDefine__Group__2
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group__1__Impl_in_rule__ModuleDefine__Group__13743);
            rule__ModuleDefine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleDefine__Group__2_in_rule__ModuleDefine__Group__13746);
            rule__ModuleDefine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group__1"


    // $ANTLR start "rule__ModuleDefine__Group__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1831:1: rule__ModuleDefine__Group__1__Impl : ( ( rule__ModuleDefine__NameAssignment_1 ) ) ;
    public final void rule__ModuleDefine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1835:1: ( ( ( rule__ModuleDefine__NameAssignment_1 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1836:1: ( ( rule__ModuleDefine__NameAssignment_1 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1836:1: ( ( rule__ModuleDefine__NameAssignment_1 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1837:1: ( rule__ModuleDefine__NameAssignment_1 )
            {
             before(grammarAccess.getModuleDefineAccess().getNameAssignment_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1838:1: ( rule__ModuleDefine__NameAssignment_1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1838:2: rule__ModuleDefine__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ModuleDefine__NameAssignment_1_in_rule__ModuleDefine__Group__1__Impl3773);
            rule__ModuleDefine__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleDefineAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group__1__Impl"


    // $ANTLR start "rule__ModuleDefine__Group__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1848:1: rule__ModuleDefine__Group__2 : rule__ModuleDefine__Group__2__Impl rule__ModuleDefine__Group__3 ;
    public final void rule__ModuleDefine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1852:1: ( rule__ModuleDefine__Group__2__Impl rule__ModuleDefine__Group__3 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1853:2: rule__ModuleDefine__Group__2__Impl rule__ModuleDefine__Group__3
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group__2__Impl_in_rule__ModuleDefine__Group__23803);
            rule__ModuleDefine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleDefine__Group__3_in_rule__ModuleDefine__Group__23806);
            rule__ModuleDefine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group__2"


    // $ANTLR start "rule__ModuleDefine__Group__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1860:1: rule__ModuleDefine__Group__2__Impl : ( '{' ) ;
    public final void rule__ModuleDefine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1864:1: ( ( '{' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1865:1: ( '{' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1865:1: ( '{' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1866:1: '{'
            {
             before(grammarAccess.getModuleDefineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__ModuleDefine__Group__2__Impl3834); 
             after(grammarAccess.getModuleDefineAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group__2__Impl"


    // $ANTLR start "rule__ModuleDefine__Group__3"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1879:1: rule__ModuleDefine__Group__3 : rule__ModuleDefine__Group__3__Impl rule__ModuleDefine__Group__4 ;
    public final void rule__ModuleDefine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1883:1: ( rule__ModuleDefine__Group__3__Impl rule__ModuleDefine__Group__4 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1884:2: rule__ModuleDefine__Group__3__Impl rule__ModuleDefine__Group__4
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group__3__Impl_in_rule__ModuleDefine__Group__33865);
            rule__ModuleDefine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleDefine__Group__4_in_rule__ModuleDefine__Group__33868);
            rule__ModuleDefine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group__3"


    // $ANTLR start "rule__ModuleDefine__Group__3__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1891:1: rule__ModuleDefine__Group__3__Impl : ( ( ( rule__ModuleDefine__Group_3__0 ) ) ( ( rule__ModuleDefine__Group_3__0 )* ) ) ;
    public final void rule__ModuleDefine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1895:1: ( ( ( ( rule__ModuleDefine__Group_3__0 ) ) ( ( rule__ModuleDefine__Group_3__0 )* ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1896:1: ( ( ( rule__ModuleDefine__Group_3__0 ) ) ( ( rule__ModuleDefine__Group_3__0 )* ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1896:1: ( ( ( rule__ModuleDefine__Group_3__0 ) ) ( ( rule__ModuleDefine__Group_3__0 )* ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1897:1: ( ( rule__ModuleDefine__Group_3__0 ) ) ( ( rule__ModuleDefine__Group_3__0 )* )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1897:1: ( ( rule__ModuleDefine__Group_3__0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1898:1: ( rule__ModuleDefine__Group_3__0 )
            {
             before(grammarAccess.getModuleDefineAccess().getGroup_3()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1899:1: ( rule__ModuleDefine__Group_3__0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1899:2: rule__ModuleDefine__Group_3__0
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group_3__0_in_rule__ModuleDefine__Group__3__Impl3897);
            rule__ModuleDefine__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleDefineAccess().getGroup_3()); 

            }

            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1902:1: ( ( rule__ModuleDefine__Group_3__0 )* )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1903:1: ( rule__ModuleDefine__Group_3__0 )*
            {
             before(grammarAccess.getModuleDefineAccess().getGroup_3()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1904:1: ( rule__ModuleDefine__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=55 && LA15_0<=57)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1904:2: rule__ModuleDefine__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ModuleDefine__Group_3__0_in_rule__ModuleDefine__Group__3__Impl3909);
            	    rule__ModuleDefine__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModuleDefineAccess().getGroup_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group__3__Impl"


    // $ANTLR start "rule__ModuleDefine__Group__4"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1915:1: rule__ModuleDefine__Group__4 : rule__ModuleDefine__Group__4__Impl rule__ModuleDefine__Group__5 ;
    public final void rule__ModuleDefine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1919:1: ( rule__ModuleDefine__Group__4__Impl rule__ModuleDefine__Group__5 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1920:2: rule__ModuleDefine__Group__4__Impl rule__ModuleDefine__Group__5
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group__4__Impl_in_rule__ModuleDefine__Group__43942);
            rule__ModuleDefine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleDefine__Group__5_in_rule__ModuleDefine__Group__43945);
            rule__ModuleDefine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group__4"


    // $ANTLR start "rule__ModuleDefine__Group__4__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1927:1: rule__ModuleDefine__Group__4__Impl : ( ( ( rule__ModuleDefine__Group_4__0 ) ) ( ( rule__ModuleDefine__Group_4__0 )* ) ) ;
    public final void rule__ModuleDefine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1931:1: ( ( ( ( rule__ModuleDefine__Group_4__0 ) ) ( ( rule__ModuleDefine__Group_4__0 )* ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1932:1: ( ( ( rule__ModuleDefine__Group_4__0 ) ) ( ( rule__ModuleDefine__Group_4__0 )* ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1932:1: ( ( ( rule__ModuleDefine__Group_4__0 ) ) ( ( rule__ModuleDefine__Group_4__0 )* ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1933:1: ( ( rule__ModuleDefine__Group_4__0 ) ) ( ( rule__ModuleDefine__Group_4__0 )* )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1933:1: ( ( rule__ModuleDefine__Group_4__0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1934:1: ( rule__ModuleDefine__Group_4__0 )
            {
             before(grammarAccess.getModuleDefineAccess().getGroup_4()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1935:1: ( rule__ModuleDefine__Group_4__0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1935:2: rule__ModuleDefine__Group_4__0
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group_4__0_in_rule__ModuleDefine__Group__4__Impl3974);
            rule__ModuleDefine__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleDefineAccess().getGroup_4()); 

            }

            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1938:1: ( ( rule__ModuleDefine__Group_4__0 )* )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1939:1: ( rule__ModuleDefine__Group_4__0 )*
            {
             before(grammarAccess.getModuleDefineAccess().getGroup_4()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1940:1: ( rule__ModuleDefine__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_INT && LA16_0<=RULE_ID)||LA16_0==47||(LA16_0>=49 && LA16_0<=50)||LA16_0==53) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1940:2: rule__ModuleDefine__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__ModuleDefine__Group_4__0_in_rule__ModuleDefine__Group__4__Impl3986);
            	    rule__ModuleDefine__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getModuleDefineAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group__4__Impl"


    // $ANTLR start "rule__ModuleDefine__Group__5"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1951:1: rule__ModuleDefine__Group__5 : rule__ModuleDefine__Group__5__Impl rule__ModuleDefine__Group__6 ;
    public final void rule__ModuleDefine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1955:1: ( rule__ModuleDefine__Group__5__Impl rule__ModuleDefine__Group__6 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1956:2: rule__ModuleDefine__Group__5__Impl rule__ModuleDefine__Group__6
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group__5__Impl_in_rule__ModuleDefine__Group__54019);
            rule__ModuleDefine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleDefine__Group__6_in_rule__ModuleDefine__Group__54022);
            rule__ModuleDefine__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group__5"


    // $ANTLR start "rule__ModuleDefine__Group__5__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1963:1: rule__ModuleDefine__Group__5__Impl : ( ( rule__ModuleDefine__Group_5__0 )* ) ;
    public final void rule__ModuleDefine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1967:1: ( ( ( rule__ModuleDefine__Group_5__0 )* ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1968:1: ( ( rule__ModuleDefine__Group_5__0 )* )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1968:1: ( ( rule__ModuleDefine__Group_5__0 )* )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1969:1: ( rule__ModuleDefine__Group_5__0 )*
            {
             before(grammarAccess.getModuleDefineAccess().getGroup_5()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1970:1: ( rule__ModuleDefine__Group_5__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1970:2: rule__ModuleDefine__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ModuleDefine__Group_5__0_in_rule__ModuleDefine__Group__5__Impl4049);
            	    rule__ModuleDefine__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getModuleDefineAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group__5__Impl"


    // $ANTLR start "rule__ModuleDefine__Group__6"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1980:1: rule__ModuleDefine__Group__6 : rule__ModuleDefine__Group__6__Impl ;
    public final void rule__ModuleDefine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1984:1: ( rule__ModuleDefine__Group__6__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1985:2: rule__ModuleDefine__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group__6__Impl_in_rule__ModuleDefine__Group__64080);
            rule__ModuleDefine__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group__6"


    // $ANTLR start "rule__ModuleDefine__Group__6__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1991:1: rule__ModuleDefine__Group__6__Impl : ( '}' ) ;
    public final void rule__ModuleDefine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1995:1: ( ( '}' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1996:1: ( '}' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1996:1: ( '}' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:1997:1: '}'
            {
             before(grammarAccess.getModuleDefineAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__ModuleDefine__Group__6__Impl4108); 
             after(grammarAccess.getModuleDefineAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group__6__Impl"


    // $ANTLR start "rule__ModuleDefine__Group_3__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2024:1: rule__ModuleDefine__Group_3__0 : rule__ModuleDefine__Group_3__0__Impl rule__ModuleDefine__Group_3__1 ;
    public final void rule__ModuleDefine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2028:1: ( rule__ModuleDefine__Group_3__0__Impl rule__ModuleDefine__Group_3__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2029:2: rule__ModuleDefine__Group_3__0__Impl rule__ModuleDefine__Group_3__1
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group_3__0__Impl_in_rule__ModuleDefine__Group_3__04153);
            rule__ModuleDefine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleDefine__Group_3__1_in_rule__ModuleDefine__Group_3__04156);
            rule__ModuleDefine__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group_3__0"


    // $ANTLR start "rule__ModuleDefine__Group_3__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2036:1: rule__ModuleDefine__Group_3__0__Impl : ( ( rule__ModuleDefine__VariablesAssignment_3_0 ) ) ;
    public final void rule__ModuleDefine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2040:1: ( ( ( rule__ModuleDefine__VariablesAssignment_3_0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2041:1: ( ( rule__ModuleDefine__VariablesAssignment_3_0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2041:1: ( ( rule__ModuleDefine__VariablesAssignment_3_0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2042:1: ( rule__ModuleDefine__VariablesAssignment_3_0 )
            {
             before(grammarAccess.getModuleDefineAccess().getVariablesAssignment_3_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2043:1: ( rule__ModuleDefine__VariablesAssignment_3_0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2043:2: rule__ModuleDefine__VariablesAssignment_3_0
            {
            pushFollow(FOLLOW_rule__ModuleDefine__VariablesAssignment_3_0_in_rule__ModuleDefine__Group_3__0__Impl4183);
            rule__ModuleDefine__VariablesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getModuleDefineAccess().getVariablesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group_3__0__Impl"


    // $ANTLR start "rule__ModuleDefine__Group_3__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2053:1: rule__ModuleDefine__Group_3__1 : rule__ModuleDefine__Group_3__1__Impl ;
    public final void rule__ModuleDefine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2057:1: ( rule__ModuleDefine__Group_3__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2058:2: rule__ModuleDefine__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group_3__1__Impl_in_rule__ModuleDefine__Group_3__14213);
            rule__ModuleDefine__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group_3__1"


    // $ANTLR start "rule__ModuleDefine__Group_3__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2064:1: rule__ModuleDefine__Group_3__1__Impl : ( ';' ) ;
    public final void rule__ModuleDefine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2068:1: ( ( ';' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2069:1: ( ';' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2069:1: ( ';' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2070:1: ';'
            {
             before(grammarAccess.getModuleDefineAccess().getSemicolonKeyword_3_1()); 
            match(input,27,FOLLOW_27_in_rule__ModuleDefine__Group_3__1__Impl4241); 
             after(grammarAccess.getModuleDefineAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group_3__1__Impl"


    // $ANTLR start "rule__ModuleDefine__Group_4__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2087:1: rule__ModuleDefine__Group_4__0 : rule__ModuleDefine__Group_4__0__Impl rule__ModuleDefine__Group_4__1 ;
    public final void rule__ModuleDefine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2091:1: ( rule__ModuleDefine__Group_4__0__Impl rule__ModuleDefine__Group_4__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2092:2: rule__ModuleDefine__Group_4__0__Impl rule__ModuleDefine__Group_4__1
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group_4__0__Impl_in_rule__ModuleDefine__Group_4__04276);
            rule__ModuleDefine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleDefine__Group_4__1_in_rule__ModuleDefine__Group_4__04279);
            rule__ModuleDefine__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group_4__0"


    // $ANTLR start "rule__ModuleDefine__Group_4__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2099:1: rule__ModuleDefine__Group_4__0__Impl : ( ( rule__ModuleDefine__RulesAssignment_4_0 ) ) ;
    public final void rule__ModuleDefine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2103:1: ( ( ( rule__ModuleDefine__RulesAssignment_4_0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2104:1: ( ( rule__ModuleDefine__RulesAssignment_4_0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2104:1: ( ( rule__ModuleDefine__RulesAssignment_4_0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2105:1: ( rule__ModuleDefine__RulesAssignment_4_0 )
            {
             before(grammarAccess.getModuleDefineAccess().getRulesAssignment_4_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2106:1: ( rule__ModuleDefine__RulesAssignment_4_0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2106:2: rule__ModuleDefine__RulesAssignment_4_0
            {
            pushFollow(FOLLOW_rule__ModuleDefine__RulesAssignment_4_0_in_rule__ModuleDefine__Group_4__0__Impl4306);
            rule__ModuleDefine__RulesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getModuleDefineAccess().getRulesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group_4__0__Impl"


    // $ANTLR start "rule__ModuleDefine__Group_4__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2116:1: rule__ModuleDefine__Group_4__1 : rule__ModuleDefine__Group_4__1__Impl ;
    public final void rule__ModuleDefine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2120:1: ( rule__ModuleDefine__Group_4__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2121:2: rule__ModuleDefine__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group_4__1__Impl_in_rule__ModuleDefine__Group_4__14336);
            rule__ModuleDefine__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group_4__1"


    // $ANTLR start "rule__ModuleDefine__Group_4__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2127:1: rule__ModuleDefine__Group_4__1__Impl : ( ';' ) ;
    public final void rule__ModuleDefine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2131:1: ( ( ';' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2132:1: ( ';' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2132:1: ( ';' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2133:1: ';'
            {
             before(grammarAccess.getModuleDefineAccess().getSemicolonKeyword_4_1()); 
            match(input,27,FOLLOW_27_in_rule__ModuleDefine__Group_4__1__Impl4364); 
             after(grammarAccess.getModuleDefineAccess().getSemicolonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group_4__1__Impl"


    // $ANTLR start "rule__ModuleDefine__Group_5__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2150:1: rule__ModuleDefine__Group_5__0 : rule__ModuleDefine__Group_5__0__Impl rule__ModuleDefine__Group_5__1 ;
    public final void rule__ModuleDefine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2154:1: ( rule__ModuleDefine__Group_5__0__Impl rule__ModuleDefine__Group_5__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2155:2: rule__ModuleDefine__Group_5__0__Impl rule__ModuleDefine__Group_5__1
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group_5__0__Impl_in_rule__ModuleDefine__Group_5__04399);
            rule__ModuleDefine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleDefine__Group_5__1_in_rule__ModuleDefine__Group_5__04402);
            rule__ModuleDefine__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group_5__0"


    // $ANTLR start "rule__ModuleDefine__Group_5__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2162:1: rule__ModuleDefine__Group_5__0__Impl : ( 'target' ) ;
    public final void rule__ModuleDefine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2166:1: ( ( 'target' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2167:1: ( 'target' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2167:1: ( 'target' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2168:1: 'target'
            {
             before(grammarAccess.getModuleDefineAccess().getTargetKeyword_5_0()); 
            match(input,28,FOLLOW_28_in_rule__ModuleDefine__Group_5__0__Impl4430); 
             after(grammarAccess.getModuleDefineAccess().getTargetKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group_5__0__Impl"


    // $ANTLR start "rule__ModuleDefine__Group_5__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2181:1: rule__ModuleDefine__Group_5__1 : rule__ModuleDefine__Group_5__1__Impl rule__ModuleDefine__Group_5__2 ;
    public final void rule__ModuleDefine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2185:1: ( rule__ModuleDefine__Group_5__1__Impl rule__ModuleDefine__Group_5__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2186:2: rule__ModuleDefine__Group_5__1__Impl rule__ModuleDefine__Group_5__2
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group_5__1__Impl_in_rule__ModuleDefine__Group_5__14461);
            rule__ModuleDefine__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleDefine__Group_5__2_in_rule__ModuleDefine__Group_5__14464);
            rule__ModuleDefine__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group_5__1"


    // $ANTLR start "rule__ModuleDefine__Group_5__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2193:1: rule__ModuleDefine__Group_5__1__Impl : ( 'never' ) ;
    public final void rule__ModuleDefine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2197:1: ( ( 'never' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2198:1: ( 'never' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2198:1: ( 'never' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2199:1: 'never'
            {
             before(grammarAccess.getModuleDefineAccess().getNeverKeyword_5_1()); 
            match(input,29,FOLLOW_29_in_rule__ModuleDefine__Group_5__1__Impl4492); 
             after(grammarAccess.getModuleDefineAccess().getNeverKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group_5__1__Impl"


    // $ANTLR start "rule__ModuleDefine__Group_5__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2212:1: rule__ModuleDefine__Group_5__2 : rule__ModuleDefine__Group_5__2__Impl ;
    public final void rule__ModuleDefine__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2216:1: ( rule__ModuleDefine__Group_5__2__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2217:2: rule__ModuleDefine__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ModuleDefine__Group_5__2__Impl_in_rule__ModuleDefine__Group_5__24523);
            rule__ModuleDefine__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group_5__2"


    // $ANTLR start "rule__ModuleDefine__Group_5__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2223:1: rule__ModuleDefine__Group_5__2__Impl : ( ( rule__ModuleDefine__NeverAssignment_5_2 ) ) ;
    public final void rule__ModuleDefine__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2227:1: ( ( ( rule__ModuleDefine__NeverAssignment_5_2 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2228:1: ( ( rule__ModuleDefine__NeverAssignment_5_2 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2228:1: ( ( rule__ModuleDefine__NeverAssignment_5_2 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2229:1: ( rule__ModuleDefine__NeverAssignment_5_2 )
            {
             before(grammarAccess.getModuleDefineAccess().getNeverAssignment_5_2()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2230:1: ( rule__ModuleDefine__NeverAssignment_5_2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2230:2: rule__ModuleDefine__NeverAssignment_5_2
            {
            pushFollow(FOLLOW_rule__ModuleDefine__NeverAssignment_5_2_in_rule__ModuleDefine__Group_5__2__Impl4550);
            rule__ModuleDefine__NeverAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleDefineAccess().getNeverAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__Group_5__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2246:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2250:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2251:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__04586);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__04589);
            rule__VariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2258:1: rule__VariableDeclaration__Group__0__Impl : ( ( rule__VariableDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2262:1: ( ( ( rule__VariableDeclaration__TypeAssignment_0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2263:1: ( ( rule__VariableDeclaration__TypeAssignment_0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2263:1: ( ( rule__VariableDeclaration__TypeAssignment_0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2264:1: ( rule__VariableDeclaration__TypeAssignment_0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2265:1: ( rule__VariableDeclaration__TypeAssignment_0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2265:2: rule__VariableDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__TypeAssignment_0_in_rule__VariableDeclaration__Group__0__Impl4616);
            rule__VariableDeclaration__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2275:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2279:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2280:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__14646);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__14649);
            rule__VariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2287:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2291:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2292:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2292:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2293:1: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2294:1: ( rule__VariableDeclaration__NameAssignment_1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2294:2: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__NameAssignment_1_in_rule__VariableDeclaration__Group__1__Impl4676);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2304:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2308:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2309:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__24706);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__24709);
            rule__VariableDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2316:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2320:1: ( ( '=' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2321:1: ( '=' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2321:1: ( '=' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2322:1: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__VariableDeclaration__Group__2__Impl4737); 
             after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2335:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2339:1: ( rule__VariableDeclaration__Group__3__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2340:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__34768);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2346:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ExprAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2350:1: ( ( ( rule__VariableDeclaration__ExprAssignment_3 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2351:1: ( ( rule__VariableDeclaration__ExprAssignment_3 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2351:1: ( ( rule__VariableDeclaration__ExprAssignment_3 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2352:1: ( rule__VariableDeclaration__ExprAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getExprAssignment_3()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2353:1: ( rule__VariableDeclaration__ExprAssignment_3 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2353:2: rule__VariableDeclaration__ExprAssignment_3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__ExprAssignment_3_in_rule__VariableDeclaration__Group__3__Impl4795);
            rule__VariableDeclaration__ExprAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getExprAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2371:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2375:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2376:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__04833);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__04836);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2383:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__CondAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2387:1: ( ( ( rule__Rule__CondAssignment_0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2388:1: ( ( rule__Rule__CondAssignment_0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2388:1: ( ( rule__Rule__CondAssignment_0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2389:1: ( rule__Rule__CondAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getCondAssignment_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2390:1: ( rule__Rule__CondAssignment_0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2390:2: rule__Rule__CondAssignment_0
            {
            pushFollow(FOLLOW_rule__Rule__CondAssignment_0_in_rule__Rule__Group__0__Impl4863);
            rule__Rule__CondAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getCondAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2400:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2404:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2405:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__14893);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__14896);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2412:1: rule__Rule__Group__1__Impl : ( '[' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2416:1: ( ( '[' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2417:1: ( '[' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2417:1: ( '[' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2418:1: '['
            {
             before(grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Rule__Group__1__Impl4924); 
             after(grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2431:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2435:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2436:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__24955);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__24958);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2443:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ActionAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2447:1: ( ( ( rule__Rule__ActionAssignment_2 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2448:1: ( ( rule__Rule__ActionAssignment_2 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2448:1: ( ( rule__Rule__ActionAssignment_2 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2449:1: ( rule__Rule__ActionAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_2()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2450:1: ( rule__Rule__ActionAssignment_2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2450:2: rule__Rule__ActionAssignment_2
            {
            pushFollow(FOLLOW_rule__Rule__ActionAssignment_2_in_rule__Rule__Group__2__Impl4985);
            rule__Rule__ActionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2460:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2464:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2465:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__35015);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__35018);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2472:1: rule__Rule__Group__3__Impl : ( ']' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2476:1: ( ( ']' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2477:1: ( ']' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2477:1: ( ']' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2478:1: ']'
            {
             before(grammarAccess.getRuleAccess().getRightSquareBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Rule__Group__3__Impl5046); 
             after(grammarAccess.getRuleAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2491:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2495:1: ( rule__Rule__Group__4__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2496:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__45077);
            rule__Rule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2502:1: rule__Rule__Group__4__Impl : ( ( ( rule__Rule__NdCasesAssignment_4 ) ) ( ( rule__Rule__NdCasesAssignment_4 )* ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2506:1: ( ( ( ( rule__Rule__NdCasesAssignment_4 ) ) ( ( rule__Rule__NdCasesAssignment_4 )* ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2507:1: ( ( ( rule__Rule__NdCasesAssignment_4 ) ) ( ( rule__Rule__NdCasesAssignment_4 )* ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2507:1: ( ( ( rule__Rule__NdCasesAssignment_4 ) ) ( ( rule__Rule__NdCasesAssignment_4 )* ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2508:1: ( ( rule__Rule__NdCasesAssignment_4 ) ) ( ( rule__Rule__NdCasesAssignment_4 )* )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2508:1: ( ( rule__Rule__NdCasesAssignment_4 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2509:1: ( rule__Rule__NdCasesAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getNdCasesAssignment_4()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2510:1: ( rule__Rule__NdCasesAssignment_4 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2510:2: rule__Rule__NdCasesAssignment_4
            {
            pushFollow(FOLLOW_rule__Rule__NdCasesAssignment_4_in_rule__Rule__Group__4__Impl5106);
            rule__Rule__NdCasesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNdCasesAssignment_4()); 

            }

            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2513:1: ( ( rule__Rule__NdCasesAssignment_4 )* )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2514:1: ( rule__Rule__NdCasesAssignment_4 )*
            {
             before(grammarAccess.getRuleAccess().getNdCasesAssignment_4()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2515:1: ( rule__Rule__NdCasesAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2515:2: rule__Rule__NdCasesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Rule__NdCasesAssignment_4_in_rule__Rule__Group__4__Impl5118);
            	    rule__Rule__NdCasesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getNdCasesAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__NDCase__Group__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2536:1: rule__NDCase__Group__0 : rule__NDCase__Group__0__Impl rule__NDCase__Group__1 ;
    public final void rule__NDCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2540:1: ( rule__NDCase__Group__0__Impl rule__NDCase__Group__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2541:2: rule__NDCase__Group__0__Impl rule__NDCase__Group__1
            {
            pushFollow(FOLLOW_rule__NDCase__Group__0__Impl_in_rule__NDCase__Group__05161);
            rule__NDCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NDCase__Group__1_in_rule__NDCase__Group__05164);
            rule__NDCase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NDCase__Group__0"


    // $ANTLR start "rule__NDCase__Group__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2548:1: rule__NDCase__Group__0__Impl : ( '=>' ) ;
    public final void rule__NDCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2552:1: ( ( '=>' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2553:1: ( '=>' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2553:1: ( '=>' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2554:1: '=>'
            {
             before(grammarAccess.getNDCaseAccess().getEqualsSignGreaterThanSignKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__NDCase__Group__0__Impl5192); 
             after(grammarAccess.getNDCaseAccess().getEqualsSignGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NDCase__Group__0__Impl"


    // $ANTLR start "rule__NDCase__Group__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2567:1: rule__NDCase__Group__1 : rule__NDCase__Group__1__Impl rule__NDCase__Group__2 ;
    public final void rule__NDCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2571:1: ( rule__NDCase__Group__1__Impl rule__NDCase__Group__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2572:2: rule__NDCase__Group__1__Impl rule__NDCase__Group__2
            {
            pushFollow(FOLLOW_rule__NDCase__Group__1__Impl_in_rule__NDCase__Group__15223);
            rule__NDCase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NDCase__Group__2_in_rule__NDCase__Group__15226);
            rule__NDCase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NDCase__Group__1"


    // $ANTLR start "rule__NDCase__Group__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2579:1: rule__NDCase__Group__1__Impl : ( ( rule__NDCase__CasesAssignment_1 ) ) ;
    public final void rule__NDCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2583:1: ( ( ( rule__NDCase__CasesAssignment_1 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2584:1: ( ( rule__NDCase__CasesAssignment_1 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2584:1: ( ( rule__NDCase__CasesAssignment_1 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2585:1: ( rule__NDCase__CasesAssignment_1 )
            {
             before(grammarAccess.getNDCaseAccess().getCasesAssignment_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2586:1: ( rule__NDCase__CasesAssignment_1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2586:2: rule__NDCase__CasesAssignment_1
            {
            pushFollow(FOLLOW_rule__NDCase__CasesAssignment_1_in_rule__NDCase__Group__1__Impl5253);
            rule__NDCase__CasesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNDCaseAccess().getCasesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NDCase__Group__1__Impl"


    // $ANTLR start "rule__NDCase__Group__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2596:1: rule__NDCase__Group__2 : rule__NDCase__Group__2__Impl ;
    public final void rule__NDCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2600:1: ( rule__NDCase__Group__2__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2601:2: rule__NDCase__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NDCase__Group__2__Impl_in_rule__NDCase__Group__25283);
            rule__NDCase__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NDCase__Group__2"


    // $ANTLR start "rule__NDCase__Group__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2607:1: rule__NDCase__Group__2__Impl : ( ( rule__NDCase__Group_2__0 )* ) ;
    public final void rule__NDCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2611:1: ( ( ( rule__NDCase__Group_2__0 )* ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2612:1: ( ( rule__NDCase__Group_2__0 )* )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2612:1: ( ( rule__NDCase__Group_2__0 )* )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2613:1: ( rule__NDCase__Group_2__0 )*
            {
             before(grammarAccess.getNDCaseAccess().getGroup_2()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2614:1: ( rule__NDCase__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2614:2: rule__NDCase__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__NDCase__Group_2__0_in_rule__NDCase__Group__2__Impl5310);
            	    rule__NDCase__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getNDCaseAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NDCase__Group__2__Impl"


    // $ANTLR start "rule__NDCase__Group_2__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2630:1: rule__NDCase__Group_2__0 : rule__NDCase__Group_2__0__Impl rule__NDCase__Group_2__1 ;
    public final void rule__NDCase__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2634:1: ( rule__NDCase__Group_2__0__Impl rule__NDCase__Group_2__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2635:2: rule__NDCase__Group_2__0__Impl rule__NDCase__Group_2__1
            {
            pushFollow(FOLLOW_rule__NDCase__Group_2__0__Impl_in_rule__NDCase__Group_2__05347);
            rule__NDCase__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NDCase__Group_2__1_in_rule__NDCase__Group_2__05350);
            rule__NDCase__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NDCase__Group_2__0"


    // $ANTLR start "rule__NDCase__Group_2__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2642:1: rule__NDCase__Group_2__0__Impl : ( '#' ) ;
    public final void rule__NDCase__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2646:1: ( ( '#' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2647:1: ( '#' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2647:1: ( '#' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2648:1: '#'
            {
             before(grammarAccess.getNDCaseAccess().getNumberSignKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__NDCase__Group_2__0__Impl5378); 
             after(grammarAccess.getNDCaseAccess().getNumberSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NDCase__Group_2__0__Impl"


    // $ANTLR start "rule__NDCase__Group_2__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2661:1: rule__NDCase__Group_2__1 : rule__NDCase__Group_2__1__Impl ;
    public final void rule__NDCase__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2665:1: ( rule__NDCase__Group_2__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2666:2: rule__NDCase__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NDCase__Group_2__1__Impl_in_rule__NDCase__Group_2__15409);
            rule__NDCase__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NDCase__Group_2__1"


    // $ANTLR start "rule__NDCase__Group_2__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2672:1: rule__NDCase__Group_2__1__Impl : ( ( rule__NDCase__CasesAssignment_2_1 ) ) ;
    public final void rule__NDCase__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2676:1: ( ( ( rule__NDCase__CasesAssignment_2_1 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2677:1: ( ( rule__NDCase__CasesAssignment_2_1 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2677:1: ( ( rule__NDCase__CasesAssignment_2_1 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2678:1: ( rule__NDCase__CasesAssignment_2_1 )
            {
             before(grammarAccess.getNDCaseAccess().getCasesAssignment_2_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2679:1: ( rule__NDCase__CasesAssignment_2_1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2679:2: rule__NDCase__CasesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NDCase__CasesAssignment_2_1_in_rule__NDCase__Group_2__1__Impl5436);
            rule__NDCase__CasesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNDCaseAccess().getCasesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NDCase__Group_2__1__Impl"


    // $ANTLR start "rule__Case__Group__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2693:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2697:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2698:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__05470);
            rule__Case__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group__1_in_rule__Case__Group__05473);
            rule__Case__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__0"


    // $ANTLR start "rule__Case__Group__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2705:1: rule__Case__Group__0__Impl : ( '<' ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2709:1: ( ( '<' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2710:1: ( '<' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2710:1: ( '<' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2711:1: '<'
            {
             before(grammarAccess.getCaseAccess().getLessThanSignKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Case__Group__0__Impl5501); 
             after(grammarAccess.getCaseAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__0__Impl"


    // $ANTLR start "rule__Case__Group__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2724:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2728:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2729:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__15532);
            rule__Case__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group__2_in_rule__Case__Group__15535);
            rule__Case__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__1"


    // $ANTLR start "rule__Case__Group__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2736:1: rule__Case__Group__1__Impl : ( ( rule__Case__WeightAssignment_1 ) ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2740:1: ( ( ( rule__Case__WeightAssignment_1 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2741:1: ( ( rule__Case__WeightAssignment_1 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2741:1: ( ( rule__Case__WeightAssignment_1 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2742:1: ( rule__Case__WeightAssignment_1 )
            {
             before(grammarAccess.getCaseAccess().getWeightAssignment_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2743:1: ( rule__Case__WeightAssignment_1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2743:2: rule__Case__WeightAssignment_1
            {
            pushFollow(FOLLOW_rule__Case__WeightAssignment_1_in_rule__Case__Group__1__Impl5562);
            rule__Case__WeightAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getWeightAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__1__Impl"


    // $ANTLR start "rule__Case__Group__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2753:1: rule__Case__Group__2 : rule__Case__Group__2__Impl rule__Case__Group__3 ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2757:1: ( rule__Case__Group__2__Impl rule__Case__Group__3 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2758:2: rule__Case__Group__2__Impl rule__Case__Group__3
            {
            pushFollow(FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__25592);
            rule__Case__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group__3_in_rule__Case__Group__25595);
            rule__Case__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__2"


    // $ANTLR start "rule__Case__Group__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2765:1: rule__Case__Group__2__Impl : ( ( rule__Case__Group_2__0 )? ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2769:1: ( ( ( rule__Case__Group_2__0 )? ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2770:1: ( ( rule__Case__Group_2__0 )? )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2770:1: ( ( rule__Case__Group_2__0 )? )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2771:1: ( rule__Case__Group_2__0 )?
            {
             before(grammarAccess.getCaseAccess().getGroup_2()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2772:1: ( rule__Case__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2772:2: rule__Case__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Case__Group_2__0_in_rule__Case__Group__2__Impl5622);
                    rule__Case__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCaseAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__2__Impl"


    // $ANTLR start "rule__Case__Group__3"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2782:1: rule__Case__Group__3 : rule__Case__Group__3__Impl rule__Case__Group__4 ;
    public final void rule__Case__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2786:1: ( rule__Case__Group__3__Impl rule__Case__Group__4 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2787:2: rule__Case__Group__3__Impl rule__Case__Group__4
            {
            pushFollow(FOLLOW_rule__Case__Group__3__Impl_in_rule__Case__Group__35653);
            rule__Case__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group__4_in_rule__Case__Group__35656);
            rule__Case__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__3"


    // $ANTLR start "rule__Case__Group__3__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2794:1: rule__Case__Group__3__Impl : ( '>' ) ;
    public final void rule__Case__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2798:1: ( ( '>' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2799:1: ( '>' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2799:1: ( '>' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2800:1: '>'
            {
             before(grammarAccess.getCaseAccess().getGreaterThanSignKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__Case__Group__3__Impl5684); 
             after(grammarAccess.getCaseAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__3__Impl"


    // $ANTLR start "rule__Case__Group__4"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2813:1: rule__Case__Group__4 : rule__Case__Group__4__Impl rule__Case__Group__5 ;
    public final void rule__Case__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2817:1: ( rule__Case__Group__4__Impl rule__Case__Group__5 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2818:2: rule__Case__Group__4__Impl rule__Case__Group__5
            {
            pushFollow(FOLLOW_rule__Case__Group__4__Impl_in_rule__Case__Group__45715);
            rule__Case__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group__5_in_rule__Case__Group__45718);
            rule__Case__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__4"


    // $ANTLR start "rule__Case__Group__4__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2825:1: rule__Case__Group__4__Impl : ( ( rule__Case__UpdateAssignment_4 ) ) ;
    public final void rule__Case__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2829:1: ( ( ( rule__Case__UpdateAssignment_4 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2830:1: ( ( rule__Case__UpdateAssignment_4 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2830:1: ( ( rule__Case__UpdateAssignment_4 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2831:1: ( rule__Case__UpdateAssignment_4 )
            {
             before(grammarAccess.getCaseAccess().getUpdateAssignment_4()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2832:1: ( rule__Case__UpdateAssignment_4 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2832:2: rule__Case__UpdateAssignment_4
            {
            pushFollow(FOLLOW_rule__Case__UpdateAssignment_4_in_rule__Case__Group__4__Impl5745);
            rule__Case__UpdateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getUpdateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__4__Impl"


    // $ANTLR start "rule__Case__Group__5"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2842:1: rule__Case__Group__5 : rule__Case__Group__5__Impl ;
    public final void rule__Case__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2846:1: ( rule__Case__Group__5__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2847:2: rule__Case__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Case__Group__5__Impl_in_rule__Case__Group__55775);
            rule__Case__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__5"


    // $ANTLR start "rule__Case__Group__5__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2853:1: rule__Case__Group__5__Impl : ( ( rule__Case__Group_5__0 )* ) ;
    public final void rule__Case__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2857:1: ( ( ( rule__Case__Group_5__0 )* ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2858:1: ( ( rule__Case__Group_5__0 )* )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2858:1: ( ( rule__Case__Group_5__0 )* )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2859:1: ( rule__Case__Group_5__0 )*
            {
             before(grammarAccess.getCaseAccess().getGroup_5()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2860:1: ( rule__Case__Group_5__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2860:2: rule__Case__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Case__Group_5__0_in_rule__Case__Group__5__Impl5802);
            	    rule__Case__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getCaseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__5__Impl"


    // $ANTLR start "rule__Case__Group_2__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2882:1: rule__Case__Group_2__0 : rule__Case__Group_2__0__Impl rule__Case__Group_2__1 ;
    public final void rule__Case__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2886:1: ( rule__Case__Group_2__0__Impl rule__Case__Group_2__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2887:2: rule__Case__Group_2__0__Impl rule__Case__Group_2__1
            {
            pushFollow(FOLLOW_rule__Case__Group_2__0__Impl_in_rule__Case__Group_2__05845);
            rule__Case__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group_2__1_in_rule__Case__Group_2__05848);
            rule__Case__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_2__0"


    // $ANTLR start "rule__Case__Group_2__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2894:1: rule__Case__Group_2__0__Impl : ( ( rule__Case__HasConditionAssignment_2_0 ) ) ;
    public final void rule__Case__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2898:1: ( ( ( rule__Case__HasConditionAssignment_2_0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2899:1: ( ( rule__Case__HasConditionAssignment_2_0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2899:1: ( ( rule__Case__HasConditionAssignment_2_0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2900:1: ( rule__Case__HasConditionAssignment_2_0 )
            {
             before(grammarAccess.getCaseAccess().getHasConditionAssignment_2_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2901:1: ( rule__Case__HasConditionAssignment_2_0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2901:2: rule__Case__HasConditionAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Case__HasConditionAssignment_2_0_in_rule__Case__Group_2__0__Impl5875);
            rule__Case__HasConditionAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getHasConditionAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_2__0__Impl"


    // $ANTLR start "rule__Case__Group_2__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2911:1: rule__Case__Group_2__1 : rule__Case__Group_2__1__Impl ;
    public final void rule__Case__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2915:1: ( rule__Case__Group_2__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2916:2: rule__Case__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Case__Group_2__1__Impl_in_rule__Case__Group_2__15905);
            rule__Case__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_2__1"


    // $ANTLR start "rule__Case__Group_2__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2922:1: rule__Case__Group_2__1__Impl : ( ( rule__Case__CondAssignment_2_1 ) ) ;
    public final void rule__Case__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2926:1: ( ( ( rule__Case__CondAssignment_2_1 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2927:1: ( ( rule__Case__CondAssignment_2_1 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2927:1: ( ( rule__Case__CondAssignment_2_1 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2928:1: ( rule__Case__CondAssignment_2_1 )
            {
             before(grammarAccess.getCaseAccess().getCondAssignment_2_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2929:1: ( rule__Case__CondAssignment_2_1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2929:2: rule__Case__CondAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Case__CondAssignment_2_1_in_rule__Case__Group_2__1__Impl5932);
            rule__Case__CondAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getCondAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_2__1__Impl"


    // $ANTLR start "rule__Case__Group_5__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2943:1: rule__Case__Group_5__0 : rule__Case__Group_5__0__Impl rule__Case__Group_5__1 ;
    public final void rule__Case__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2947:1: ( rule__Case__Group_5__0__Impl rule__Case__Group_5__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2948:2: rule__Case__Group_5__0__Impl rule__Case__Group_5__1
            {
            pushFollow(FOLLOW_rule__Case__Group_5__0__Impl_in_rule__Case__Group_5__05966);
            rule__Case__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group_5__1_in_rule__Case__Group_5__05969);
            rule__Case__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_5__0"


    // $ANTLR start "rule__Case__Group_5__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2955:1: rule__Case__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Case__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2959:1: ( ( ',' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2960:1: ( ',' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2960:1: ( ',' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2961:1: ','
            {
             before(grammarAccess.getCaseAccess().getCommaKeyword_5_0()); 
            match(input,19,FOLLOW_19_in_rule__Case__Group_5__0__Impl5997); 
             after(grammarAccess.getCaseAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_5__0__Impl"


    // $ANTLR start "rule__Case__Group_5__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2974:1: rule__Case__Group_5__1 : rule__Case__Group_5__1__Impl ;
    public final void rule__Case__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2978:1: ( rule__Case__Group_5__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2979:2: rule__Case__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Case__Group_5__1__Impl_in_rule__Case__Group_5__16028);
            rule__Case__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_5__1"


    // $ANTLR start "rule__Case__Group_5__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2985:1: rule__Case__Group_5__1__Impl : ( ( rule__Case__UpdateAssignment_5_1 ) ) ;
    public final void rule__Case__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2989:1: ( ( ( rule__Case__UpdateAssignment_5_1 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2990:1: ( ( rule__Case__UpdateAssignment_5_1 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2990:1: ( ( rule__Case__UpdateAssignment_5_1 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2991:1: ( rule__Case__UpdateAssignment_5_1 )
            {
             before(grammarAccess.getCaseAccess().getUpdateAssignment_5_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2992:1: ( rule__Case__UpdateAssignment_5_1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:2992:2: rule__Case__UpdateAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Case__UpdateAssignment_5_1_in_rule__Case__Group_5__1__Impl6055);
            rule__Case__UpdateAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getUpdateAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_5__1__Impl"


    // $ANTLR start "rule__Update__Group_0__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3006:1: rule__Update__Group_0__0 : rule__Update__Group_0__0__Impl rule__Update__Group_0__1 ;
    public final void rule__Update__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3010:1: ( rule__Update__Group_0__0__Impl rule__Update__Group_0__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3011:2: rule__Update__Group_0__0__Impl rule__Update__Group_0__1
            {
            pushFollow(FOLLOW_rule__Update__Group_0__0__Impl_in_rule__Update__Group_0__06089);
            rule__Update__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Update__Group_0__1_in_rule__Update__Group_0__06092);
            rule__Update__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group_0__0"


    // $ANTLR start "rule__Update__Group_0__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3018:1: rule__Update__Group_0__0__Impl : ( () ) ;
    public final void rule__Update__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3022:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3023:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3023:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3024:1: ()
            {
             before(grammarAccess.getUpdateAccess().getNoActionAction_0_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3025:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3027:1: 
            {
            }

             after(grammarAccess.getUpdateAccess().getNoActionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group_0__0__Impl"


    // $ANTLR start "rule__Update__Group_0__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3037:1: rule__Update__Group_0__1 : rule__Update__Group_0__1__Impl ;
    public final void rule__Update__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3041:1: ( rule__Update__Group_0__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3042:2: rule__Update__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Update__Group_0__1__Impl_in_rule__Update__Group_0__16150);
            rule__Update__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group_0__1"


    // $ANTLR start "rule__Update__Group_0__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3048:1: rule__Update__Group_0__1__Impl : ( 'noaction' ) ;
    public final void rule__Update__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3052:1: ( ( 'noaction' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3053:1: ( 'noaction' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3053:1: ( 'noaction' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3054:1: 'noaction'
            {
             before(grammarAccess.getUpdateAccess().getNoactionKeyword_0_1()); 
            match(input,34,FOLLOW_34_in_rule__Update__Group_0__1__Impl6178); 
             after(grammarAccess.getUpdateAccess().getNoactionKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group_0__1__Impl"


    // $ANTLR start "rule__Update__Group_1__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3071:1: rule__Update__Group_1__0 : rule__Update__Group_1__0__Impl rule__Update__Group_1__1 ;
    public final void rule__Update__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3075:1: ( rule__Update__Group_1__0__Impl rule__Update__Group_1__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3076:2: rule__Update__Group_1__0__Impl rule__Update__Group_1__1
            {
            pushFollow(FOLLOW_rule__Update__Group_1__0__Impl_in_rule__Update__Group_1__06213);
            rule__Update__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Update__Group_1__1_in_rule__Update__Group_1__06216);
            rule__Update__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group_1__0"


    // $ANTLR start "rule__Update__Group_1__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3083:1: rule__Update__Group_1__0__Impl : ( () ) ;
    public final void rule__Update__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3087:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3088:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3088:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3089:1: ()
            {
             before(grammarAccess.getUpdateAccess().getAssignAction_1_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3090:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3092:1: 
            {
            }

             after(grammarAccess.getUpdateAccess().getAssignAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group_1__0__Impl"


    // $ANTLR start "rule__Update__Group_1__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3102:1: rule__Update__Group_1__1 : rule__Update__Group_1__1__Impl rule__Update__Group_1__2 ;
    public final void rule__Update__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3106:1: ( rule__Update__Group_1__1__Impl rule__Update__Group_1__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3107:2: rule__Update__Group_1__1__Impl rule__Update__Group_1__2
            {
            pushFollow(FOLLOW_rule__Update__Group_1__1__Impl_in_rule__Update__Group_1__16274);
            rule__Update__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Update__Group_1__2_in_rule__Update__Group_1__16277);
            rule__Update__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group_1__1"


    // $ANTLR start "rule__Update__Group_1__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3114:1: rule__Update__Group_1__1__Impl : ( ( rule__Update__VariableAssignment_1_1 ) ) ;
    public final void rule__Update__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3118:1: ( ( ( rule__Update__VariableAssignment_1_1 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3119:1: ( ( rule__Update__VariableAssignment_1_1 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3119:1: ( ( rule__Update__VariableAssignment_1_1 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3120:1: ( rule__Update__VariableAssignment_1_1 )
            {
             before(grammarAccess.getUpdateAccess().getVariableAssignment_1_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3121:1: ( rule__Update__VariableAssignment_1_1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3121:2: rule__Update__VariableAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Update__VariableAssignment_1_1_in_rule__Update__Group_1__1__Impl6304);
            rule__Update__VariableAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getVariableAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group_1__1__Impl"


    // $ANTLR start "rule__Update__Group_1__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3131:1: rule__Update__Group_1__2 : rule__Update__Group_1__2__Impl rule__Update__Group_1__3 ;
    public final void rule__Update__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3135:1: ( rule__Update__Group_1__2__Impl rule__Update__Group_1__3 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3136:2: rule__Update__Group_1__2__Impl rule__Update__Group_1__3
            {
            pushFollow(FOLLOW_rule__Update__Group_1__2__Impl_in_rule__Update__Group_1__26334);
            rule__Update__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Update__Group_1__3_in_rule__Update__Group_1__26337);
            rule__Update__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group_1__2"


    // $ANTLR start "rule__Update__Group_1__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3143:1: rule__Update__Group_1__2__Impl : ( '=' ) ;
    public final void rule__Update__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3147:1: ( ( '=' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3148:1: ( '=' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3148:1: ( '=' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3149:1: '='
            {
             before(grammarAccess.getUpdateAccess().getEqualsSignKeyword_1_2()); 
            match(input,25,FOLLOW_25_in_rule__Update__Group_1__2__Impl6365); 
             after(grammarAccess.getUpdateAccess().getEqualsSignKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group_1__2__Impl"


    // $ANTLR start "rule__Update__Group_1__3"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3162:1: rule__Update__Group_1__3 : rule__Update__Group_1__3__Impl ;
    public final void rule__Update__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3166:1: ( rule__Update__Group_1__3__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3167:2: rule__Update__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Update__Group_1__3__Impl_in_rule__Update__Group_1__36396);
            rule__Update__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group_1__3"


    // $ANTLR start "rule__Update__Group_1__3__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3173:1: rule__Update__Group_1__3__Impl : ( ( rule__Update__ExprAssignment_1_3 ) ) ;
    public final void rule__Update__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3177:1: ( ( ( rule__Update__ExprAssignment_1_3 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3178:1: ( ( rule__Update__ExprAssignment_1_3 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3178:1: ( ( rule__Update__ExprAssignment_1_3 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3179:1: ( rule__Update__ExprAssignment_1_3 )
            {
             before(grammarAccess.getUpdateAccess().getExprAssignment_1_3()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3180:1: ( rule__Update__ExprAssignment_1_3 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3180:2: rule__Update__ExprAssignment_1_3
            {
            pushFollow(FOLLOW_rule__Update__ExprAssignment_1_3_in_rule__Update__Group_1__3__Impl6423);
            rule__Update__ExprAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getExprAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group_1__3__Impl"


    // $ANTLR start "rule__Environment__Group__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3198:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3202:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3203:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FOLLOW_rule__Environment__Group__0__Impl_in_rule__Environment__Group__06461);
            rule__Environment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__1_in_rule__Environment__Group__06464);
            rule__Environment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__0"


    // $ANTLR start "rule__Environment__Group__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3210:1: rule__Environment__Group__0__Impl : ( ( rule__Environment__ModulesAssignment_0 ) ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3214:1: ( ( ( rule__Environment__ModulesAssignment_0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3215:1: ( ( rule__Environment__ModulesAssignment_0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3215:1: ( ( rule__Environment__ModulesAssignment_0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3216:1: ( rule__Environment__ModulesAssignment_0 )
            {
             before(grammarAccess.getEnvironmentAccess().getModulesAssignment_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3217:1: ( rule__Environment__ModulesAssignment_0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3217:2: rule__Environment__ModulesAssignment_0
            {
            pushFollow(FOLLOW_rule__Environment__ModulesAssignment_0_in_rule__Environment__Group__0__Impl6491);
            rule__Environment__ModulesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getModulesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__0__Impl"


    // $ANTLR start "rule__Environment__Group__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3227:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3231:1: ( rule__Environment__Group__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3232:2: rule__Environment__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Environment__Group__1__Impl_in_rule__Environment__Group__16521);
            rule__Environment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__1"


    // $ANTLR start "rule__Environment__Group__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3238:1: rule__Environment__Group__1__Impl : ( ( rule__Environment__Group_1__0 )* ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3242:1: ( ( ( rule__Environment__Group_1__0 )* ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3243:1: ( ( rule__Environment__Group_1__0 )* )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3243:1: ( ( rule__Environment__Group_1__0 )* )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3244:1: ( rule__Environment__Group_1__0 )*
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3245:1: ( rule__Environment__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3245:2: rule__Environment__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Environment__Group_1__0_in_rule__Environment__Group__1__Impl6548);
            	    rule__Environment__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getEnvironmentAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__1__Impl"


    // $ANTLR start "rule__Environment__Group_1__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3259:1: rule__Environment__Group_1__0 : rule__Environment__Group_1__0__Impl rule__Environment__Group_1__1 ;
    public final void rule__Environment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3263:1: ( rule__Environment__Group_1__0__Impl rule__Environment__Group_1__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3264:2: rule__Environment__Group_1__0__Impl rule__Environment__Group_1__1
            {
            pushFollow(FOLLOW_rule__Environment__Group_1__0__Impl_in_rule__Environment__Group_1__06583);
            rule__Environment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group_1__1_in_rule__Environment__Group_1__06586);
            rule__Environment__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_1__0"


    // $ANTLR start "rule__Environment__Group_1__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3271:1: rule__Environment__Group_1__0__Impl : ( '|{' ) ;
    public final void rule__Environment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3275:1: ( ( '|{' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3276:1: ( '|{' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3276:1: ( '|{' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3277:1: '|{'
            {
             before(grammarAccess.getEnvironmentAccess().getVerticalLineLeftCurlyBracketKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Environment__Group_1__0__Impl6614); 
             after(grammarAccess.getEnvironmentAccess().getVerticalLineLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_1__0__Impl"


    // $ANTLR start "rule__Environment__Group_1__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3290:1: rule__Environment__Group_1__1 : rule__Environment__Group_1__1__Impl rule__Environment__Group_1__2 ;
    public final void rule__Environment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3294:1: ( rule__Environment__Group_1__1__Impl rule__Environment__Group_1__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3295:2: rule__Environment__Group_1__1__Impl rule__Environment__Group_1__2
            {
            pushFollow(FOLLOW_rule__Environment__Group_1__1__Impl_in_rule__Environment__Group_1__16645);
            rule__Environment__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group_1__2_in_rule__Environment__Group_1__16648);
            rule__Environment__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_1__1"


    // $ANTLR start "rule__Environment__Group_1__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3302:1: rule__Environment__Group_1__1__Impl : ( ( ( rule__Environment__ActionsAssignment_1_1 ) ) ( ( rule__Environment__ActionsAssignment_1_1 )* ) ) ;
    public final void rule__Environment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3306:1: ( ( ( ( rule__Environment__ActionsAssignment_1_1 ) ) ( ( rule__Environment__ActionsAssignment_1_1 )* ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3307:1: ( ( ( rule__Environment__ActionsAssignment_1_1 ) ) ( ( rule__Environment__ActionsAssignment_1_1 )* ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3307:1: ( ( ( rule__Environment__ActionsAssignment_1_1 ) ) ( ( rule__Environment__ActionsAssignment_1_1 )* ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3308:1: ( ( rule__Environment__ActionsAssignment_1_1 ) ) ( ( rule__Environment__ActionsAssignment_1_1 )* )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3308:1: ( ( rule__Environment__ActionsAssignment_1_1 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3309:1: ( rule__Environment__ActionsAssignment_1_1 )
            {
             before(grammarAccess.getEnvironmentAccess().getActionsAssignment_1_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3310:1: ( rule__Environment__ActionsAssignment_1_1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3310:2: rule__Environment__ActionsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Environment__ActionsAssignment_1_1_in_rule__Environment__Group_1__1__Impl6677);
            rule__Environment__ActionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getActionsAssignment_1_1()); 

            }

            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3313:1: ( ( rule__Environment__ActionsAssignment_1_1 )* )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3314:1: ( rule__Environment__ActionsAssignment_1_1 )*
            {
             before(grammarAccess.getEnvironmentAccess().getActionsAssignment_1_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3315:1: ( rule__Environment__ActionsAssignment_1_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3315:2: rule__Environment__ActionsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Environment__ActionsAssignment_1_1_in_rule__Environment__Group_1__1__Impl6689);
            	    rule__Environment__ActionsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getEnvironmentAccess().getActionsAssignment_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_1__1__Impl"


    // $ANTLR start "rule__Environment__Group_1__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3326:1: rule__Environment__Group_1__2 : rule__Environment__Group_1__2__Impl rule__Environment__Group_1__3 ;
    public final void rule__Environment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3330:1: ( rule__Environment__Group_1__2__Impl rule__Environment__Group_1__3 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3331:2: rule__Environment__Group_1__2__Impl rule__Environment__Group_1__3
            {
            pushFollow(FOLLOW_rule__Environment__Group_1__2__Impl_in_rule__Environment__Group_1__26722);
            rule__Environment__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group_1__3_in_rule__Environment__Group_1__26725);
            rule__Environment__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_1__2"


    // $ANTLR start "rule__Environment__Group_1__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3338:1: rule__Environment__Group_1__2__Impl : ( '}|' ) ;
    public final void rule__Environment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3342:1: ( ( '}|' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3343:1: ( '}|' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3343:1: ( '}|' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3344:1: '}|'
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketVerticalLineKeyword_1_2()); 
            match(input,36,FOLLOW_36_in_rule__Environment__Group_1__2__Impl6753); 
             after(grammarAccess.getEnvironmentAccess().getRightCurlyBracketVerticalLineKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_1__2__Impl"


    // $ANTLR start "rule__Environment__Group_1__3"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3357:1: rule__Environment__Group_1__3 : rule__Environment__Group_1__3__Impl ;
    public final void rule__Environment__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3361:1: ( rule__Environment__Group_1__3__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3362:2: rule__Environment__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Environment__Group_1__3__Impl_in_rule__Environment__Group_1__36784);
            rule__Environment__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_1__3"


    // $ANTLR start "rule__Environment__Group_1__3__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3368:1: rule__Environment__Group_1__3__Impl : ( ( rule__Environment__ModulesAssignment_1_3 ) ) ;
    public final void rule__Environment__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3372:1: ( ( ( rule__Environment__ModulesAssignment_1_3 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3373:1: ( ( rule__Environment__ModulesAssignment_1_3 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3373:1: ( ( rule__Environment__ModulesAssignment_1_3 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3374:1: ( rule__Environment__ModulesAssignment_1_3 )
            {
             before(grammarAccess.getEnvironmentAccess().getModulesAssignment_1_3()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3375:1: ( rule__Environment__ModulesAssignment_1_3 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3375:2: rule__Environment__ModulesAssignment_1_3
            {
            pushFollow(FOLLOW_rule__Environment__ModulesAssignment_1_3_in_rule__Environment__Group_1__3__Impl6811);
            rule__Environment__ModulesAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getModulesAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_1__3__Impl"


    // $ANTLR start "rule__Logical__Group__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3393:1: rule__Logical__Group__0 : rule__Logical__Group__0__Impl rule__Logical__Group__1 ;
    public final void rule__Logical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3397:1: ( rule__Logical__Group__0__Impl rule__Logical__Group__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3398:2: rule__Logical__Group__0__Impl rule__Logical__Group__1
            {
            pushFollow(FOLLOW_rule__Logical__Group__0__Impl_in_rule__Logical__Group__06849);
            rule__Logical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Logical__Group__1_in_rule__Logical__Group__06852);
            rule__Logical__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group__0"


    // $ANTLR start "rule__Logical__Group__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3405:1: rule__Logical__Group__0__Impl : ( ruleRelation ) ;
    public final void rule__Logical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3409:1: ( ( ruleRelation ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3410:1: ( ruleRelation )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3410:1: ( ruleRelation )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3411:1: ruleRelation
            {
             before(grammarAccess.getLogicalAccess().getRelationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRelation_in_rule__Logical__Group__0__Impl6879);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getLogicalAccess().getRelationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group__0__Impl"


    // $ANTLR start "rule__Logical__Group__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3422:1: rule__Logical__Group__1 : rule__Logical__Group__1__Impl ;
    public final void rule__Logical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3426:1: ( rule__Logical__Group__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3427:2: rule__Logical__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Logical__Group__1__Impl_in_rule__Logical__Group__16908);
            rule__Logical__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group__1"


    // $ANTLR start "rule__Logical__Group__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3433:1: rule__Logical__Group__1__Impl : ( ( rule__Logical__Group_1__0 )* ) ;
    public final void rule__Logical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3437:1: ( ( ( rule__Logical__Group_1__0 )* ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3438:1: ( ( rule__Logical__Group_1__0 )* )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3438:1: ( ( rule__Logical__Group_1__0 )* )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3439:1: ( rule__Logical__Group_1__0 )*
            {
             before(grammarAccess.getLogicalAccess().getGroup_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3440:1: ( rule__Logical__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=37 && LA24_0<=38)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3440:2: rule__Logical__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Logical__Group_1__0_in_rule__Logical__Group__1__Impl6935);
            	    rule__Logical__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getLogicalAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group__1__Impl"


    // $ANTLR start "rule__Logical__Group_1__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3454:1: rule__Logical__Group_1__0 : rule__Logical__Group_1__0__Impl rule__Logical__Group_1__1 ;
    public final void rule__Logical__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3458:1: ( rule__Logical__Group_1__0__Impl rule__Logical__Group_1__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3459:2: rule__Logical__Group_1__0__Impl rule__Logical__Group_1__1
            {
            pushFollow(FOLLOW_rule__Logical__Group_1__0__Impl_in_rule__Logical__Group_1__06970);
            rule__Logical__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Logical__Group_1__1_in_rule__Logical__Group_1__06973);
            rule__Logical__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1__0"


    // $ANTLR start "rule__Logical__Group_1__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3466:1: rule__Logical__Group_1__0__Impl : ( ( rule__Logical__Alternatives_1_0 ) ) ;
    public final void rule__Logical__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3470:1: ( ( ( rule__Logical__Alternatives_1_0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3471:1: ( ( rule__Logical__Alternatives_1_0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3471:1: ( ( rule__Logical__Alternatives_1_0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3472:1: ( rule__Logical__Alternatives_1_0 )
            {
             before(grammarAccess.getLogicalAccess().getAlternatives_1_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3473:1: ( rule__Logical__Alternatives_1_0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3473:2: rule__Logical__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Logical__Alternatives_1_0_in_rule__Logical__Group_1__0__Impl7000);
            rule__Logical__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1__0__Impl"


    // $ANTLR start "rule__Logical__Group_1__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3483:1: rule__Logical__Group_1__1 : rule__Logical__Group_1__1__Impl ;
    public final void rule__Logical__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3487:1: ( rule__Logical__Group_1__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3488:2: rule__Logical__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Logical__Group_1__1__Impl_in_rule__Logical__Group_1__17030);
            rule__Logical__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1__1"


    // $ANTLR start "rule__Logical__Group_1__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3494:1: rule__Logical__Group_1__1__Impl : ( ( rule__Logical__RightAssignment_1_1 ) ) ;
    public final void rule__Logical__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3498:1: ( ( ( rule__Logical__RightAssignment_1_1 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3499:1: ( ( rule__Logical__RightAssignment_1_1 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3499:1: ( ( rule__Logical__RightAssignment_1_1 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3500:1: ( rule__Logical__RightAssignment_1_1 )
            {
             before(grammarAccess.getLogicalAccess().getRightAssignment_1_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3501:1: ( rule__Logical__RightAssignment_1_1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3501:2: rule__Logical__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Logical__RightAssignment_1_1_in_rule__Logical__Group_1__1__Impl7057);
            rule__Logical__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1__1__Impl"


    // $ANTLR start "rule__Logical__Group_1_0_0__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3515:1: rule__Logical__Group_1_0_0__0 : rule__Logical__Group_1_0_0__0__Impl rule__Logical__Group_1_0_0__1 ;
    public final void rule__Logical__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3519:1: ( rule__Logical__Group_1_0_0__0__Impl rule__Logical__Group_1_0_0__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3520:2: rule__Logical__Group_1_0_0__0__Impl rule__Logical__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Logical__Group_1_0_0__0__Impl_in_rule__Logical__Group_1_0_0__07091);
            rule__Logical__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Logical__Group_1_0_0__1_in_rule__Logical__Group_1_0_0__07094);
            rule__Logical__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1_0_0__0"


    // $ANTLR start "rule__Logical__Group_1_0_0__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3527:1: rule__Logical__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Logical__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3531:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3532:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3532:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3533:1: ()
            {
             before(grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3534:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3536:1: 
            {
            }

             after(grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Logical__Group_1_0_0__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3546:1: rule__Logical__Group_1_0_0__1 : rule__Logical__Group_1_0_0__1__Impl ;
    public final void rule__Logical__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3550:1: ( rule__Logical__Group_1_0_0__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3551:2: rule__Logical__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Logical__Group_1_0_0__1__Impl_in_rule__Logical__Group_1_0_0__17152);
            rule__Logical__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1_0_0__1"


    // $ANTLR start "rule__Logical__Group_1_0_0__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3557:1: rule__Logical__Group_1_0_0__1__Impl : ( 'and' ) ;
    public final void rule__Logical__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3561:1: ( ( 'and' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3562:1: ( 'and' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3562:1: ( 'and' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3563:1: 'and'
            {
             before(grammarAccess.getLogicalAccess().getAndKeyword_1_0_0_1()); 
            match(input,37,FOLLOW_37_in_rule__Logical__Group_1_0_0__1__Impl7180); 
             after(grammarAccess.getLogicalAccess().getAndKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Logical__Group_1_0_1__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3580:1: rule__Logical__Group_1_0_1__0 : rule__Logical__Group_1_0_1__0__Impl rule__Logical__Group_1_0_1__1 ;
    public final void rule__Logical__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3584:1: ( rule__Logical__Group_1_0_1__0__Impl rule__Logical__Group_1_0_1__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3585:2: rule__Logical__Group_1_0_1__0__Impl rule__Logical__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Logical__Group_1_0_1__0__Impl_in_rule__Logical__Group_1_0_1__07215);
            rule__Logical__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Logical__Group_1_0_1__1_in_rule__Logical__Group_1_0_1__07218);
            rule__Logical__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1_0_1__0"


    // $ANTLR start "rule__Logical__Group_1_0_1__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3592:1: rule__Logical__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Logical__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3596:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3597:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3597:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3598:1: ()
            {
             before(grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3599:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3601:1: 
            {
            }

             after(grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Logical__Group_1_0_1__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3611:1: rule__Logical__Group_1_0_1__1 : rule__Logical__Group_1_0_1__1__Impl ;
    public final void rule__Logical__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3615:1: ( rule__Logical__Group_1_0_1__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3616:2: rule__Logical__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Logical__Group_1_0_1__1__Impl_in_rule__Logical__Group_1_0_1__17276);
            rule__Logical__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1_0_1__1"


    // $ANTLR start "rule__Logical__Group_1_0_1__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3622:1: rule__Logical__Group_1_0_1__1__Impl : ( 'or' ) ;
    public final void rule__Logical__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3626:1: ( ( 'or' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3627:1: ( 'or' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3627:1: ( 'or' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3628:1: 'or'
            {
             before(grammarAccess.getLogicalAccess().getOrKeyword_1_0_1_1()); 
            match(input,38,FOLLOW_38_in_rule__Logical__Group_1_0_1__1__Impl7304); 
             after(grammarAccess.getLogicalAccess().getOrKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3645:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3649:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3650:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__07339);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__07342);
            rule__Relation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3657:1: rule__Relation__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3661:1: ( ( ruleAddition ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3662:1: ( ruleAddition )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3662:1: ( ruleAddition )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3663:1: ruleAddition
            {
             before(grammarAccess.getRelationAccess().getAdditionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Relation__Group__0__Impl7369);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getAdditionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3674:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3678:1: ( rule__Relation__Group__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3679:2: rule__Relation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__17398);
            rule__Relation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3685:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__Group_1__0 )? ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3689:1: ( ( ( rule__Relation__Group_1__0 )? ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3690:1: ( ( rule__Relation__Group_1__0 )? )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3690:1: ( ( rule__Relation__Group_1__0 )? )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3691:1: ( rule__Relation__Group_1__0 )?
            {
             before(grammarAccess.getRelationAccess().getGroup_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3692:1: ( rule__Relation__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32||(LA25_0>=39 && LA25_0<=42)) ) {
                alt25=1;
            }
            else if ( (LA25_0==33) ) {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==RULE_ID) ) {
                    int LA25_4 = input.LA(3);

                    if ( (LA25_4==EOF||LA25_4==15||(LA25_4>=19 && LA25_4<=20)||LA25_4==22||(LA25_4>=27 && LA25_4<=28)||(LA25_4>=30 && LA25_4<=31)||LA25_4==33||(LA25_4>=37 && LA25_4<=38)||(LA25_4>=43 && LA25_4<=46)||LA25_4==48) ) {
                        alt25=1;
                    }
                }
                else if ( ((LA25_2>=RULE_INT && LA25_2<=RULE_BOOL)||LA25_2==47||(LA25_2>=49 && LA25_2<=50)||LA25_2==53) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3692:2: rule__Relation__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Relation__Group_1__0_in_rule__Relation__Group__1__Impl7425);
                    rule__Relation__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group_1__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3706:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3710:1: ( rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3711:2: rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_1__0__Impl_in_rule__Relation__Group_1__07460);
            rule__Relation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_1__1_in_rule__Relation__Group_1__07463);
            rule__Relation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__0"


    // $ANTLR start "rule__Relation__Group_1__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3718:1: rule__Relation__Group_1__0__Impl : ( ( rule__Relation__Alternatives_1_0 ) ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3722:1: ( ( ( rule__Relation__Alternatives_1_0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3723:1: ( ( rule__Relation__Alternatives_1_0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3723:1: ( ( rule__Relation__Alternatives_1_0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3724:1: ( rule__Relation__Alternatives_1_0 )
            {
             before(grammarAccess.getRelationAccess().getAlternatives_1_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3725:1: ( rule__Relation__Alternatives_1_0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3725:2: rule__Relation__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Relation__Alternatives_1_0_in_rule__Relation__Group_1__0__Impl7490);
            rule__Relation__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__0__Impl"


    // $ANTLR start "rule__Relation__Group_1__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3735:1: rule__Relation__Group_1__1 : rule__Relation__Group_1__1__Impl ;
    public final void rule__Relation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3739:1: ( rule__Relation__Group_1__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3740:2: rule__Relation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_1__1__Impl_in_rule__Relation__Group_1__17520);
            rule__Relation__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__1"


    // $ANTLR start "rule__Relation__Group_1__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3746:1: rule__Relation__Group_1__1__Impl : ( ( rule__Relation__RightAssignment_1_1 ) ) ;
    public final void rule__Relation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3750:1: ( ( ( rule__Relation__RightAssignment_1_1 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3751:1: ( ( rule__Relation__RightAssignment_1_1 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3751:1: ( ( rule__Relation__RightAssignment_1_1 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3752:1: ( rule__Relation__RightAssignment_1_1 )
            {
             before(grammarAccess.getRelationAccess().getRightAssignment_1_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3753:1: ( rule__Relation__RightAssignment_1_1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3753:2: rule__Relation__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Relation__RightAssignment_1_1_in_rule__Relation__Group_1__1__Impl7547);
            rule__Relation__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__1__Impl"


    // $ANTLR start "rule__Relation__Group_1_0_0__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3767:1: rule__Relation__Group_1_0_0__0 : rule__Relation__Group_1_0_0__0__Impl rule__Relation__Group_1_0_0__1 ;
    public final void rule__Relation__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3771:1: ( rule__Relation__Group_1_0_0__0__Impl rule__Relation__Group_1_0_0__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3772:2: rule__Relation__Group_1_0_0__0__Impl rule__Relation__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0_0__0__Impl_in_rule__Relation__Group_1_0_0__07581);
            rule__Relation__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_1_0_0__1_in_rule__Relation__Group_1_0_0__07584);
            rule__Relation__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_0__0"


    // $ANTLR start "rule__Relation__Group_1_0_0__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3779:1: rule__Relation__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Relation__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3783:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3784:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3784:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3785:1: ()
            {
             before(grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3786:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3788:1: 
            {
            }

             after(grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Relation__Group_1_0_0__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3798:1: rule__Relation__Group_1_0_0__1 : rule__Relation__Group_1_0_0__1__Impl ;
    public final void rule__Relation__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3802:1: ( rule__Relation__Group_1_0_0__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3803:2: rule__Relation__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0_0__1__Impl_in_rule__Relation__Group_1_0_0__17642);
            rule__Relation__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_0__1"


    // $ANTLR start "rule__Relation__Group_1_0_0__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3809:1: rule__Relation__Group_1_0_0__1__Impl : ( '<=' ) ;
    public final void rule__Relation__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3813:1: ( ( '<=' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3814:1: ( '<=' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3814:1: ( '<=' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3815:1: '<='
            {
             before(grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_1_0_0_1()); 
            match(input,39,FOLLOW_39_in_rule__Relation__Group_1_0_0__1__Impl7670); 
             after(grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Relation__Group_1_0_1__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3832:1: rule__Relation__Group_1_0_1__0 : rule__Relation__Group_1_0_1__0__Impl rule__Relation__Group_1_0_1__1 ;
    public final void rule__Relation__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3836:1: ( rule__Relation__Group_1_0_1__0__Impl rule__Relation__Group_1_0_1__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3837:2: rule__Relation__Group_1_0_1__0__Impl rule__Relation__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0_1__0__Impl_in_rule__Relation__Group_1_0_1__07705);
            rule__Relation__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_1_0_1__1_in_rule__Relation__Group_1_0_1__07708);
            rule__Relation__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_1__0"


    // $ANTLR start "rule__Relation__Group_1_0_1__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3844:1: rule__Relation__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Relation__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3848:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3849:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3849:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3850:1: ()
            {
             before(grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3851:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3853:1: 
            {
            }

             after(grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Relation__Group_1_0_1__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3863:1: rule__Relation__Group_1_0_1__1 : rule__Relation__Group_1_0_1__1__Impl ;
    public final void rule__Relation__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3867:1: ( rule__Relation__Group_1_0_1__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3868:2: rule__Relation__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0_1__1__Impl_in_rule__Relation__Group_1_0_1__17766);
            rule__Relation__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_1__1"


    // $ANTLR start "rule__Relation__Group_1_0_1__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3874:1: rule__Relation__Group_1_0_1__1__Impl : ( '<' ) ;
    public final void rule__Relation__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3878:1: ( ( '<' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3879:1: ( '<' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3879:1: ( '<' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3880:1: '<'
            {
             before(grammarAccess.getRelationAccess().getLessThanSignKeyword_1_0_1_1()); 
            match(input,32,FOLLOW_32_in_rule__Relation__Group_1_0_1__1__Impl7794); 
             after(grammarAccess.getRelationAccess().getLessThanSignKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Relation__Group_1_0_2__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3897:1: rule__Relation__Group_1_0_2__0 : rule__Relation__Group_1_0_2__0__Impl rule__Relation__Group_1_0_2__1 ;
    public final void rule__Relation__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3901:1: ( rule__Relation__Group_1_0_2__0__Impl rule__Relation__Group_1_0_2__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3902:2: rule__Relation__Group_1_0_2__0__Impl rule__Relation__Group_1_0_2__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0_2__0__Impl_in_rule__Relation__Group_1_0_2__07829);
            rule__Relation__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_1_0_2__1_in_rule__Relation__Group_1_0_2__07832);
            rule__Relation__Group_1_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_2__0"


    // $ANTLR start "rule__Relation__Group_1_0_2__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3909:1: rule__Relation__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Relation__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3913:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3914:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3914:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3915:1: ()
            {
             before(grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3916:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3918:1: 
            {
            }

             after(grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Relation__Group_1_0_2__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3928:1: rule__Relation__Group_1_0_2__1 : rule__Relation__Group_1_0_2__1__Impl ;
    public final void rule__Relation__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3932:1: ( rule__Relation__Group_1_0_2__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3933:2: rule__Relation__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0_2__1__Impl_in_rule__Relation__Group_1_0_2__17890);
            rule__Relation__Group_1_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_2__1"


    // $ANTLR start "rule__Relation__Group_1_0_2__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3939:1: rule__Relation__Group_1_0_2__1__Impl : ( '==' ) ;
    public final void rule__Relation__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3943:1: ( ( '==' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3944:1: ( '==' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3944:1: ( '==' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3945:1: '=='
            {
             before(grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_1_0_2_1()); 
            match(input,40,FOLLOW_40_in_rule__Relation__Group_1_0_2__1__Impl7918); 
             after(grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_1_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__Relation__Group_1_0_3__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3962:1: rule__Relation__Group_1_0_3__0 : rule__Relation__Group_1_0_3__0__Impl rule__Relation__Group_1_0_3__1 ;
    public final void rule__Relation__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3966:1: ( rule__Relation__Group_1_0_3__0__Impl rule__Relation__Group_1_0_3__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3967:2: rule__Relation__Group_1_0_3__0__Impl rule__Relation__Group_1_0_3__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0_3__0__Impl_in_rule__Relation__Group_1_0_3__07953);
            rule__Relation__Group_1_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_1_0_3__1_in_rule__Relation__Group_1_0_3__07956);
            rule__Relation__Group_1_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_3__0"


    // $ANTLR start "rule__Relation__Group_1_0_3__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3974:1: rule__Relation__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Relation__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3978:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3979:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3979:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3980:1: ()
            {
             before(grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3981:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3983:1: 
            {
            }

             after(grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__Relation__Group_1_0_3__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3993:1: rule__Relation__Group_1_0_3__1 : rule__Relation__Group_1_0_3__1__Impl ;
    public final void rule__Relation__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3997:1: ( rule__Relation__Group_1_0_3__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:3998:2: rule__Relation__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0_3__1__Impl_in_rule__Relation__Group_1_0_3__18014);
            rule__Relation__Group_1_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_3__1"


    // $ANTLR start "rule__Relation__Group_1_0_3__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4004:1: rule__Relation__Group_1_0_3__1__Impl : ( '!=' ) ;
    public final void rule__Relation__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4008:1: ( ( '!=' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4009:1: ( '!=' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4009:1: ( '!=' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4010:1: '!='
            {
             before(grammarAccess.getRelationAccess().getExclamationMarkEqualsSignKeyword_1_0_3_1()); 
            match(input,41,FOLLOW_41_in_rule__Relation__Group_1_0_3__1__Impl8042); 
             after(grammarAccess.getRelationAccess().getExclamationMarkEqualsSignKeyword_1_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__Relation__Group_1_0_4__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4027:1: rule__Relation__Group_1_0_4__0 : rule__Relation__Group_1_0_4__0__Impl rule__Relation__Group_1_0_4__1 ;
    public final void rule__Relation__Group_1_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4031:1: ( rule__Relation__Group_1_0_4__0__Impl rule__Relation__Group_1_0_4__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4032:2: rule__Relation__Group_1_0_4__0__Impl rule__Relation__Group_1_0_4__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0_4__0__Impl_in_rule__Relation__Group_1_0_4__08077);
            rule__Relation__Group_1_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_1_0_4__1_in_rule__Relation__Group_1_0_4__08080);
            rule__Relation__Group_1_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_4__0"


    // $ANTLR start "rule__Relation__Group_1_0_4__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4039:1: rule__Relation__Group_1_0_4__0__Impl : ( () ) ;
    public final void rule__Relation__Group_1_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4043:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4044:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4044:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4045:1: ()
            {
             before(grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4046:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4048:1: 
            {
            }

             after(grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_4__0__Impl"


    // $ANTLR start "rule__Relation__Group_1_0_4__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4058:1: rule__Relation__Group_1_0_4__1 : rule__Relation__Group_1_0_4__1__Impl ;
    public final void rule__Relation__Group_1_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4062:1: ( rule__Relation__Group_1_0_4__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4063:2: rule__Relation__Group_1_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0_4__1__Impl_in_rule__Relation__Group_1_0_4__18138);
            rule__Relation__Group_1_0_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_4__1"


    // $ANTLR start "rule__Relation__Group_1_0_4__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4069:1: rule__Relation__Group_1_0_4__1__Impl : ( '>=' ) ;
    public final void rule__Relation__Group_1_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4073:1: ( ( '>=' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4074:1: ( '>=' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4074:1: ( '>=' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4075:1: '>='
            {
             before(grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_1_0_4_1()); 
            match(input,42,FOLLOW_42_in_rule__Relation__Group_1_0_4__1__Impl8166); 
             after(grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_1_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_4__1__Impl"


    // $ANTLR start "rule__Relation__Group_1_0_5__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4092:1: rule__Relation__Group_1_0_5__0 : rule__Relation__Group_1_0_5__0__Impl rule__Relation__Group_1_0_5__1 ;
    public final void rule__Relation__Group_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4096:1: ( rule__Relation__Group_1_0_5__0__Impl rule__Relation__Group_1_0_5__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4097:2: rule__Relation__Group_1_0_5__0__Impl rule__Relation__Group_1_0_5__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0_5__0__Impl_in_rule__Relation__Group_1_0_5__08201);
            rule__Relation__Group_1_0_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_1_0_5__1_in_rule__Relation__Group_1_0_5__08204);
            rule__Relation__Group_1_0_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_5__0"


    // $ANTLR start "rule__Relation__Group_1_0_5__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4104:1: rule__Relation__Group_1_0_5__0__Impl : ( () ) ;
    public final void rule__Relation__Group_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4108:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4109:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4109:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4110:1: ()
            {
             before(grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4111:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4113:1: 
            {
            }

             after(grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_5__0__Impl"


    // $ANTLR start "rule__Relation__Group_1_0_5__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4123:1: rule__Relation__Group_1_0_5__1 : rule__Relation__Group_1_0_5__1__Impl ;
    public final void rule__Relation__Group_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4127:1: ( rule__Relation__Group_1_0_5__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4128:2: rule__Relation__Group_1_0_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0_5__1__Impl_in_rule__Relation__Group_1_0_5__18262);
            rule__Relation__Group_1_0_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_5__1"


    // $ANTLR start "rule__Relation__Group_1_0_5__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4134:1: rule__Relation__Group_1_0_5__1__Impl : ( '>' ) ;
    public final void rule__Relation__Group_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4138:1: ( ( '>' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4139:1: ( '>' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4139:1: ( '>' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4140:1: '>'
            {
             before(grammarAccess.getRelationAccess().getGreaterThanSignKeyword_1_0_5_1()); 
            match(input,33,FOLLOW_33_in_rule__Relation__Group_1_0_5__1__Impl8290); 
             after(grammarAccess.getRelationAccess().getGreaterThanSignKeyword_1_0_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0_5__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4157:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4161:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4162:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__08325);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__08328);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4169:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4173:1: ( ( ruleMultiplication ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4174:1: ( ruleMultiplication )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4174:1: ( ruleMultiplication )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4175:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl8355);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4186:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4190:1: ( rule__Addition__Group__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4191:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__18384);
            rule__Addition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4197:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4201:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4202:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4202:1: ( ( rule__Addition__Group_1__0 )* )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4203:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4204:1: ( rule__Addition__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=43 && LA26_0<=44)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4204:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl8411);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4218:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4222:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4223:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__08446);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__08449);
            rule__Addition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4230:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4234:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4235:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4235:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4236:1: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4237:1: ( rule__Addition__Alternatives_1_0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4237:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl8476);
            rule__Addition__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4247:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4251:1: ( rule__Addition__Group_1__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4252:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__18506);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4258:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4262:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4263:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4263:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4264:1: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4265:1: ( rule__Addition__RightAssignment_1_1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4265:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl8533);
            rule__Addition__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4279:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4283:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4284:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__08567);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__08570);
            rule__Addition__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0"


    // $ANTLR start "rule__Addition__Group_1_0_0__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4291:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4295:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4296:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4296:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4297:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4298:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4300:1: 
            {
            }

             after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4310:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4314:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4315:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__18628);
            rule__Addition__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1"


    // $ANTLR start "rule__Addition__Group_1_0_0__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4321:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4325:1: ( ( '+' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4326:1: ( '+' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4326:1: ( '+' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4327:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,43,FOLLOW_43_in_rule__Addition__Group_1_0_0__1__Impl8656); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4344:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4348:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4349:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__08691);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__08694);
            rule__Addition__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0"


    // $ANTLR start "rule__Addition__Group_1_0_1__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4356:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4360:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4361:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4361:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4362:1: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4363:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4365:1: 
            {
            }

             after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4375:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4379:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4380:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__18752);
            rule__Addition__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1"


    // $ANTLR start "rule__Addition__Group_1_0_1__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4386:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4390:1: ( ( '-' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4391:1: ( '-' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4391:1: ( '-' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4392:1: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,44,FOLLOW_44_in_rule__Addition__Group_1_0_1__1__Impl8780); 
             after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4409:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4413:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4414:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__08815);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__08818);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4421:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4425:1: ( ( rulePrimaryExpression ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4426:1: ( rulePrimaryExpression )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4426:1: ( rulePrimaryExpression )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4427:1: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Multiplication__Group__0__Impl8845);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4438:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4442:1: ( rule__Multiplication__Group__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4443:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__18874);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4449:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4453:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4454:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4454:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4455:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4456:1: ( rule__Multiplication__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=45 && LA27_0<=46)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4456:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl8901);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4470:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4474:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4475:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__08936);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__08939);
            rule__Multiplication__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4482:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4486:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4487:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4487:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4488:1: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4489:1: ( rule__Multiplication__Alternatives_1_0 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4489:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl8966);
            rule__Multiplication__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4499:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4503:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4504:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__18996);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4510:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4514:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4515:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4515:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4516:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4517:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4517:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl9023);
            rule__Multiplication__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4531:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4535:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4536:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__09057);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__09060);
            rule__Multiplication__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4543:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4547:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4548:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4548:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4549:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4550:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4552:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4562:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4566:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4567:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__19118);
            rule__Multiplication__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4573:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4577:1: ( ( '*' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4578:1: ( '*' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4578:1: ( '*' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4579:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,45,FOLLOW_45_in_rule__Multiplication__Group_1_0_0__1__Impl9146); 
             after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4596:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4600:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4601:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__09181);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__09184);
            rule__Multiplication__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4608:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4612:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4613:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4613:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4614:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4615:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4617:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4627:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4631:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4632:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__19242);
            rule__Multiplication__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4638:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4642:1: ( ( '/' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4643:1: ( '/' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4643:1: ( '/' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4644:1: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,46,FOLLOW_46_in_rule__Multiplication__Group_1_0_1__1__Impl9270); 
             after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4661:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4665:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4666:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__09305);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__09308);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4673:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4677:1: ( ( '(' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4678:1: ( '(' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4678:1: ( '(' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4679:1: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,47,FOLLOW_47_in_rule__PrimaryExpression__Group_0__0__Impl9336); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4692:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4696:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4697:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__19367);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__19370);
            rule__PrimaryExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4704:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4708:1: ( ( ruleExpression ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4709:1: ( ruleExpression )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4709:1: ( ruleExpression )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4710:1: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl9397);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4721:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4725:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4726:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__29426);
            rule__PrimaryExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4732:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4736:1: ( ( ')' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4737:1: ( ')' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4737:1: ( ')' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4738:1: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,48,FOLLOW_48_in_rule__PrimaryExpression__Group_0__2__Impl9454); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4757:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4761:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4762:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__09491);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__09494);
            rule__PrimaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4769:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4773:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4774:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4774:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4775:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4776:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4778:1: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4788:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4792:1: ( rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4793:2: rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__19552);
            rule__PrimaryExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__2_in_rule__PrimaryExpression__Group_1__19555);
            rule__PrimaryExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4800:1: rule__PrimaryExpression__Group_1__1__Impl : ( 'not' ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4804:1: ( ( 'not' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4805:1: ( 'not' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4805:1: ( 'not' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4806:1: 'not'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNotKeyword_1_1()); 
            match(input,49,FOLLOW_49_in_rule__PrimaryExpression__Group_1__1__Impl9583); 
             after(grammarAccess.getPrimaryExpressionAccess().getNotKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4819:1: rule__PrimaryExpression__Group_1__2 : rule__PrimaryExpression__Group_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4823:1: ( rule__PrimaryExpression__Group_1__2__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4824:2: rule__PrimaryExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__2__Impl_in_rule__PrimaryExpression__Group_1__29614);
            rule__PrimaryExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__2"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4830:1: rule__PrimaryExpression__Group_1__2__Impl : ( ( rule__PrimaryExpression__CondAssignment_1_2 ) ) ;
    public final void rule__PrimaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4834:1: ( ( ( rule__PrimaryExpression__CondAssignment_1_2 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4835:1: ( ( rule__PrimaryExpression__CondAssignment_1_2 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4835:1: ( ( rule__PrimaryExpression__CondAssignment_1_2 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4836:1: ( rule__PrimaryExpression__CondAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getCondAssignment_1_2()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4837:1: ( rule__PrimaryExpression__CondAssignment_1_2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4837:2: rule__PrimaryExpression__CondAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__CondAssignment_1_2_in_rule__PrimaryExpression__Group_1__2__Impl9641);
            rule__PrimaryExpression__CondAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getCondAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4853:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4857:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4858:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__09677);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__09680);
            rule__PrimaryExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4865:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4869:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4870:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4870:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4871:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLiteralAction_2_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4872:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4874:1: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getLiteralAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4884:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4888:1: ( rule__PrimaryExpression__Group_2__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4889:2: rule__PrimaryExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__19738);
            rule__PrimaryExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4895:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4899:1: ( ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4900:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4900:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4901:1: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4902:1: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4902:2: rule__PrimaryExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_2_1_in_rule__PrimaryExpression__Group_2__1__Impl9765);
            rule__PrimaryExpression__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4916:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4920:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4921:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__0__Impl_in_rule__PrimaryExpression__Group_3__09799);
            rule__PrimaryExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__1_in_rule__PrimaryExpression__Group_3__09802);
            rule__PrimaryExpression__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__0"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4928:1: rule__PrimaryExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4932:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4933:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4933:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4934:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getQuantifierAction_3_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4935:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4937:1: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getQuantifierAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4947:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4951:1: ( rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4952:2: rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__1__Impl_in_rule__PrimaryExpression__Group_3__19860);
            rule__PrimaryExpression__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__2_in_rule__PrimaryExpression__Group_3__19863);
            rule__PrimaryExpression__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__1"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4959:1: rule__PrimaryExpression__Group_3__1__Impl : ( 'exists' ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4963:1: ( ( 'exists' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4964:1: ( 'exists' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4964:1: ( 'exists' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4965:1: 'exists'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExistsKeyword_3_1()); 
            match(input,50,FOLLOW_50_in_rule__PrimaryExpression__Group_3__1__Impl9891); 
             after(grammarAccess.getPrimaryExpressionAccess().getExistsKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4978:1: rule__PrimaryExpression__Group_3__2 : rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3 ;
    public final void rule__PrimaryExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4982:1: ( rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4983:2: rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__2__Impl_in_rule__PrimaryExpression__Group_3__29922);
            rule__PrimaryExpression__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__3_in_rule__PrimaryExpression__Group_3__29925);
            rule__PrimaryExpression__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__2"


    // $ANTLR start "rule__PrimaryExpression__Group_3__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4990:1: rule__PrimaryExpression__Group_3__2__Impl : ( ( rule__PrimaryExpression__NameAssignment_3_2 ) ) ;
    public final void rule__PrimaryExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4994:1: ( ( ( rule__PrimaryExpression__NameAssignment_3_2 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4995:1: ( ( rule__PrimaryExpression__NameAssignment_3_2 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4995:1: ( ( rule__PrimaryExpression__NameAssignment_3_2 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4996:1: ( rule__PrimaryExpression__NameAssignment_3_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNameAssignment_3_2()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4997:1: ( rule__PrimaryExpression__NameAssignment_3_2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:4997:2: rule__PrimaryExpression__NameAssignment_3_2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__NameAssignment_3_2_in_rule__PrimaryExpression__Group_3__2__Impl9952);
            rule__PrimaryExpression__NameAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getNameAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__3"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5007:1: rule__PrimaryExpression__Group_3__3 : rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4 ;
    public final void rule__PrimaryExpression__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5011:1: ( rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5012:2: rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__3__Impl_in_rule__PrimaryExpression__Group_3__39982);
            rule__PrimaryExpression__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__4_in_rule__PrimaryExpression__Group_3__39985);
            rule__PrimaryExpression__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__3"


    // $ANTLR start "rule__PrimaryExpression__Group_3__3__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5019:1: rule__PrimaryExpression__Group_3__3__Impl : ( ':' ) ;
    public final void rule__PrimaryExpression__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5023:1: ( ( ':' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5024:1: ( ':' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5024:1: ( ':' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5025:1: ':'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getColonKeyword_3_3()); 
            match(input,51,FOLLOW_51_in_rule__PrimaryExpression__Group_3__3__Impl10013); 
             after(grammarAccess.getPrimaryExpressionAccess().getColonKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__4"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5038:1: rule__PrimaryExpression__Group_3__4 : rule__PrimaryExpression__Group_3__4__Impl rule__PrimaryExpression__Group_3__5 ;
    public final void rule__PrimaryExpression__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5042:1: ( rule__PrimaryExpression__Group_3__4__Impl rule__PrimaryExpression__Group_3__5 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5043:2: rule__PrimaryExpression__Group_3__4__Impl rule__PrimaryExpression__Group_3__5
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__4__Impl_in_rule__PrimaryExpression__Group_3__410044);
            rule__PrimaryExpression__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__5_in_rule__PrimaryExpression__Group_3__410047);
            rule__PrimaryExpression__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__4"


    // $ANTLR start "rule__PrimaryExpression__Group_3__4__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5050:1: rule__PrimaryExpression__Group_3__4__Impl : ( ( rule__PrimaryExpression__ModuleAssignment_3_4 ) ) ;
    public final void rule__PrimaryExpression__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5054:1: ( ( ( rule__PrimaryExpression__ModuleAssignment_3_4 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5055:1: ( ( rule__PrimaryExpression__ModuleAssignment_3_4 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5055:1: ( ( rule__PrimaryExpression__ModuleAssignment_3_4 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5056:1: ( rule__PrimaryExpression__ModuleAssignment_3_4 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getModuleAssignment_3_4()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5057:1: ( rule__PrimaryExpression__ModuleAssignment_3_4 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5057:2: rule__PrimaryExpression__ModuleAssignment_3_4
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ModuleAssignment_3_4_in_rule__PrimaryExpression__Group_3__4__Impl10074);
            rule__PrimaryExpression__ModuleAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getModuleAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__4__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__5"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5067:1: rule__PrimaryExpression__Group_3__5 : rule__PrimaryExpression__Group_3__5__Impl rule__PrimaryExpression__Group_3__6 ;
    public final void rule__PrimaryExpression__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5071:1: ( rule__PrimaryExpression__Group_3__5__Impl rule__PrimaryExpression__Group_3__6 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5072:2: rule__PrimaryExpression__Group_3__5__Impl rule__PrimaryExpression__Group_3__6
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__5__Impl_in_rule__PrimaryExpression__Group_3__510104);
            rule__PrimaryExpression__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__6_in_rule__PrimaryExpression__Group_3__510107);
            rule__PrimaryExpression__Group_3__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__5"


    // $ANTLR start "rule__PrimaryExpression__Group_3__5__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5079:1: rule__PrimaryExpression__Group_3__5__Impl : ( 'such that' ) ;
    public final void rule__PrimaryExpression__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5083:1: ( ( 'such that' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5084:1: ( 'such that' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5084:1: ( 'such that' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5085:1: 'such that'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getSuchThatKeyword_3_5()); 
            match(input,52,FOLLOW_52_in_rule__PrimaryExpression__Group_3__5__Impl10135); 
             after(grammarAccess.getPrimaryExpressionAccess().getSuchThatKeyword_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__5__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__6"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5098:1: rule__PrimaryExpression__Group_3__6 : rule__PrimaryExpression__Group_3__6__Impl ;
    public final void rule__PrimaryExpression__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5102:1: ( rule__PrimaryExpression__Group_3__6__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5103:2: rule__PrimaryExpression__Group_3__6__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__6__Impl_in_rule__PrimaryExpression__Group_3__610166);
            rule__PrimaryExpression__Group_3__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__6"


    // $ANTLR start "rule__PrimaryExpression__Group_3__6__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5109:1: rule__PrimaryExpression__Group_3__6__Impl : ( ( rule__PrimaryExpression__CondAssignment_3_6 ) ) ;
    public final void rule__PrimaryExpression__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5113:1: ( ( ( rule__PrimaryExpression__CondAssignment_3_6 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5114:1: ( ( rule__PrimaryExpression__CondAssignment_3_6 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5114:1: ( ( rule__PrimaryExpression__CondAssignment_3_6 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5115:1: ( rule__PrimaryExpression__CondAssignment_3_6 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getCondAssignment_3_6()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5116:1: ( rule__PrimaryExpression__CondAssignment_3_6 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5116:2: rule__PrimaryExpression__CondAssignment_3_6
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__CondAssignment_3_6_in_rule__PrimaryExpression__Group_3__6__Impl10193);
            rule__PrimaryExpression__CondAssignment_3_6();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getCondAssignment_3_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__6__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5140:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5144:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5145:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_4__0__Impl_in_rule__PrimaryExpression__Group_4__010237);
            rule__PrimaryExpression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_4__1_in_rule__PrimaryExpression__Group_4__010240);
            rule__PrimaryExpression__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__0"


    // $ANTLR start "rule__PrimaryExpression__Group_4__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5152:1: rule__PrimaryExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5156:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5157:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5157:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5158:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExternalReferenceAction_4_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5159:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5161:1: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getExternalReferenceAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5171:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5175:1: ( rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5176:2: rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_4__1__Impl_in_rule__PrimaryExpression__Group_4__110298);
            rule__PrimaryExpression__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_4__2_in_rule__PrimaryExpression__Group_4__110301);
            rule__PrimaryExpression__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__1"


    // $ANTLR start "rule__PrimaryExpression__Group_4__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5183:1: rule__PrimaryExpression__Group_4__1__Impl : ( ( rule__PrimaryExpression__ModuleAssignment_4_1 ) ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5187:1: ( ( ( rule__PrimaryExpression__ModuleAssignment_4_1 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5188:1: ( ( rule__PrimaryExpression__ModuleAssignment_4_1 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5188:1: ( ( rule__PrimaryExpression__ModuleAssignment_4_1 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5189:1: ( rule__PrimaryExpression__ModuleAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getModuleAssignment_4_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5190:1: ( rule__PrimaryExpression__ModuleAssignment_4_1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5190:2: rule__PrimaryExpression__ModuleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ModuleAssignment_4_1_in_rule__PrimaryExpression__Group_4__1__Impl10328);
            rule__PrimaryExpression__ModuleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getModuleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5200:1: rule__PrimaryExpression__Group_4__2 : rule__PrimaryExpression__Group_4__2__Impl rule__PrimaryExpression__Group_4__3 ;
    public final void rule__PrimaryExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5204:1: ( rule__PrimaryExpression__Group_4__2__Impl rule__PrimaryExpression__Group_4__3 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5205:2: rule__PrimaryExpression__Group_4__2__Impl rule__PrimaryExpression__Group_4__3
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_4__2__Impl_in_rule__PrimaryExpression__Group_4__210358);
            rule__PrimaryExpression__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_4__3_in_rule__PrimaryExpression__Group_4__210361);
            rule__PrimaryExpression__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__2"


    // $ANTLR start "rule__PrimaryExpression__Group_4__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5212:1: rule__PrimaryExpression__Group_4__2__Impl : ( '.' ) ;
    public final void rule__PrimaryExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5216:1: ( ( '.' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5217:1: ( '.' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5217:1: ( '.' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5218:1: '.'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_4_2()); 
            match(input,20,FOLLOW_20_in_rule__PrimaryExpression__Group_4__2__Impl10389); 
             after(grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__3"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5231:1: rule__PrimaryExpression__Group_4__3 : rule__PrimaryExpression__Group_4__3__Impl ;
    public final void rule__PrimaryExpression__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5235:1: ( rule__PrimaryExpression__Group_4__3__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5236:2: rule__PrimaryExpression__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_4__3__Impl_in_rule__PrimaryExpression__Group_4__310420);
            rule__PrimaryExpression__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__3"


    // $ANTLR start "rule__PrimaryExpression__Group_4__3__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5242:1: rule__PrimaryExpression__Group_4__3__Impl : ( ( rule__PrimaryExpression__VariableAssignment_4_3 ) ) ;
    public final void rule__PrimaryExpression__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5246:1: ( ( ( rule__PrimaryExpression__VariableAssignment_4_3 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5247:1: ( ( rule__PrimaryExpression__VariableAssignment_4_3 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5247:1: ( ( rule__PrimaryExpression__VariableAssignment_4_3 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5248:1: ( rule__PrimaryExpression__VariableAssignment_4_3 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getVariableAssignment_4_3()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5249:1: ( rule__PrimaryExpression__VariableAssignment_4_3 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5249:2: rule__PrimaryExpression__VariableAssignment_4_3
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__VariableAssignment_4_3_in_rule__PrimaryExpression__Group_4__3__Impl10447);
            rule__PrimaryExpression__VariableAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getVariableAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_5__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5267:1: rule__PrimaryExpression__Group_5__0 : rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 ;
    public final void rule__PrimaryExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5271:1: ( rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5272:2: rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__0__Impl_in_rule__PrimaryExpression__Group_5__010485);
            rule__PrimaryExpression__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__1_in_rule__PrimaryExpression__Group_5__010488);
            rule__PrimaryExpression__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_5__0"


    // $ANTLR start "rule__PrimaryExpression__Group_5__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5279:1: rule__PrimaryExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5283:1: ( ( () ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5284:1: ( () )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5284:1: ( () )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5285:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLocalReferenceAction_5_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5286:1: ()
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5288:1: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getLocalReferenceAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_5__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_5__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5298:1: rule__PrimaryExpression__Group_5__1 : rule__PrimaryExpression__Group_5__1__Impl rule__PrimaryExpression__Group_5__2 ;
    public final void rule__PrimaryExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5302:1: ( rule__PrimaryExpression__Group_5__1__Impl rule__PrimaryExpression__Group_5__2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5303:2: rule__PrimaryExpression__Group_5__1__Impl rule__PrimaryExpression__Group_5__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__1__Impl_in_rule__PrimaryExpression__Group_5__110546);
            rule__PrimaryExpression__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__2_in_rule__PrimaryExpression__Group_5__110549);
            rule__PrimaryExpression__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_5__1"


    // $ANTLR start "rule__PrimaryExpression__Group_5__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5310:1: rule__PrimaryExpression__Group_5__1__Impl : ( ( rule__PrimaryExpression__Group_5_1__0 )? ) ;
    public final void rule__PrimaryExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5314:1: ( ( ( rule__PrimaryExpression__Group_5_1__0 )? ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5315:1: ( ( rule__PrimaryExpression__Group_5_1__0 )? )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5315:1: ( ( rule__PrimaryExpression__Group_5_1__0 )? )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5316:1: ( rule__PrimaryExpression__Group_5_1__0 )?
            {
             before(grammarAccess.getPrimaryExpressionAccess().getGroup_5_1()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5317:1: ( rule__PrimaryExpression__Group_5_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==53) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5317:2: rule__PrimaryExpression__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_5_1__0_in_rule__PrimaryExpression__Group_5__1__Impl10576);
                    rule__PrimaryExpression__Group_5_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimaryExpressionAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_5__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_5__2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5327:1: rule__PrimaryExpression__Group_5__2 : rule__PrimaryExpression__Group_5__2__Impl ;
    public final void rule__PrimaryExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5331:1: ( rule__PrimaryExpression__Group_5__2__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5332:2: rule__PrimaryExpression__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__2__Impl_in_rule__PrimaryExpression__Group_5__210607);
            rule__PrimaryExpression__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_5__2"


    // $ANTLR start "rule__PrimaryExpression__Group_5__2__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5338:1: rule__PrimaryExpression__Group_5__2__Impl : ( ( rule__PrimaryExpression__VariableAssignment_5_2 ) ) ;
    public final void rule__PrimaryExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5342:1: ( ( ( rule__PrimaryExpression__VariableAssignment_5_2 ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5343:1: ( ( rule__PrimaryExpression__VariableAssignment_5_2 ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5343:1: ( ( rule__PrimaryExpression__VariableAssignment_5_2 ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5344:1: ( rule__PrimaryExpression__VariableAssignment_5_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getVariableAssignment_5_2()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5345:1: ( rule__PrimaryExpression__VariableAssignment_5_2 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5345:2: rule__PrimaryExpression__VariableAssignment_5_2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__VariableAssignment_5_2_in_rule__PrimaryExpression__Group_5__2__Impl10634);
            rule__PrimaryExpression__VariableAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getVariableAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_5__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_5_1__0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5361:1: rule__PrimaryExpression__Group_5_1__0 : rule__PrimaryExpression__Group_5_1__0__Impl rule__PrimaryExpression__Group_5_1__1 ;
    public final void rule__PrimaryExpression__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5365:1: ( rule__PrimaryExpression__Group_5_1__0__Impl rule__PrimaryExpression__Group_5_1__1 )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5366:2: rule__PrimaryExpression__Group_5_1__0__Impl rule__PrimaryExpression__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5_1__0__Impl_in_rule__PrimaryExpression__Group_5_1__010670);
            rule__PrimaryExpression__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5_1__1_in_rule__PrimaryExpression__Group_5_1__010673);
            rule__PrimaryExpression__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_5_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_5_1__0__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5373:1: rule__PrimaryExpression__Group_5_1__0__Impl : ( 'this' ) ;
    public final void rule__PrimaryExpression__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5377:1: ( ( 'this' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5378:1: ( 'this' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5378:1: ( 'this' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5379:1: 'this'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getThisKeyword_5_1_0()); 
            match(input,53,FOLLOW_53_in_rule__PrimaryExpression__Group_5_1__0__Impl10701); 
             after(grammarAccess.getPrimaryExpressionAccess().getThisKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_5_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_5_1__1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5392:1: rule__PrimaryExpression__Group_5_1__1 : rule__PrimaryExpression__Group_5_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5396:1: ( rule__PrimaryExpression__Group_5_1__1__Impl )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5397:2: rule__PrimaryExpression__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5_1__1__Impl_in_rule__PrimaryExpression__Group_5_1__110732);
            rule__PrimaryExpression__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_5_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_5_1__1__Impl"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5403:1: rule__PrimaryExpression__Group_5_1__1__Impl : ( '.' ) ;
    public final void rule__PrimaryExpression__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5407:1: ( ( '.' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5408:1: ( '.' )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5408:1: ( '.' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5409:1: '.'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_5_1_1()); 
            match(input,20,FOLLOW_20_in_rule__PrimaryExpression__Group_5_1__1__Impl10760); 
             after(grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_5_1__1__Impl"


    // $ANTLR start "rule__Program__ActionsAssignment_2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5427:1: rule__Program__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__Program__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5431:1: ( ( ruleAction ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5432:1: ( ruleAction )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5432:1: ( ruleAction )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5433:1: ruleAction
            {
             before(grammarAccess.getProgramAccess().getActionsActionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__Program__ActionsAssignment_210800);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getActionsActionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ActionsAssignment_2"


    // $ANTLR start "rule__Program__ModulesAssignment_5"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5442:1: rule__Program__ModulesAssignment_5 : ( ruleModuleDefine ) ;
    public final void rule__Program__ModulesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5446:1: ( ( ruleModuleDefine ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5447:1: ( ruleModuleDefine )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5447:1: ( ruleModuleDefine )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5448:1: ruleModuleDefine
            {
             before(grammarAccess.getProgramAccess().getModulesModuleDefineParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleModuleDefine_in_rule__Program__ModulesAssignment_510831);
            ruleModuleDefine();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getModulesModuleDefineParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ModulesAssignment_5"


    // $ANTLR start "rule__Program__ModulesAssignment_6"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5457:1: rule__Program__ModulesAssignment_6 : ( ruleModuleDefine ) ;
    public final void rule__Program__ModulesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5461:1: ( ( ruleModuleDefine ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5462:1: ( ruleModuleDefine )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5462:1: ( ruleModuleDefine )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5463:1: ruleModuleDefine
            {
             before(grammarAccess.getProgramAccess().getModulesModuleDefineParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleModuleDefine_in_rule__Program__ModulesAssignment_610862);
            ruleModuleDefine();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getModulesModuleDefineParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ModulesAssignment_6"


    // $ANTLR start "rule__Program__EnvironmentAssignment_8_0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5472:1: rule__Program__EnvironmentAssignment_8_0 : ( ruleEnvironment ) ;
    public final void rule__Program__EnvironmentAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5476:1: ( ( ruleEnvironment ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5477:1: ( ruleEnvironment )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5477:1: ( ruleEnvironment )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5478:1: ruleEnvironment
            {
             before(grammarAccess.getProgramAccess().getEnvironmentEnvironmentParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_ruleEnvironment_in_rule__Program__EnvironmentAssignment_8_010893);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getEnvironmentEnvironmentParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__EnvironmentAssignment_8_0"


    // $ANTLR start "rule__Program__IsEmptyEnvAssignment_8_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5487:1: rule__Program__IsEmptyEnvAssignment_8_1 : ( ( 'is empty' ) ) ;
    public final void rule__Program__IsEmptyEnvAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5491:1: ( ( ( 'is empty' ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5492:1: ( ( 'is empty' ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5492:1: ( ( 'is empty' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5493:1: ( 'is empty' )
            {
             before(grammarAccess.getProgramAccess().getIsEmptyEnvIsEmptyKeyword_8_1_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5494:1: ( 'is empty' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5495:1: 'is empty'
            {
             before(grammarAccess.getProgramAccess().getIsEmptyEnvIsEmptyKeyword_8_1_0()); 
            match(input,54,FOLLOW_54_in_rule__Program__IsEmptyEnvAssignment_8_110929); 
             after(grammarAccess.getProgramAccess().getIsEmptyEnvIsEmptyKeyword_8_1_0()); 

            }

             after(grammarAccess.getProgramAccess().getIsEmptyEnvIsEmptyKeyword_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__IsEmptyEnvAssignment_8_1"


    // $ANTLR start "rule__Program__RangesAssignment_9_2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5510:1: rule__Program__RangesAssignment_9_2 : ( ruleRange ) ;
    public final void rule__Program__RangesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5514:1: ( ( ruleRange ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5515:1: ( ruleRange )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5515:1: ( ruleRange )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5516:1: ruleRange
            {
             before(grammarAccess.getProgramAccess().getRangesRangeParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_ruleRange_in_rule__Program__RangesAssignment_9_210968);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getRangesRangeParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__RangesAssignment_9_2"


    // $ANTLR start "rule__Program__RangesAssignment_9_3_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5525:1: rule__Program__RangesAssignment_9_3_1 : ( ruleRange ) ;
    public final void rule__Program__RangesAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5529:1: ( ( ruleRange ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5530:1: ( ruleRange )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5530:1: ( ruleRange )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5531:1: ruleRange
            {
             before(grammarAccess.getProgramAccess().getRangesRangeParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_ruleRange_in_rule__Program__RangesAssignment_9_3_110999);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getRangesRangeParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__RangesAssignment_9_3_1"


    // $ANTLR start "rule__Range__ModuleAssignment_0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5540:1: rule__Range__ModuleAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Range__ModuleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5544:1: ( ( ( RULE_ID ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5545:1: ( ( RULE_ID ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5545:1: ( ( RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5546:1: ( RULE_ID )
            {
             before(grammarAccess.getRangeAccess().getModuleModuleDefineCrossReference_0_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5547:1: ( RULE_ID )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5548:1: RULE_ID
            {
             before(grammarAccess.getRangeAccess().getModuleModuleDefineIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Range__ModuleAssignment_011034); 
             after(grammarAccess.getRangeAccess().getModuleModuleDefineIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRangeAccess().getModuleModuleDefineCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__ModuleAssignment_0"


    // $ANTLR start "rule__Range__VariableAssignment_2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5559:1: rule__Range__VariableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Range__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5563:1: ( ( ( RULE_ID ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5564:1: ( ( RULE_ID ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5564:1: ( ( RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5565:1: ( RULE_ID )
            {
             before(grammarAccess.getRangeAccess().getVariableVariableDeclarationCrossReference_2_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5566:1: ( RULE_ID )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5567:1: RULE_ID
            {
             before(grammarAccess.getRangeAccess().getVariableVariableDeclarationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Range__VariableAssignment_211073); 
             after(grammarAccess.getRangeAccess().getVariableVariableDeclarationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRangeAccess().getVariableVariableDeclarationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__VariableAssignment_2"


    // $ANTLR start "rule__Range__FromAssignment_5"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5578:1: rule__Range__FromAssignment_5 : ( ruleValue ) ;
    public final void rule__Range__FromAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5582:1: ( ( ruleValue ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5583:1: ( ruleValue )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5583:1: ( ruleValue )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5584:1: ruleValue
            {
             before(grammarAccess.getRangeAccess().getFromValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Range__FromAssignment_511108);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getFromValueParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__FromAssignment_5"


    // $ANTLR start "rule__Range__ToAssignment_7"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5593:1: rule__Range__ToAssignment_7 : ( ruleValue ) ;
    public final void rule__Range__ToAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5597:1: ( ( ruleValue ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5598:1: ( ruleValue )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5598:1: ( ruleValue )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5599:1: ruleValue
            {
             before(grammarAccess.getRangeAccess().getToValueParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Range__ToAssignment_711139);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getToValueParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__ToAssignment_7"


    // $ANTLR start "rule__Range__DeltaAssignment_9_2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5608:1: rule__Range__DeltaAssignment_9_2 : ( ruleValue ) ;
    public final void rule__Range__DeltaAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5612:1: ( ( ruleValue ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5613:1: ( ruleValue )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5613:1: ( ruleValue )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5614:1: ruleValue
            {
             before(grammarAccess.getRangeAccess().getDeltaValueParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Range__DeltaAssignment_9_211170);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getDeltaValueParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__DeltaAssignment_9_2"


    // $ANTLR start "rule__Action__NameAssignment"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5623:1: rule__Action__NameAssignment : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5627:1: ( ( RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5628:1: ( RULE_ID )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5628:1: ( RULE_ID )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5629:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment11201); 
             after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment"


    // $ANTLR start "rule__ModuleDefine__NameAssignment_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5638:1: rule__ModuleDefine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ModuleDefine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5642:1: ( ( RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5643:1: ( RULE_ID )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5643:1: ( RULE_ID )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5644:1: RULE_ID
            {
             before(grammarAccess.getModuleDefineAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModuleDefine__NameAssignment_111232); 
             after(grammarAccess.getModuleDefineAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__NameAssignment_1"


    // $ANTLR start "rule__ModuleDefine__VariablesAssignment_3_0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5653:1: rule__ModuleDefine__VariablesAssignment_3_0 : ( ruleVariableDeclaration ) ;
    public final void rule__ModuleDefine__VariablesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5657:1: ( ( ruleVariableDeclaration ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5658:1: ( ruleVariableDeclaration )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5658:1: ( ruleVariableDeclaration )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5659:1: ruleVariableDeclaration
            {
             before(grammarAccess.getModuleDefineAccess().getVariablesVariableDeclarationParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__ModuleDefine__VariablesAssignment_3_011263);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getModuleDefineAccess().getVariablesVariableDeclarationParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__VariablesAssignment_3_0"


    // $ANTLR start "rule__ModuleDefine__RulesAssignment_4_0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5668:1: rule__ModuleDefine__RulesAssignment_4_0 : ( ruleRule ) ;
    public final void rule__ModuleDefine__RulesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5672:1: ( ( ruleRule ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5673:1: ( ruleRule )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5673:1: ( ruleRule )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5674:1: ruleRule
            {
             before(grammarAccess.getModuleDefineAccess().getRulesRuleParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__ModuleDefine__RulesAssignment_4_011294);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getModuleDefineAccess().getRulesRuleParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__RulesAssignment_4_0"


    // $ANTLR start "rule__ModuleDefine__NeverAssignment_5_2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5683:1: rule__ModuleDefine__NeverAssignment_5_2 : ( ruleExpression ) ;
    public final void rule__ModuleDefine__NeverAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5687:1: ( ( ruleExpression ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5688:1: ( ruleExpression )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5688:1: ( ruleExpression )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5689:1: ruleExpression
            {
             before(grammarAccess.getModuleDefineAccess().getNeverExpressionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ModuleDefine__NeverAssignment_5_211325);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getModuleDefineAccess().getNeverExpressionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleDefine__NeverAssignment_5_2"


    // $ANTLR start "rule__VariableDeclaration__TypeAssignment_0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5698:1: rule__VariableDeclaration__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5702:1: ( ( ruleType ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5703:1: ( ruleType )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5703:1: ( ruleType )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5704:1: ruleType
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_011356);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__TypeAssignment_0"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5713:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5717:1: ( ( RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5718:1: ( RULE_ID )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5718:1: ( RULE_ID )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5719:1: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_111387); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__ExprAssignment_3"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5728:1: rule__VariableDeclaration__ExprAssignment_3 : ( ruleExpression ) ;
    public final void rule__VariableDeclaration__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5732:1: ( ( ruleExpression ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5733:1: ( ruleExpression )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5733:1: ( ruleExpression )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5734:1: ruleExpression
            {
             before(grammarAccess.getVariableDeclarationAccess().getExprExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableDeclaration__ExprAssignment_311418);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getExprExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ExprAssignment_3"


    // $ANTLR start "rule__Type__NameAssignment_0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5743:1: rule__Type__NameAssignment_0 : ( ( 'int' ) ) ;
    public final void rule__Type__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5747:1: ( ( ( 'int' ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5748:1: ( ( 'int' ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5748:1: ( ( 'int' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5749:1: ( 'int' )
            {
             before(grammarAccess.getTypeAccess().getNameIntKeyword_0_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5750:1: ( 'int' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5751:1: 'int'
            {
             before(grammarAccess.getTypeAccess().getNameIntKeyword_0_0()); 
            match(input,55,FOLLOW_55_in_rule__Type__NameAssignment_011454); 
             after(grammarAccess.getTypeAccess().getNameIntKeyword_0_0()); 

            }

             after(grammarAccess.getTypeAccess().getNameIntKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_0"


    // $ANTLR start "rule__Type__NameAssignment_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5766:1: rule__Type__NameAssignment_1 : ( ( 'float' ) ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5770:1: ( ( ( 'float' ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5771:1: ( ( 'float' ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5771:1: ( ( 'float' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5772:1: ( 'float' )
            {
             before(grammarAccess.getTypeAccess().getNameFloatKeyword_1_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5773:1: ( 'float' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5774:1: 'float'
            {
             before(grammarAccess.getTypeAccess().getNameFloatKeyword_1_0()); 
            match(input,56,FOLLOW_56_in_rule__Type__NameAssignment_111498); 
             after(grammarAccess.getTypeAccess().getNameFloatKeyword_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getNameFloatKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_1"


    // $ANTLR start "rule__Type__NameAssignment_2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5789:1: rule__Type__NameAssignment_2 : ( ( 'bool' ) ) ;
    public final void rule__Type__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5793:1: ( ( ( 'bool' ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5794:1: ( ( 'bool' ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5794:1: ( ( 'bool' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5795:1: ( 'bool' )
            {
             before(grammarAccess.getTypeAccess().getNameBoolKeyword_2_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5796:1: ( 'bool' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5797:1: 'bool'
            {
             before(grammarAccess.getTypeAccess().getNameBoolKeyword_2_0()); 
            match(input,57,FOLLOW_57_in_rule__Type__NameAssignment_211542); 
             after(grammarAccess.getTypeAccess().getNameBoolKeyword_2_0()); 

            }

             after(grammarAccess.getTypeAccess().getNameBoolKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_2"


    // $ANTLR start "rule__Rule__CondAssignment_0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5812:1: rule__Rule__CondAssignment_0 : ( ruleExpression ) ;
    public final void rule__Rule__CondAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5816:1: ( ( ruleExpression ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5817:1: ( ruleExpression )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5817:1: ( ruleExpression )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5818:1: ruleExpression
            {
             before(grammarAccess.getRuleAccess().getCondExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Rule__CondAssignment_011581);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getCondExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__CondAssignment_0"


    // $ANTLR start "rule__Rule__ActionAssignment_2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5827:1: rule__Rule__ActionAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5831:1: ( ( ( RULE_ID ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5832:1: ( ( RULE_ID ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5832:1: ( ( RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5833:1: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getActionActionCrossReference_2_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5834:1: ( RULE_ID )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5835:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getActionActionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__ActionAssignment_211616); 
             after(grammarAccess.getRuleAccess().getActionActionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getActionActionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionAssignment_2"


    // $ANTLR start "rule__Rule__NdCasesAssignment_4"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5846:1: rule__Rule__NdCasesAssignment_4 : ( ruleNDCase ) ;
    public final void rule__Rule__NdCasesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5850:1: ( ( ruleNDCase ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5851:1: ( ruleNDCase )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5851:1: ( ruleNDCase )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5852:1: ruleNDCase
            {
             before(grammarAccess.getRuleAccess().getNdCasesNDCaseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleNDCase_in_rule__Rule__NdCasesAssignment_411651);
            ruleNDCase();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getNdCasesNDCaseParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NdCasesAssignment_4"


    // $ANTLR start "rule__NDCase__CasesAssignment_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5861:1: rule__NDCase__CasesAssignment_1 : ( ruleCase ) ;
    public final void rule__NDCase__CasesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5865:1: ( ( ruleCase ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5866:1: ( ruleCase )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5866:1: ( ruleCase )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5867:1: ruleCase
            {
             before(grammarAccess.getNDCaseAccess().getCasesCaseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCase_in_rule__NDCase__CasesAssignment_111682);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getNDCaseAccess().getCasesCaseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NDCase__CasesAssignment_1"


    // $ANTLR start "rule__NDCase__CasesAssignment_2_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5876:1: rule__NDCase__CasesAssignment_2_1 : ( ruleCase ) ;
    public final void rule__NDCase__CasesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5880:1: ( ( ruleCase ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5881:1: ( ruleCase )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5881:1: ( ruleCase )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5882:1: ruleCase
            {
             before(grammarAccess.getNDCaseAccess().getCasesCaseParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleCase_in_rule__NDCase__CasesAssignment_2_111713);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getNDCaseAccess().getCasesCaseParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NDCase__CasesAssignment_2_1"


    // $ANTLR start "rule__Case__WeightAssignment_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5891:1: rule__Case__WeightAssignment_1 : ( ruleExpression ) ;
    public final void rule__Case__WeightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5895:1: ( ( ruleExpression ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5896:1: ( ruleExpression )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5896:1: ( ruleExpression )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5897:1: ruleExpression
            {
             before(grammarAccess.getCaseAccess().getWeightExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Case__WeightAssignment_111744);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getWeightExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__WeightAssignment_1"


    // $ANTLR start "rule__Case__HasConditionAssignment_2_0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5906:1: rule__Case__HasConditionAssignment_2_0 : ( ( ',' ) ) ;
    public final void rule__Case__HasConditionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5910:1: ( ( ( ',' ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5911:1: ( ( ',' ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5911:1: ( ( ',' ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5912:1: ( ',' )
            {
             before(grammarAccess.getCaseAccess().getHasConditionCommaKeyword_2_0_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5913:1: ( ',' )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5914:1: ','
            {
             before(grammarAccess.getCaseAccess().getHasConditionCommaKeyword_2_0_0()); 
            match(input,19,FOLLOW_19_in_rule__Case__HasConditionAssignment_2_011780); 
             after(grammarAccess.getCaseAccess().getHasConditionCommaKeyword_2_0_0()); 

            }

             after(grammarAccess.getCaseAccess().getHasConditionCommaKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__HasConditionAssignment_2_0"


    // $ANTLR start "rule__Case__CondAssignment_2_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5929:1: rule__Case__CondAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Case__CondAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5933:1: ( ( ruleExpression ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5934:1: ( ruleExpression )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5934:1: ( ruleExpression )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5935:1: ruleExpression
            {
             before(grammarAccess.getCaseAccess().getCondExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Case__CondAssignment_2_111819);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getCondExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__CondAssignment_2_1"


    // $ANTLR start "rule__Case__UpdateAssignment_4"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5944:1: rule__Case__UpdateAssignment_4 : ( ruleUpdate ) ;
    public final void rule__Case__UpdateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5948:1: ( ( ruleUpdate ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5949:1: ( ruleUpdate )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5949:1: ( ruleUpdate )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5950:1: ruleUpdate
            {
             before(grammarAccess.getCaseAccess().getUpdateUpdateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleUpdate_in_rule__Case__UpdateAssignment_411850);
            ruleUpdate();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getUpdateUpdateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__UpdateAssignment_4"


    // $ANTLR start "rule__Case__UpdateAssignment_5_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5959:1: rule__Case__UpdateAssignment_5_1 : ( ruleUpdate ) ;
    public final void rule__Case__UpdateAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5963:1: ( ( ruleUpdate ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5964:1: ( ruleUpdate )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5964:1: ( ruleUpdate )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5965:1: ruleUpdate
            {
             before(grammarAccess.getCaseAccess().getUpdateUpdateParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleUpdate_in_rule__Case__UpdateAssignment_5_111881);
            ruleUpdate();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getUpdateUpdateParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__UpdateAssignment_5_1"


    // $ANTLR start "rule__Update__VariableAssignment_1_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5974:1: rule__Update__VariableAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Update__VariableAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5978:1: ( ( ( RULE_ID ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5979:1: ( ( RULE_ID ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5979:1: ( ( RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5980:1: ( RULE_ID )
            {
             before(grammarAccess.getUpdateAccess().getVariableVariableDeclarationCrossReference_1_1_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5981:1: ( RULE_ID )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5982:1: RULE_ID
            {
             before(grammarAccess.getUpdateAccess().getVariableVariableDeclarationIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Update__VariableAssignment_1_111916); 
             after(grammarAccess.getUpdateAccess().getVariableVariableDeclarationIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getUpdateAccess().getVariableVariableDeclarationCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__VariableAssignment_1_1"


    // $ANTLR start "rule__Update__ExprAssignment_1_3"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5993:1: rule__Update__ExprAssignment_1_3 : ( ruleExpression ) ;
    public final void rule__Update__ExprAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5997:1: ( ( ruleExpression ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5998:1: ( ruleExpression )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5998:1: ( ruleExpression )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:5999:1: ruleExpression
            {
             before(grammarAccess.getUpdateAccess().getExprExpressionParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Update__ExprAssignment_1_311951);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getExprExpressionParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__ExprAssignment_1_3"


    // $ANTLR start "rule__Environment__ModulesAssignment_0"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6008:1: rule__Environment__ModulesAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Environment__ModulesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6012:1: ( ( ( RULE_ID ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6013:1: ( ( RULE_ID ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6013:1: ( ( RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6014:1: ( RULE_ID )
            {
             before(grammarAccess.getEnvironmentAccess().getModulesModuleDefineCrossReference_0_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6015:1: ( RULE_ID )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6016:1: RULE_ID
            {
             before(grammarAccess.getEnvironmentAccess().getModulesModuleDefineIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Environment__ModulesAssignment_011986); 
             after(grammarAccess.getEnvironmentAccess().getModulesModuleDefineIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEnvironmentAccess().getModulesModuleDefineCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__ModulesAssignment_0"


    // $ANTLR start "rule__Environment__ActionsAssignment_1_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6027:1: rule__Environment__ActionsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Environment__ActionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6031:1: ( ( ( RULE_ID ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6032:1: ( ( RULE_ID ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6032:1: ( ( RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6033:1: ( RULE_ID )
            {
             before(grammarAccess.getEnvironmentAccess().getActionsActionCrossReference_1_1_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6034:1: ( RULE_ID )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6035:1: RULE_ID
            {
             before(grammarAccess.getEnvironmentAccess().getActionsActionIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Environment__ActionsAssignment_1_112025); 
             after(grammarAccess.getEnvironmentAccess().getActionsActionIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getEnvironmentAccess().getActionsActionCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__ActionsAssignment_1_1"


    // $ANTLR start "rule__Environment__ModulesAssignment_1_3"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6046:1: rule__Environment__ModulesAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__Environment__ModulesAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6050:1: ( ( ( RULE_ID ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6051:1: ( ( RULE_ID ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6051:1: ( ( RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6052:1: ( RULE_ID )
            {
             before(grammarAccess.getEnvironmentAccess().getModulesModuleDefineCrossReference_1_3_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6053:1: ( RULE_ID )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6054:1: RULE_ID
            {
             before(grammarAccess.getEnvironmentAccess().getModulesModuleDefineIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Environment__ModulesAssignment_1_312064); 
             after(grammarAccess.getEnvironmentAccess().getModulesModuleDefineIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getEnvironmentAccess().getModulesModuleDefineCrossReference_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__ModulesAssignment_1_3"


    // $ANTLR start "rule__Logical__RightAssignment_1_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6065:1: rule__Logical__RightAssignment_1_1 : ( ruleRelation ) ;
    public final void rule__Logical__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6069:1: ( ( ruleRelation ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6070:1: ( ruleRelation )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6070:1: ( ruleRelation )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6071:1: ruleRelation
            {
             before(grammarAccess.getLogicalAccess().getRightRelationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRelation_in_rule__Logical__RightAssignment_1_112099);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getLogicalAccess().getRightRelationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__RightAssignment_1_1"


    // $ANTLR start "rule__Relation__RightAssignment_1_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6080:1: rule__Relation__RightAssignment_1_1 : ( ruleAddition ) ;
    public final void rule__Relation__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6084:1: ( ( ruleAddition ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6085:1: ( ruleAddition )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6085:1: ( ruleAddition )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6086:1: ruleAddition
            {
             before(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Relation__RightAssignment_1_112130);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__RightAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6095:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6099:1: ( ( ruleMultiplication ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6100:1: ( ruleMultiplication )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6100:1: ( ruleMultiplication )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6101:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_112161);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6110:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6114:1: ( ( rulePrimaryExpression ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6115:1: ( rulePrimaryExpression )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6115:1: ( rulePrimaryExpression )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6116:1: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Multiplication__RightAssignment_1_112192);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpression__CondAssignment_1_2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6125:1: rule__PrimaryExpression__CondAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__CondAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6129:1: ( ( rulePrimaryExpression ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6130:1: ( rulePrimaryExpression )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6130:1: ( rulePrimaryExpression )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6131:1: rulePrimaryExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getCondPrimaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__PrimaryExpression__CondAssignment_1_212223);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getCondPrimaryExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__CondAssignment_1_2"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_2_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6140:1: rule__PrimaryExpression__ValueAssignment_2_1 : ( ruleValue ) ;
    public final void rule__PrimaryExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6144:1: ( ( ruleValue ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6145:1: ( ruleValue )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6145:1: ( ruleValue )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6146:1: ruleValue
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__PrimaryExpression__ValueAssignment_2_112254);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getValueValueParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__PrimaryExpression__NameAssignment_3_2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6155:1: rule__PrimaryExpression__NameAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__PrimaryExpression__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6159:1: ( ( RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6160:1: ( RULE_ID )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6160:1: ( RULE_ID )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6161:1: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNameIDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimaryExpression__NameAssignment_3_212285); 
             after(grammarAccess.getPrimaryExpressionAccess().getNameIDTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__NameAssignment_3_2"


    // $ANTLR start "rule__PrimaryExpression__ModuleAssignment_3_4"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6170:1: rule__PrimaryExpression__ModuleAssignment_3_4 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpression__ModuleAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6174:1: ( ( ( RULE_ID ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6175:1: ( ( RULE_ID ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6175:1: ( ( RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6176:1: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getModuleModuleDefineCrossReference_3_4_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6177:1: ( RULE_ID )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6178:1: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getModuleModuleDefineIDTerminalRuleCall_3_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimaryExpression__ModuleAssignment_3_412320); 
             after(grammarAccess.getPrimaryExpressionAccess().getModuleModuleDefineIDTerminalRuleCall_3_4_0_1()); 

            }

             after(grammarAccess.getPrimaryExpressionAccess().getModuleModuleDefineCrossReference_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ModuleAssignment_3_4"


    // $ANTLR start "rule__PrimaryExpression__CondAssignment_3_6"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6189:1: rule__PrimaryExpression__CondAssignment_3_6 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__CondAssignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6193:1: ( ( rulePrimaryExpression ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6194:1: ( rulePrimaryExpression )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6194:1: ( rulePrimaryExpression )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6195:1: rulePrimaryExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getCondPrimaryExpressionParserRuleCall_3_6_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__PrimaryExpression__CondAssignment_3_612355);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getCondPrimaryExpressionParserRuleCall_3_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__CondAssignment_3_6"


    // $ANTLR start "rule__PrimaryExpression__ModuleAssignment_4_1"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6204:1: rule__PrimaryExpression__ModuleAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpression__ModuleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6208:1: ( ( ( RULE_ID ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6209:1: ( ( RULE_ID ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6209:1: ( ( RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6210:1: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getModuleQuantifierCrossReference_4_1_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6211:1: ( RULE_ID )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6212:1: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getModuleQuantifierIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimaryExpression__ModuleAssignment_4_112390); 
             after(grammarAccess.getPrimaryExpressionAccess().getModuleQuantifierIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getPrimaryExpressionAccess().getModuleQuantifierCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ModuleAssignment_4_1"


    // $ANTLR start "rule__PrimaryExpression__VariableAssignment_4_3"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6223:1: rule__PrimaryExpression__VariableAssignment_4_3 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpression__VariableAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6227:1: ( ( ( RULE_ID ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6228:1: ( ( RULE_ID ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6228:1: ( ( RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6229:1: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getVariableVariableDeclarationCrossReference_4_3_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6230:1: ( RULE_ID )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6231:1: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getVariableVariableDeclarationIDTerminalRuleCall_4_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimaryExpression__VariableAssignment_4_312429); 
             after(grammarAccess.getPrimaryExpressionAccess().getVariableVariableDeclarationIDTerminalRuleCall_4_3_0_1()); 

            }

             after(grammarAccess.getPrimaryExpressionAccess().getVariableVariableDeclarationCrossReference_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__VariableAssignment_4_3"


    // $ANTLR start "rule__PrimaryExpression__VariableAssignment_5_2"
    // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6242:1: rule__PrimaryExpression__VariableAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpression__VariableAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6246:1: ( ( ( RULE_ID ) ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6247:1: ( ( RULE_ID ) )
            {
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6247:1: ( ( RULE_ID ) )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6248:1: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getVariableVariableDeclarationCrossReference_5_2_0()); 
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6249:1: ( RULE_ID )
            // ../unifi.marcotinacci.thesis.seal.ui/src-gen/unifi/marcotinacci/thesis/seal/ui/contentassist/antlr/internal/InternalSeal.g:6250:1: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getVariableVariableDeclarationIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimaryExpression__VariableAssignment_5_212468); 
             after(grammarAccess.getPrimaryExpressionAccess().getVariableVariableDeclarationIDTerminalRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getPrimaryExpressionAccess().getVariableVariableDeclarationCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__VariableAssignment_5_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0_in_ruleRange154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_in_ruleAction214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleDefine_in_entryRuleModuleDefine241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleDefine248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group__0_in_ruleModuleDefine274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNDCase_in_entryRuleNDCase481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNDCase488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDCase__Group__0_in_ruleNDCase514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__0_in_ruleCase574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdate_in_entryRuleUpdate601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdate608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__Alternatives_in_ruleUpdate634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironment_in_entryRuleEnvironment661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironment668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__0_in_ruleEnvironment694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_in_ruleExpression754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_in_entryRuleLogical780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogical787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group__0_in_ruleLogical813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0_in_ruleRelation873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__EnvironmentAssignment_8_0_in_rule__Program__Alternatives_81149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__IsEmptyEnvAssignment_8_1_in_rule__Program__Alternatives_81167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_0_in_rule__Type__Alternatives1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_1_in_rule__Type__Alternatives1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_2_in_rule__Type__Alternatives1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__Group_0__0_in_rule__Update__Alternatives1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__Group_1__0_in_rule__Update__Alternatives1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0_0__0_in_rule__Logical__Alternatives_1_01320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0_1__0_in_rule__Logical__Alternatives_1_01338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_0__0_in_rule__Relation__Alternatives_1_01371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_1__0_in_rule__Relation__Alternatives_1_01389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_2__0_in_rule__Relation__Alternatives_1_01407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_3__0_in_rule__Relation__Alternatives_1_01425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_4__0_in_rule__Relation__Alternatives_1_01443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_5__0_in_rule__Relation__Alternatives_1_01461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_01545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_01563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__0_in_rule__PrimaryExpression__Alternatives1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_4__0_in_rule__PrimaryExpression__Alternatives1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__0_in_rule__PrimaryExpression__Alternatives1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Value__Alternatives1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Value__Alternatives1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__Value__Alternatives1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01783 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Program__Group__0__Impl1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11845 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Program__Group__1__Impl1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21907 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Program__Group__3_in_rule__Program__Group__21910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ActionsAssignment_2_in_rule__Program__Group__2__Impl1939 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Program__ActionsAssignment_2_in_rule__Program__Group__2__Impl1951 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__31984 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Program__Group__4_in_rule__Program__Group__31987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Program__Group__3__Impl2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__42046 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Program__Group__5_in_rule__Program__Group__42049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Program__Group__4__Impl2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__52108 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Program__Group__6_in_rule__Program__Group__52111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ModulesAssignment_5_in_rule__Program__Group__5__Impl2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__6__Impl_in_rule__Program__Group__62168 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Program__Group__7_in_rule__Program__Group__62171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ModulesAssignment_6_in_rule__Program__Group__6__Impl2198 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Program__Group__7__Impl_in_rule__Program__Group__72229 = new BitSet(new long[]{0x0040000000000080L});
    public static final BitSet FOLLOW_rule__Program__Group__8_in_rule__Program__Group__72232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Program__Group__7__Impl2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__8__Impl_in_rule__Program__Group__82291 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Program__Group__9_in_rule__Program__Group__82294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Alternatives_8_in_rule__Program__Group__8__Impl2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__9__Impl_in_rule__Program__Group__92351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_9__0_in_rule__Program__Group__9__Impl2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_9__0__Impl_in_rule__Program__Group_9__02429 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Program__Group_9__1_in_rule__Program__Group_9__02432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Program__Group_9__0__Impl2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_9__1__Impl_in_rule__Program__Group_9__12491 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Program__Group_9__2_in_rule__Program__Group_9__12494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Program__Group_9__1__Impl2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_9__2__Impl_in_rule__Program__Group_9__22553 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_rule__Program__Group_9__3_in_rule__Program__Group_9__22556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__RangesAssignment_9_2_in_rule__Program__Group_9__2__Impl2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_9__3__Impl_in_rule__Program__Group_9__32613 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_rule__Program__Group_9__4_in_rule__Program__Group_9__32616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_9_3__0_in_rule__Program__Group_9__3__Impl2643 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Program__Group_9__4__Impl_in_rule__Program__Group_9__42674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Program__Group_9__4__Impl2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_9_3__0__Impl_in_rule__Program__Group_9_3__02743 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Program__Group_9_3__1_in_rule__Program__Group_9_3__02746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Program__Group_9_3__0__Impl2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_9_3__1__Impl_in_rule__Program__Group_9_3__12805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__RangesAssignment_9_3_1_in_rule__Program__Group_9_3__1__Impl2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__02866 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Range__Group__1_in_rule__Range__Group__02869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__ModuleAssignment_0_in_rule__Range__Group__0__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__12926 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Range__Group__2_in_rule__Range__Group__12929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Range__Group__1__Impl2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__2__Impl_in_rule__Range__Group__22988 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Range__Group__3_in_rule__Range__Group__22991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__VariableAssignment_2_in_rule__Range__Group__2__Impl3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__3__Impl_in_rule__Range__Group__33048 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Range__Group__4_in_rule__Range__Group__33051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Range__Group__3__Impl3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__4__Impl_in_rule__Range__Group__43110 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Range__Group__5_in_rule__Range__Group__43113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Range__Group__4__Impl3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__5__Impl_in_rule__Range__Group__53172 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Range__Group__6_in_rule__Range__Group__53175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__FromAssignment_5_in_rule__Range__Group__5__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__6__Impl_in_rule__Range__Group__63232 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Range__Group__7_in_rule__Range__Group__63235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Range__Group__6__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__7__Impl_in_rule__Range__Group__73294 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Range__Group__8_in_rule__Range__Group__73297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__ToAssignment_7_in_rule__Range__Group__7__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__8__Impl_in_rule__Range__Group__83354 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Range__Group__9_in_rule__Range__Group__83357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Range__Group__8__Impl3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__9__Impl_in_rule__Range__Group__93416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group_9__0_in_rule__Range__Group__9__Impl3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group_9__0__Impl_in_rule__Range__Group_9__03494 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Range__Group_9__1_in_rule__Range__Group_9__03497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Range__Group_9__0__Impl3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group_9__1__Impl_in_rule__Range__Group_9__13556 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Range__Group_9__2_in_rule__Range__Group_9__13559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Range__Group_9__1__Impl3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group_9__2__Impl_in_rule__Range__Group_9__23618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__DeltaAssignment_9_2_in_rule__Range__Group_9__2__Impl3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group__0__Impl_in_rule__ModuleDefine__Group__03681 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group__1_in_rule__ModuleDefine__Group__03684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ModuleDefine__Group__0__Impl3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group__1__Impl_in_rule__ModuleDefine__Group__13743 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group__2_in_rule__ModuleDefine__Group__13746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__NameAssignment_1_in_rule__ModuleDefine__Group__1__Impl3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group__2__Impl_in_rule__ModuleDefine__Group__23803 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group__3_in_rule__ModuleDefine__Group__23806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ModuleDefine__Group__2__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group__3__Impl_in_rule__ModuleDefine__Group__33865 = new BitSet(new long[]{0x00268000000000F0L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group__4_in_rule__ModuleDefine__Group__33868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group_3__0_in_rule__ModuleDefine__Group__3__Impl3897 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group_3__0_in_rule__ModuleDefine__Group__3__Impl3909 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group__4__Impl_in_rule__ModuleDefine__Group__43942 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group__5_in_rule__ModuleDefine__Group__43945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group_4__0_in_rule__ModuleDefine__Group__4__Impl3974 = new BitSet(new long[]{0x00268000000000F2L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group_4__0_in_rule__ModuleDefine__Group__4__Impl3986 = new BitSet(new long[]{0x00268000000000F2L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group__5__Impl_in_rule__ModuleDefine__Group__54019 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group__6_in_rule__ModuleDefine__Group__54022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group_5__0_in_rule__ModuleDefine__Group__5__Impl4049 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group__6__Impl_in_rule__ModuleDefine__Group__64080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ModuleDefine__Group__6__Impl4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group_3__0__Impl_in_rule__ModuleDefine__Group_3__04153 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group_3__1_in_rule__ModuleDefine__Group_3__04156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__VariablesAssignment_3_0_in_rule__ModuleDefine__Group_3__0__Impl4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group_3__1__Impl_in_rule__ModuleDefine__Group_3__14213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ModuleDefine__Group_3__1__Impl4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group_4__0__Impl_in_rule__ModuleDefine__Group_4__04276 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group_4__1_in_rule__ModuleDefine__Group_4__04279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__RulesAssignment_4_0_in_rule__ModuleDefine__Group_4__0__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group_4__1__Impl_in_rule__ModuleDefine__Group_4__14336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ModuleDefine__Group_4__1__Impl4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group_5__0__Impl_in_rule__ModuleDefine__Group_5__04399 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group_5__1_in_rule__ModuleDefine__Group_5__04402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ModuleDefine__Group_5__0__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group_5__1__Impl_in_rule__ModuleDefine__Group_5__14461 = new BitSet(new long[]{0x00268000000000F0L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group_5__2_in_rule__ModuleDefine__Group_5__14464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ModuleDefine__Group_5__1__Impl4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__Group_5__2__Impl_in_rule__ModuleDefine__Group_5__24523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDefine__NeverAssignment_5_2_in_rule__ModuleDefine__Group_5__2__Impl4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__04586 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__04589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__TypeAssignment_0_in_rule__VariableDeclaration__Group__0__Impl4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__14646 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__14649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_1_in_rule__VariableDeclaration__Group__1__Impl4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__24706 = new BitSet(new long[]{0x00268000000000F0L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__24709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VariableDeclaration__Group__2__Impl4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__34768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__ExprAssignment_3_in_rule__VariableDeclaration__Group__3__Impl4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__04833 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__04836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__CondAssignment_0_in_rule__Rule__Group__0__Impl4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__14893 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__14896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Rule__Group__1__Impl4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__24955 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__24958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ActionAssignment_2_in_rule__Rule__Group__2__Impl4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__35015 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__35018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Rule__Group__3__Impl5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__45077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NdCasesAssignment_4_in_rule__Rule__Group__4__Impl5106 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Rule__NdCasesAssignment_4_in_rule__Rule__Group__4__Impl5118 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__NDCase__Group__0__Impl_in_rule__NDCase__Group__05161 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__NDCase__Group__1_in_rule__NDCase__Group__05164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__NDCase__Group__0__Impl5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDCase__Group__1__Impl_in_rule__NDCase__Group__15223 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__NDCase__Group__2_in_rule__NDCase__Group__15226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDCase__CasesAssignment_1_in_rule__NDCase__Group__1__Impl5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDCase__Group__2__Impl_in_rule__NDCase__Group__25283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDCase__Group_2__0_in_rule__NDCase__Group__2__Impl5310 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__NDCase__Group_2__0__Impl_in_rule__NDCase__Group_2__05347 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__NDCase__Group_2__1_in_rule__NDCase__Group_2__05350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__NDCase__Group_2__0__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDCase__Group_2__1__Impl_in_rule__NDCase__Group_2__15409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDCase__CasesAssignment_2_1_in_rule__NDCase__Group_2__1__Impl5436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__05470 = new BitSet(new long[]{0x00268000000000F0L});
    public static final BitSet FOLLOW_rule__Case__Group__1_in_rule__Case__Group__05473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Case__Group__0__Impl5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__15532 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_rule__Case__Group__2_in_rule__Case__Group__15535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__WeightAssignment_1_in_rule__Case__Group__1__Impl5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__25592 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_rule__Case__Group__3_in_rule__Case__Group__25595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_2__0_in_rule__Case__Group__2__Impl5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__3__Impl_in_rule__Case__Group__35653 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_rule__Case__Group__4_in_rule__Case__Group__35656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Case__Group__3__Impl5684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__4__Impl_in_rule__Case__Group__45715 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Case__Group__5_in_rule__Case__Group__45718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__UpdateAssignment_4_in_rule__Case__Group__4__Impl5745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__5__Impl_in_rule__Case__Group__55775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_5__0_in_rule__Case__Group__5__Impl5802 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Case__Group_2__0__Impl_in_rule__Case__Group_2__05845 = new BitSet(new long[]{0x00268000000000F0L});
    public static final BitSet FOLLOW_rule__Case__Group_2__1_in_rule__Case__Group_2__05848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__HasConditionAssignment_2_0_in_rule__Case__Group_2__0__Impl5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_2__1__Impl_in_rule__Case__Group_2__15905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__CondAssignment_2_1_in_rule__Case__Group_2__1__Impl5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_5__0__Impl_in_rule__Case__Group_5__05966 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_rule__Case__Group_5__1_in_rule__Case__Group_5__05969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Case__Group_5__0__Impl5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_5__1__Impl_in_rule__Case__Group_5__16028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__UpdateAssignment_5_1_in_rule__Case__Group_5__1__Impl6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__Group_0__0__Impl_in_rule__Update__Group_0__06089 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Update__Group_0__1_in_rule__Update__Group_0__06092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__Group_0__1__Impl_in_rule__Update__Group_0__16150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Update__Group_0__1__Impl6178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__Group_1__0__Impl_in_rule__Update__Group_1__06213 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_rule__Update__Group_1__1_in_rule__Update__Group_1__06216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__Group_1__1__Impl_in_rule__Update__Group_1__16274 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Update__Group_1__2_in_rule__Update__Group_1__16277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__VariableAssignment_1_1_in_rule__Update__Group_1__1__Impl6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__Group_1__2__Impl_in_rule__Update__Group_1__26334 = new BitSet(new long[]{0x00268000000000F0L});
    public static final BitSet FOLLOW_rule__Update__Group_1__3_in_rule__Update__Group_1__26337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Update__Group_1__2__Impl6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__Group_1__3__Impl_in_rule__Update__Group_1__36396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__ExprAssignment_1_3_in_rule__Update__Group_1__3__Impl6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__0__Impl_in_rule__Environment__Group__06461 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Environment__Group__1_in_rule__Environment__Group__06464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__ModulesAssignment_0_in_rule__Environment__Group__0__Impl6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__1__Impl_in_rule__Environment__Group__16521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group_1__0_in_rule__Environment__Group__1__Impl6548 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Environment__Group_1__0__Impl_in_rule__Environment__Group_1__06583 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Environment__Group_1__1_in_rule__Environment__Group_1__06586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Environment__Group_1__0__Impl6614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group_1__1__Impl_in_rule__Environment__Group_1__16645 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Environment__Group_1__2_in_rule__Environment__Group_1__16648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__ActionsAssignment_1_1_in_rule__Environment__Group_1__1__Impl6677 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Environment__ActionsAssignment_1_1_in_rule__Environment__Group_1__1__Impl6689 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Environment__Group_1__2__Impl_in_rule__Environment__Group_1__26722 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Environment__Group_1__3_in_rule__Environment__Group_1__26725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Environment__Group_1__2__Impl6753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group_1__3__Impl_in_rule__Environment__Group_1__36784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__ModulesAssignment_1_3_in_rule__Environment__Group_1__3__Impl6811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group__0__Impl_in_rule__Logical__Group__06849 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Logical__Group__1_in_rule__Logical__Group__06852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__Logical__Group__0__Impl6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group__1__Impl_in_rule__Logical__Group__16908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1__0_in_rule__Logical__Group__1__Impl6935 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1__0__Impl_in_rule__Logical__Group_1__06970 = new BitSet(new long[]{0x00268000000000F0L});
    public static final BitSet FOLLOW_rule__Logical__Group_1__1_in_rule__Logical__Group_1__06973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Alternatives_1_0_in_rule__Logical__Group_1__0__Impl7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1__1__Impl_in_rule__Logical__Group_1__17030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__RightAssignment_1_1_in_rule__Logical__Group_1__1__Impl7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0_0__0__Impl_in_rule__Logical__Group_1_0_0__07091 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0_0__1_in_rule__Logical__Group_1_0_0__07094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0_0__1__Impl_in_rule__Logical__Group_1_0_0__17152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Logical__Group_1_0_0__1__Impl7180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0_1__0__Impl_in_rule__Logical__Group_1_0_1__07215 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0_1__1_in_rule__Logical__Group_1_0_1__07218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0_1__1__Impl_in_rule__Logical__Group_1_0_1__17276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Logical__Group_1_0_1__1__Impl7304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__07339 = new BitSet(new long[]{0x0000078300000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__07342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relation__Group__0__Impl7369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__17398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1__0_in_rule__Relation__Group__1__Impl7425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1__0__Impl_in_rule__Relation__Group_1__07460 = new BitSet(new long[]{0x00268000000000F0L});
    public static final BitSet FOLLOW_rule__Relation__Group_1__1_in_rule__Relation__Group_1__07463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Alternatives_1_0_in_rule__Relation__Group_1__0__Impl7490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1__1__Impl_in_rule__Relation__Group_1__17520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__RightAssignment_1_1_in_rule__Relation__Group_1__1__Impl7547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_0__0__Impl_in_rule__Relation__Group_1_0_0__07581 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_0__1_in_rule__Relation__Group_1_0_0__07584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_0__1__Impl_in_rule__Relation__Group_1_0_0__17642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Relation__Group_1_0_0__1__Impl7670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_1__0__Impl_in_rule__Relation__Group_1_0_1__07705 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_1__1_in_rule__Relation__Group_1_0_1__07708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_1__1__Impl_in_rule__Relation__Group_1_0_1__17766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Relation__Group_1_0_1__1__Impl7794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_2__0__Impl_in_rule__Relation__Group_1_0_2__07829 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_2__1_in_rule__Relation__Group_1_0_2__07832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_2__1__Impl_in_rule__Relation__Group_1_0_2__17890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Relation__Group_1_0_2__1__Impl7918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_3__0__Impl_in_rule__Relation__Group_1_0_3__07953 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_3__1_in_rule__Relation__Group_1_0_3__07956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_3__1__Impl_in_rule__Relation__Group_1_0_3__18014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Relation__Group_1_0_3__1__Impl8042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_4__0__Impl_in_rule__Relation__Group_1_0_4__08077 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_4__1_in_rule__Relation__Group_1_0_4__08080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_4__1__Impl_in_rule__Relation__Group_1_0_4__18138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Relation__Group_1_0_4__1__Impl8166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_5__0__Impl_in_rule__Relation__Group_1_0_5__08201 = new BitSet(new long[]{0x0000078300000000L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_5__1_in_rule__Relation__Group_1_0_5__08204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0_5__1__Impl_in_rule__Relation__Group_1_0_5__18262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Relation__Group_1_0_5__1__Impl8290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__08325 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__08328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl8355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__18384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl8411 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__08446 = new BitSet(new long[]{0x00268000000000F0L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__08449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl8476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__18506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl8533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__08567 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__08570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__18628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Addition__Group_1_0_0__1__Impl8656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__08691 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__08694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__18752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Addition__Group_1_0_1__1__Impl8780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__08815 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__08818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Multiplication__Group__0__Impl8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__18874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl8901 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__08936 = new BitSet(new long[]{0x00268000000000F0L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__08939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl8966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__18996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl9023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__09057 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__09060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__19118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Multiplication__Group_1_0_0__1__Impl9146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__09181 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__09184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__19242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Multiplication__Group_1_0_1__1__Impl9270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__09305 = new BitSet(new long[]{0x00268000000000F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__09308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__PrimaryExpression__Group_0__0__Impl9336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__19367 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__19370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl9397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__29426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__PrimaryExpression__Group_0__2__Impl9454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__09491 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__09494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__19552 = new BitSet(new long[]{0x00268000000000F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__2_in_rule__PrimaryExpression__Group_1__19555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__PrimaryExpression__Group_1__1__Impl9583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__2__Impl_in_rule__PrimaryExpression__Group_1__29614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__CondAssignment_1_2_in_rule__PrimaryExpression__Group_1__2__Impl9641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__09677 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__09680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__19738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_2_1_in_rule__PrimaryExpression__Group_2__1__Impl9765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__0__Impl_in_rule__PrimaryExpression__Group_3__09799 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__1_in_rule__PrimaryExpression__Group_3__09802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__1__Impl_in_rule__PrimaryExpression__Group_3__19860 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__2_in_rule__PrimaryExpression__Group_3__19863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__PrimaryExpression__Group_3__1__Impl9891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__2__Impl_in_rule__PrimaryExpression__Group_3__29922 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__3_in_rule__PrimaryExpression__Group_3__29925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__NameAssignment_3_2_in_rule__PrimaryExpression__Group_3__2__Impl9952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__3__Impl_in_rule__PrimaryExpression__Group_3__39982 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__4_in_rule__PrimaryExpression__Group_3__39985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__PrimaryExpression__Group_3__3__Impl10013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__4__Impl_in_rule__PrimaryExpression__Group_3__410044 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__5_in_rule__PrimaryExpression__Group_3__410047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ModuleAssignment_3_4_in_rule__PrimaryExpression__Group_3__4__Impl10074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__5__Impl_in_rule__PrimaryExpression__Group_3__510104 = new BitSet(new long[]{0x00268000000000F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__6_in_rule__PrimaryExpression__Group_3__510107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__PrimaryExpression__Group_3__5__Impl10135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__6__Impl_in_rule__PrimaryExpression__Group_3__610166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__CondAssignment_3_6_in_rule__PrimaryExpression__Group_3__6__Impl10193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_4__0__Impl_in_rule__PrimaryExpression__Group_4__010237 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_4__1_in_rule__PrimaryExpression__Group_4__010240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_4__1__Impl_in_rule__PrimaryExpression__Group_4__110298 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_4__2_in_rule__PrimaryExpression__Group_4__110301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ModuleAssignment_4_1_in_rule__PrimaryExpression__Group_4__1__Impl10328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_4__2__Impl_in_rule__PrimaryExpression__Group_4__210358 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_4__3_in_rule__PrimaryExpression__Group_4__210361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PrimaryExpression__Group_4__2__Impl10389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_4__3__Impl_in_rule__PrimaryExpression__Group_4__310420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__VariableAssignment_4_3_in_rule__PrimaryExpression__Group_4__3__Impl10447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__0__Impl_in_rule__PrimaryExpression__Group_5__010485 = new BitSet(new long[]{0x00268000000000F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__1_in_rule__PrimaryExpression__Group_5__010488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__1__Impl_in_rule__PrimaryExpression__Group_5__110546 = new BitSet(new long[]{0x00268000000000F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__2_in_rule__PrimaryExpression__Group_5__110549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5_1__0_in_rule__PrimaryExpression__Group_5__1__Impl10576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__2__Impl_in_rule__PrimaryExpression__Group_5__210607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__VariableAssignment_5_2_in_rule__PrimaryExpression__Group_5__2__Impl10634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5_1__0__Impl_in_rule__PrimaryExpression__Group_5_1__010670 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5_1__1_in_rule__PrimaryExpression__Group_5_1__010673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__PrimaryExpression__Group_5_1__0__Impl10701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5_1__1__Impl_in_rule__PrimaryExpression__Group_5_1__110732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PrimaryExpression__Group_5_1__1__Impl10760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__Program__ActionsAssignment_210800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleDefine_in_rule__Program__ModulesAssignment_510831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleDefine_in_rule__Program__ModulesAssignment_610862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironment_in_rule__Program__EnvironmentAssignment_8_010893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Program__IsEmptyEnvAssignment_8_110929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_rule__Program__RangesAssignment_9_210968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_rule__Program__RangesAssignment_9_3_110999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Range__ModuleAssignment_011034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Range__VariableAssignment_211073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Range__FromAssignment_511108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Range__ToAssignment_711139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Range__DeltaAssignment_9_211170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment11201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModuleDefine__NameAssignment_111232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__ModuleDefine__VariablesAssignment_3_011263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__ModuleDefine__RulesAssignment_4_011294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ModuleDefine__NeverAssignment_5_211325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_011356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_111387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableDeclaration__ExprAssignment_311418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Type__NameAssignment_011454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Type__NameAssignment_111498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Type__NameAssignment_211542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Rule__CondAssignment_011581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__ActionAssignment_211616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNDCase_in_rule__Rule__NdCasesAssignment_411651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_rule__NDCase__CasesAssignment_111682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_rule__NDCase__CasesAssignment_2_111713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Case__WeightAssignment_111744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Case__HasConditionAssignment_2_011780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Case__CondAssignment_2_111819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdate_in_rule__Case__UpdateAssignment_411850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdate_in_rule__Case__UpdateAssignment_5_111881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Update__VariableAssignment_1_111916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Update__ExprAssignment_1_311951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Environment__ModulesAssignment_011986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Environment__ActionsAssignment_1_112025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Environment__ModulesAssignment_1_312064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__Logical__RightAssignment_1_112099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relation__RightAssignment_1_112130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_112161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Multiplication__RightAssignment_1_112192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__PrimaryExpression__CondAssignment_1_212223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__PrimaryExpression__ValueAssignment_2_112254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimaryExpression__NameAssignment_3_212285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimaryExpression__ModuleAssignment_3_412320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__PrimaryExpression__CondAssignment_3_612355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimaryExpression__ModuleAssignment_4_112390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimaryExpression__VariableAssignment_4_312429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimaryExpression__VariableAssignment_5_212468 = new BitSet(new long[]{0x0000000000000002L});

}