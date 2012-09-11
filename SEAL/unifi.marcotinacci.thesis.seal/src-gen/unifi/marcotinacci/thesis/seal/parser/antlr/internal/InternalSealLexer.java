package unifi.marcotinacci.thesis.seal.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSealLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__20=20;
    public static final int RULE_BOOL=7;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
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
    public static final int T__32=32;
    public static final int RULE_STRING=8;
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

    public InternalSealLexer() {;} 
    public InternalSealLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSealLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:11:7: ( 'actions' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:11:9: 'actions'
            {
            match("actions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:12:7: ( '{' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:13:7: ( '}' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:14:7: ( 'subject' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:14:9: 'subject'
            {
            match("subject"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:15:7: ( 'environment' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:15:9: 'environment'
            {
            match("environment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:16:7: ( 'is empty' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:16:9: 'is empty'
            {
            match("is empty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:17:7: ( 'ranges' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:17:9: 'ranges'
            {
            match("ranges"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:18:7: ( ',' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:19:7: ( '.' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:19:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:20:7: ( 'in' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:20:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:21:7: ( '[' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:21:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:22:7: ( ']' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:22:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:23:7: ( 'delta' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:23:9: 'delta'
            {
            match("delta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:24:7: ( '=' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:24:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:25:7: ( 'module' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:25:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:26:7: ( ';' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:26:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:27:7: ( 'target' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:27:9: 'target'
            {
            match("target"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:28:7: ( 'never' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:28:9: 'never'
            {
            match("never"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:29:7: ( 'int' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:29:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:30:7: ( 'float' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:30:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:31:7: ( 'bool' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:31:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:32:7: ( '=>' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:32:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:33:7: ( '#' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:33:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:34:7: ( '<' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:34:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:35:7: ( '>' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:35:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:36:7: ( 'noaction' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:36:9: 'noaction'
            {
            match("noaction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:37:7: ( '|{' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:37:9: '|{'
            {
            match("|{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:38:7: ( '}|' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:38:9: '}|'
            {
            match("}|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:39:7: ( 'and' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:39:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:40:7: ( 'or' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:40:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:41:7: ( '<=' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:41:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:42:7: ( '==' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:42:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:43:7: ( '!=' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:43:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:44:7: ( '>=' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:44:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:45:7: ( '+' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:45:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:46:7: ( '-' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:46:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:47:7: ( '*' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:47:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:48:7: ( '/' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:48:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:49:7: ( '(' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:49:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:50:7: ( ')' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:50:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:51:7: ( 'not' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:51:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:52:7: ( 'exists' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:52:9: 'exists'
            {
            match("exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:53:7: ( ':' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:53:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:54:7: ( 'such that' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:54:9: 'such that'
            {
            match("such that"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:55:7: ( 'this' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:55:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1706:10: ( ( '0' .. '9' )+ )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1706:12: ( '0' .. '9' )+
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1706:12: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1706:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:12: ( ( ( '-' )? ( RULE_INT )* ( '.' ( RULE_INT )+ )? | ( '-' )? ( RULE_INT )+ '.' | ( '-' )? ( RULE_INT )+ ( '.' ( RULE_INT )* )? ( 'e' | 'E' ) ( '-' | '+' )? ( RULE_INT )+ ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:14: ( ( '-' )? ( RULE_INT )* ( '.' ( RULE_INT )+ )? | ( '-' )? ( RULE_INT )+ '.' | ( '-' )? ( RULE_INT )+ ( '.' ( RULE_INT )* )? ( 'e' | 'E' ) ( '-' | '+' )? ( RULE_INT )+ )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:14: ( ( '-' )? ( RULE_INT )* ( '.' ( RULE_INT )+ )? | ( '-' )? ( RULE_INT )+ '.' | ( '-' )? ( RULE_INT )+ ( '.' ( RULE_INT )* )? ( 'e' | 'E' ) ( '-' | '+' )? ( RULE_INT )+ )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:15: ( '-' )? ( RULE_INT )* ( '.' ( RULE_INT )+ )?
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:15: ( '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:15: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:20: ( RULE_INT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:20: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:30: ( '.' ( RULE_INT )+ )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='.') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:31: '.' ( RULE_INT )+
                            {
                            match('.'); 
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:35: ( RULE_INT )+
                            int cnt4=0;
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:35: RULE_INT
                            	    {
                            	    mRULE_INT(); 

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


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:47: ( '-' )? ( RULE_INT )+ '.'
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:47: ( '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:47: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:52: ( RULE_INT )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:52: RULE_INT
                    	    {
                    	    mRULE_INT(); 

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

                    match('.'); 

                    }
                    break;
                case 3 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:66: ( '-' )? ( RULE_INT )+ ( '.' ( RULE_INT )* )? ( 'e' | 'E' ) ( '-' | '+' )? ( RULE_INT )+
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:66: ( '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:66: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:71: ( RULE_INT )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:71: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:81: ( '.' ( RULE_INT )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='.') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:82: '.' ( RULE_INT )*
                            {
                            match('.'); 
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:86: ( RULE_INT )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:86: RULE_INT
                            	    {
                            	    mRULE_INT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:108: ( '-' | '+' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='+'||LA12_0=='-') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:119: ( RULE_INT )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1708:119: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1710:11: ( ( 'true' | 'false' ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1710:13: ( 'true' | 'false' )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1710:13: ( 'true' | 'false' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='t') ) {
                alt15=1;
            }
            else if ( (LA15_0=='f') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1710:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1710:21: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1712:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1712:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1712:11: ( '^' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='^') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1712:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1712:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1714:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1714:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1714:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\"') ) {
                alt20=1;
            }
            else if ( (LA20_0=='\'') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1714:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1714:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='!')||(LA18_0>='#' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1714:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1714:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1714:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1714:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1714:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1714:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1716:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1716:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1716:24: ( options {greedy=false; } : . )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='*') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='/') ) {
                        alt21=2;
                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='.')||(LA21_1>='0' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<=')')||(LA21_0>='+' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1716:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1718:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1718:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1718:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1718:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1718:40: ( ( '\\r' )? '\\n' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\n'||LA24_0=='\r') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1718:41: ( '\\r' )? '\\n'
                    {
                    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1718:41: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1718:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1720:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1720:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1720:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1722:16: ( . )
            // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1722:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | RULE_INT | RULE_FLOAT | RULE_BOOL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt26=54;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:280: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 47 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:289: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 48 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:300: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 49 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:310: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 50 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:318: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 51 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:330: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 52 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:346: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 53 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:362: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 54 :
                // ../unifi.marcotinacci.thesis.seal/src-gen/unifi/marcotinacci/thesis/seal/parser/antlr/internal/InternalSeal.g:1:370: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA14_eotS =
        "\3\3\1\uffff\1\7\1\uffff\1\3\1\uffff";
    static final String DFA14_eofS =
        "\10\uffff";
    static final String DFA14_minS =
        "\1\55\1\60\1\56\1\uffff\1\60\1\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\2\71\1\145\1\uffff\1\145\1\uffff\1\145\1\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\1\1\uffff\1\3\1\uffff\1\2";
    static final String DFA14_specialS =
        "\10\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\2\uffff\12\2",
            "\12\2",
            "\1\4\1\uffff\12\2\13\uffff\1\5\37\uffff\1\5",
            "",
            "\12\6\13\uffff\1\5\37\uffff\1\5",
            "",
            "\12\6\13\uffff\1\5\37\uffff\1\5",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1708:14: ( ( '-' )? ( RULE_INT )* ( '.' ( RULE_INT )+ )? | ( '-' )? ( RULE_INT )+ '.' | ( '-' )? ( RULE_INT )+ ( '.' ( RULE_INT )* )? ( 'e' | 'E' ) ( '-' | '+' )? ( RULE_INT )+ )";
        }
    }
    static final String DFA26_eotS =
        "\1\42\1\53\1\uffff\1\56\4\53\1\uffff\1\66\2\uffff\1\53\1\74\1\53"+
        "\1\uffff\4\53\1\uffff\1\111\1\113\1\50\1\53\1\50\1\uffff\1\120\1"+
        "\uffff\1\124\3\uffff\1\130\1\uffff\1\50\1\uffff\2\50\2\uffff\2\53"+
        "\4\uffff\4\53\1\144\1\53\4\uffff\1\53\3\uffff\1\53\1\uffff\10\53"+
        "\6\uffff\1\161\13\uffff\1\130\2\uffff\1\53\1\163\4\53\1\uffff\1"+
        "\170\1\uffff\10\53\1\u0081\3\53\1\uffff\1\53\1\uffff\4\53\1\uffff"+
        "\4\53\1\u008e\1\u008f\2\53\1\uffff\2\53\1\u0094\2\53\1\uffff\3\53"+
        "\1\u009a\2\53\2\uffff\1\u009d\1\53\1\u009f\1\u008f\1\uffff\3\53"+
        "\1\u00a3\1\u00a4\1\uffff\1\u00a5\1\u00a6\1\uffff\1\53\1\uffff\1"+
        "\u00a8\1\u00a9\1\53\4\uffff\1\53\2\uffff\1\53\1\u00ad\1\53\1\uffff"+
        "\1\53\1\u00b0\1\uffff";
    static final String DFA26_eofS =
        "\u00b1\uffff";
    static final String DFA26_minS =
        "\1\0\1\143\1\uffff\1\174\1\165\2\156\1\141\1\uffff\1\60\2\uffff"+
        "\1\145\1\75\1\157\1\uffff\1\141\1\145\1\141\1\157\1\uffff\2\75\1"+
        "\173\1\162\1\75\1\uffff\1\56\1\uffff\1\52\3\uffff\1\56\1\uffff\1"+
        "\101\1\uffff\2\0\2\uffff\1\164\1\144\4\uffff\1\142\1\166\1\151\1"+
        "\40\1\60\1\156\4\uffff\1\154\3\uffff\1\144\1\uffff\1\162\1\151\1"+
        "\165\1\166\1\141\1\157\1\154\1\157\6\uffff\1\60\13\uffff\1\56\2"+
        "\uffff\1\151\1\60\1\152\1\150\1\151\1\163\1\uffff\1\60\1\uffff\1"+
        "\147\1\164\1\165\1\147\1\163\2\145\1\143\1\60\1\141\1\163\1\154"+
        "\1\uffff\1\157\1\uffff\1\145\1\40\1\162\1\164\1\uffff\1\145\1\141"+
        "\1\154\1\145\2\60\1\162\1\164\1\uffff\1\164\1\145\1\60\1\156\1\143"+
        "\1\uffff\1\157\2\163\1\60\1\145\1\164\2\uffff\1\60\1\151\2\60\1"+
        "\uffff\1\163\1\164\1\156\2\60\1\uffff\2\60\1\uffff\1\157\1\uffff"+
        "\2\60\1\155\4\uffff\1\156\2\uffff\1\145\1\60\1\156\1\uffff\1\164"+
        "\1\60\1\uffff";
    static final String DFA26_maxS =
        "\1\uffff\1\156\1\uffff\1\174\1\165\1\170\1\163\1\141\1\uffff\1\71"+
        "\2\uffff\1\145\1\76\1\157\1\uffff\1\162\1\157\1\154\1\157\1\uffff"+
        "\2\75\1\173\1\162\1\75\1\uffff\1\71\1\uffff\1\57\3\uffff\1\145\1"+
        "\uffff\1\172\1\uffff\2\uffff\2\uffff\1\164\1\144\4\uffff\1\143\1"+
        "\166\1\151\1\40\1\172\1\156\4\uffff\1\154\3\uffff\1\144\1\uffff"+
        "\1\162\1\151\1\165\1\166\1\164\1\157\1\154\1\157\6\uffff\1\172\13"+
        "\uffff\1\145\2\uffff\1\151\1\172\1\152\1\150\1\151\1\163\1\uffff"+
        "\1\172\1\uffff\1\147\1\164\1\165\1\147\1\163\2\145\1\143\1\172\1"+
        "\141\1\163\1\154\1\uffff\1\157\1\uffff\1\145\1\40\1\162\1\164\1"+
        "\uffff\1\145\1\141\1\154\1\145\2\172\1\162\1\164\1\uffff\1\164\1"+
        "\145\1\172\1\156\1\143\1\uffff\1\157\2\163\1\172\1\145\1\164\2\uffff"+
        "\1\172\1\151\2\172\1\uffff\1\163\1\164\1\156\2\172\1\uffff\2\172"+
        "\1\uffff\1\157\1\uffff\2\172\1\155\4\uffff\1\156\2\uffff\1\145\1"+
        "\172\1\156\1\uffff\1\164\1\172\1\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\5\uffff\1\10\1\uffff\1\13\1\14\3\uffff\1\20\4\uffff"+
        "\1\27\5\uffff\1\43\1\uffff\1\45\1\uffff\1\47\1\50\1\53\1\uffff\1"+
        "\57\1\uffff\1\61\2\uffff\1\65\1\66\2\uffff\1\61\1\2\1\34\1\3\6\uffff"+
        "\1\10\1\11\1\13\1\14\1\uffff\1\26\1\40\1\16\1\uffff\1\20\10\uffff"+
        "\1\27\1\37\1\30\1\42\1\31\1\33\1\uffff\1\41\1\43\1\44\1\45\1\63"+
        "\1\64\1\46\1\47\1\50\1\53\1\56\1\uffff\1\62\1\65\6\uffff\1\6\1\uffff"+
        "\1\12\14\uffff\1\36\1\uffff\1\35\4\uffff\1\23\10\uffff\1\51\5\uffff"+
        "\1\54\6\uffff\1\55\1\60\4\uffff\1\25\5\uffff\1\15\2\uffff\1\22\1"+
        "\uffff\1\24\3\uffff\1\52\1\7\1\17\1\21\1\uffff\1\1\1\4\3\uffff\1"+
        "\32\2\uffff\1\5";
    static final String DFA26_specialS =
        "\1\2\44\uffff\1\1\1\0\u008a\uffff}>";
    static final String[] DFA26_transitionS = {
            "\11\50\2\47\2\50\1\47\22\50\1\47\1\31\1\45\1\24\3\50\1\46\1"+
            "\36\1\37\1\34\1\32\1\10\1\33\1\11\1\35\12\41\1\40\1\17\1\25"+
            "\1\15\1\26\2\50\32\44\1\12\1\50\1\13\1\43\1\44\1\50\1\1\1\23"+
            "\1\44\1\14\1\5\1\22\2\44\1\6\3\44\1\16\1\21\1\30\2\44\1\7\1"+
            "\4\1\20\6\44\1\2\1\27\1\3\uff82\50",
            "\1\51\12\uffff\1\52",
            "",
            "\1\55",
            "\1\57",
            "\1\60\11\uffff\1\61",
            "\1\63\4\uffff\1\62",
            "\1\64",
            "",
            "\12\42",
            "",
            "",
            "\1\71",
            "\1\73\1\72",
            "\1\75",
            "",
            "\1\77\6\uffff\1\100\11\uffff\1\101",
            "\1\102\11\uffff\1\103",
            "\1\105\12\uffff\1\104",
            "\1\106",
            "",
            "\1\110",
            "\1\112",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "\1\42\1\uffff\12\42",
            "",
            "\1\122\4\uffff\1\123",
            "",
            "",
            "",
            "\1\42\1\uffff\12\131\13\uffff\1\42\37\uffff\1\42",
            "",
            "\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\0\132",
            "\0\132",
            "",
            "",
            "\1\134",
            "\1\135",
            "",
            "",
            "",
            "",
            "\1\136\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\143\6\53",
            "\1\145",
            "",
            "",
            "",
            "",
            "\1\146",
            "",
            "",
            "",
            "\1\147",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154\22\uffff\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42\1\uffff\12\131\13\uffff\1\42\37\uffff\1\42",
            "",
            "",
            "\1\162",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\u0093",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u009b",
            "\1\u009c",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u009e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00a7",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00aa",
            "",
            "",
            "",
            "",
            "\1\u00ab",
            "",
            "",
            "\1\u00ac",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | RULE_INT | RULE_FLOAT | RULE_BOOL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_38 = input.LA(1);

                        s = -1;
                        if ( ((LA26_38>='\u0000' && LA26_38<='\uFFFF')) ) {s = 90;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_37 = input.LA(1);

                        s = -1;
                        if ( ((LA26_37>='\u0000' && LA26_37<='\uFFFF')) ) {s = 90;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_0 = input.LA(1);

                        s = -1;
                        if ( (LA26_0=='a') ) {s = 1;}

                        else if ( (LA26_0=='{') ) {s = 2;}

                        else if ( (LA26_0=='}') ) {s = 3;}

                        else if ( (LA26_0=='s') ) {s = 4;}

                        else if ( (LA26_0=='e') ) {s = 5;}

                        else if ( (LA26_0=='i') ) {s = 6;}

                        else if ( (LA26_0=='r') ) {s = 7;}

                        else if ( (LA26_0==',') ) {s = 8;}

                        else if ( (LA26_0=='.') ) {s = 9;}

                        else if ( (LA26_0=='[') ) {s = 10;}

                        else if ( (LA26_0==']') ) {s = 11;}

                        else if ( (LA26_0=='d') ) {s = 12;}

                        else if ( (LA26_0=='=') ) {s = 13;}

                        else if ( (LA26_0=='m') ) {s = 14;}

                        else if ( (LA26_0==';') ) {s = 15;}

                        else if ( (LA26_0=='t') ) {s = 16;}

                        else if ( (LA26_0=='n') ) {s = 17;}

                        else if ( (LA26_0=='f') ) {s = 18;}

                        else if ( (LA26_0=='b') ) {s = 19;}

                        else if ( (LA26_0=='#') ) {s = 20;}

                        else if ( (LA26_0=='<') ) {s = 21;}

                        else if ( (LA26_0=='>') ) {s = 22;}

                        else if ( (LA26_0=='|') ) {s = 23;}

                        else if ( (LA26_0=='o') ) {s = 24;}

                        else if ( (LA26_0=='!') ) {s = 25;}

                        else if ( (LA26_0=='+') ) {s = 26;}

                        else if ( (LA26_0=='-') ) {s = 27;}

                        else if ( (LA26_0=='*') ) {s = 28;}

                        else if ( (LA26_0=='/') ) {s = 29;}

                        else if ( (LA26_0=='(') ) {s = 30;}

                        else if ( (LA26_0==')') ) {s = 31;}

                        else if ( (LA26_0==':') ) {s = 32;}

                        else if ( ((LA26_0>='0' && LA26_0<='9')) ) {s = 33;}

                        else if ( (LA26_0=='^') ) {s = 35;}

                        else if ( ((LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||LA26_0=='c'||(LA26_0>='g' && LA26_0<='h')||(LA26_0>='j' && LA26_0<='l')||(LA26_0>='p' && LA26_0<='q')||(LA26_0>='u' && LA26_0<='z')) ) {s = 36;}

                        else if ( (LA26_0=='\"') ) {s = 37;}

                        else if ( (LA26_0=='\'') ) {s = 38;}

                        else if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {s = 39;}

                        else if ( ((LA26_0>='\u0000' && LA26_0<='\b')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\u001F')||(LA26_0>='$' && LA26_0<='&')||(LA26_0>='?' && LA26_0<='@')||LA26_0=='\\'||LA26_0=='`'||(LA26_0>='~' && LA26_0<='\uFFFF')) ) {s = 40;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}