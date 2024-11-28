package fr.imt.bertin.dala.project.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.imt.bertin.dala.project.services.BrowserGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrowserParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OPEN_URL'", "'CLICK_LINK'", "'CLICK_IMAGE'", "'VERIFY_LINK'", "','", "'FILL_TEXT'", "'INTO'", "'CLICK_BUTTON'", "'VERIFY_TEXT'", "'SELECT_OPTION'", "'UNCHECK_ALL_CHECKBOXES'", "'CHECK_CHECKBOXES'", "'['", "']'", "'SAVE_LINK'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBrowserParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBrowserParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBrowserParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBrowser.g"; }



     	private BrowserGrammarAccess grammarAccess;

        public InternalBrowserParser(TokenStream input, BrowserGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BrowserGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBrowser.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBrowser.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBrowser.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalBrowser.g:71:1: ruleModel returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalBrowser.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalBrowser.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=14)||LA1_0==16||(LA1_0>=18 && LA1_0<=22)||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrowser.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalBrowser.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalBrowser.g:80:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"fr.imt.bertin.dala.project.Browser.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleStatement"
    // InternalBrowser.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalBrowser.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalBrowser.g:101:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalBrowser.g:107:1: ruleStatement returns [EObject current=null] : (this_OpenUrl_0= ruleOpenUrl | this_ClickLink_1= ruleClickLink | this_ClickImage_2= ruleClickImage | this_VerifyLink_3= ruleVerifyLink | this_FillText_4= ruleFillText | this_ClickButton_5= ruleClickButton | this_VerifyText_6= ruleVerifyText | this_SelectOption_7= ruleSelectOption | ruleUncheckAllCheckboxes | this_CheckCheckboxes_9= ruleCheckCheckboxes | this_SaveLink_10= ruleSaveLink ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_OpenUrl_0 = null;

        EObject this_ClickLink_1 = null;

        EObject this_ClickImage_2 = null;

        EObject this_VerifyLink_3 = null;

        EObject this_FillText_4 = null;

        EObject this_ClickButton_5 = null;

        EObject this_VerifyText_6 = null;

        EObject this_SelectOption_7 = null;

        EObject this_CheckCheckboxes_9 = null;

        EObject this_SaveLink_10 = null;



        	enterRule();

        try {
            // InternalBrowser.g:113:2: ( (this_OpenUrl_0= ruleOpenUrl | this_ClickLink_1= ruleClickLink | this_ClickImage_2= ruleClickImage | this_VerifyLink_3= ruleVerifyLink | this_FillText_4= ruleFillText | this_ClickButton_5= ruleClickButton | this_VerifyText_6= ruleVerifyText | this_SelectOption_7= ruleSelectOption | ruleUncheckAllCheckboxes | this_CheckCheckboxes_9= ruleCheckCheckboxes | this_SaveLink_10= ruleSaveLink ) )
            // InternalBrowser.g:114:2: (this_OpenUrl_0= ruleOpenUrl | this_ClickLink_1= ruleClickLink | this_ClickImage_2= ruleClickImage | this_VerifyLink_3= ruleVerifyLink | this_FillText_4= ruleFillText | this_ClickButton_5= ruleClickButton | this_VerifyText_6= ruleVerifyText | this_SelectOption_7= ruleSelectOption | ruleUncheckAllCheckboxes | this_CheckCheckboxes_9= ruleCheckCheckboxes | this_SaveLink_10= ruleSaveLink )
            {
            // InternalBrowser.g:114:2: (this_OpenUrl_0= ruleOpenUrl | this_ClickLink_1= ruleClickLink | this_ClickImage_2= ruleClickImage | this_VerifyLink_3= ruleVerifyLink | this_FillText_4= ruleFillText | this_ClickButton_5= ruleClickButton | this_VerifyText_6= ruleVerifyText | this_SelectOption_7= ruleSelectOption | ruleUncheckAllCheckboxes | this_CheckCheckboxes_9= ruleCheckCheckboxes | this_SaveLink_10= ruleSaveLink )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            case 18:
                {
                alt2=6;
                }
                break;
            case 19:
                {
                alt2=7;
                }
                break;
            case 20:
                {
                alt2=8;
                }
                break;
            case 21:
                {
                alt2=9;
                }
                break;
            case 22:
                {
                alt2=10;
                }
                break;
            case 25:
                {
                alt2=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBrowser.g:115:3: this_OpenUrl_0= ruleOpenUrl
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getOpenUrlParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpenUrl_0=ruleOpenUrl();

                    state._fsp--;


                    			current = this_OpenUrl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowser.g:124:3: this_ClickLink_1= ruleClickLink
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getClickLinkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClickLink_1=ruleClickLink();

                    state._fsp--;


                    			current = this_ClickLink_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowser.g:133:3: this_ClickImage_2= ruleClickImage
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getClickImageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClickImage_2=ruleClickImage();

                    state._fsp--;


                    			current = this_ClickImage_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowser.g:142:3: this_VerifyLink_3= ruleVerifyLink
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVerifyLinkParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VerifyLink_3=ruleVerifyLink();

                    state._fsp--;


                    			current = this_VerifyLink_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowser.g:151:3: this_FillText_4= ruleFillText
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getFillTextParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FillText_4=ruleFillText();

                    state._fsp--;


                    			current = this_FillText_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBrowser.g:160:3: this_ClickButton_5= ruleClickButton
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getClickButtonParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClickButton_5=ruleClickButton();

                    state._fsp--;


                    			current = this_ClickButton_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBrowser.g:169:3: this_VerifyText_6= ruleVerifyText
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVerifyTextParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_VerifyText_6=ruleVerifyText();

                    state._fsp--;


                    			current = this_VerifyText_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalBrowser.g:178:3: this_SelectOption_7= ruleSelectOption
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSelectOptionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectOption_7=ruleSelectOption();

                    state._fsp--;


                    			current = this_SelectOption_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalBrowser.g:187:3: ruleUncheckAllCheckboxes
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getUncheckAllCheckboxesParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    ruleUncheckAllCheckboxes();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalBrowser.g:195:3: this_CheckCheckboxes_9= ruleCheckCheckboxes
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCheckCheckboxesParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckCheckboxes_9=ruleCheckCheckboxes();

                    state._fsp--;


                    			current = this_CheckCheckboxes_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalBrowser.g:204:3: this_SaveLink_10= ruleSaveLink
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSaveLinkParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_SaveLink_10=ruleSaveLink();

                    state._fsp--;


                    			current = this_SaveLink_10;
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


    // $ANTLR start "entryRuleOpenUrl"
    // InternalBrowser.g:216:1: entryRuleOpenUrl returns [EObject current=null] : iv_ruleOpenUrl= ruleOpenUrl EOF ;
    public final EObject entryRuleOpenUrl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenUrl = null;


        try {
            // InternalBrowser.g:216:48: (iv_ruleOpenUrl= ruleOpenUrl EOF )
            // InternalBrowser.g:217:2: iv_ruleOpenUrl= ruleOpenUrl EOF
            {
             newCompositeNode(grammarAccess.getOpenUrlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpenUrl=ruleOpenUrl();

            state._fsp--;

             current =iv_ruleOpenUrl; 
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
    // $ANTLR end "entryRuleOpenUrl"


    // $ANTLR start "ruleOpenUrl"
    // InternalBrowser.g:223:1: ruleOpenUrl returns [EObject current=null] : (otherlv_0= 'OPEN_URL' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleOpenUrl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalBrowser.g:229:2: ( (otherlv_0= 'OPEN_URL' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalBrowser.g:230:2: (otherlv_0= 'OPEN_URL' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalBrowser.g:230:2: (otherlv_0= 'OPEN_URL' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalBrowser.g:231:3: otherlv_0= 'OPEN_URL' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpenUrlAccess().getOPEN_URLKeyword_0());
            		
            // InternalBrowser.g:235:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalBrowser.g:236:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalBrowser.g:236:4: (lv_url_1_0= RULE_STRING )
            // InternalBrowser.g:237:5: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_url_1_0, grammarAccess.getOpenUrlAccess().getUrlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpenUrlRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleOpenUrl"


    // $ANTLR start "entryRuleClickLink"
    // InternalBrowser.g:257:1: entryRuleClickLink returns [EObject current=null] : iv_ruleClickLink= ruleClickLink EOF ;
    public final EObject entryRuleClickLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickLink = null;


        try {
            // InternalBrowser.g:257:50: (iv_ruleClickLink= ruleClickLink EOF )
            // InternalBrowser.g:258:2: iv_ruleClickLink= ruleClickLink EOF
            {
             newCompositeNode(grammarAccess.getClickLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClickLink=ruleClickLink();

            state._fsp--;

             current =iv_ruleClickLink; 
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
    // $ANTLR end "entryRuleClickLink"


    // $ANTLR start "ruleClickLink"
    // InternalBrowser.g:264:1: ruleClickLink returns [EObject current=null] : (otherlv_0= 'CLICK_LINK' ( (lv_linkText_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleClickLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_linkText_1_0=null;


        	enterRule();

        try {
            // InternalBrowser.g:270:2: ( (otherlv_0= 'CLICK_LINK' ( (lv_linkText_1_0= RULE_STRING ) ) ) )
            // InternalBrowser.g:271:2: (otherlv_0= 'CLICK_LINK' ( (lv_linkText_1_0= RULE_STRING ) ) )
            {
            // InternalBrowser.g:271:2: (otherlv_0= 'CLICK_LINK' ( (lv_linkText_1_0= RULE_STRING ) ) )
            // InternalBrowser.g:272:3: otherlv_0= 'CLICK_LINK' ( (lv_linkText_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClickLinkAccess().getCLICK_LINKKeyword_0());
            		
            // InternalBrowser.g:276:3: ( (lv_linkText_1_0= RULE_STRING ) )
            // InternalBrowser.g:277:4: (lv_linkText_1_0= RULE_STRING )
            {
            // InternalBrowser.g:277:4: (lv_linkText_1_0= RULE_STRING )
            // InternalBrowser.g:278:5: lv_linkText_1_0= RULE_STRING
            {
            lv_linkText_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_linkText_1_0, grammarAccess.getClickLinkAccess().getLinkTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"linkText",
            						lv_linkText_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleClickLink"


    // $ANTLR start "entryRuleClickImage"
    // InternalBrowser.g:298:1: entryRuleClickImage returns [EObject current=null] : iv_ruleClickImage= ruleClickImage EOF ;
    public final EObject entryRuleClickImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickImage = null;


        try {
            // InternalBrowser.g:298:51: (iv_ruleClickImage= ruleClickImage EOF )
            // InternalBrowser.g:299:2: iv_ruleClickImage= ruleClickImage EOF
            {
             newCompositeNode(grammarAccess.getClickImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClickImage=ruleClickImage();

            state._fsp--;

             current =iv_ruleClickImage; 
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
    // $ANTLR end "entryRuleClickImage"


    // $ANTLR start "ruleClickImage"
    // InternalBrowser.g:305:1: ruleClickImage returns [EObject current=null] : (otherlv_0= 'CLICK_IMAGE' ( (lv_altText_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleClickImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_altText_1_0=null;


        	enterRule();

        try {
            // InternalBrowser.g:311:2: ( (otherlv_0= 'CLICK_IMAGE' ( (lv_altText_1_0= RULE_STRING ) ) ) )
            // InternalBrowser.g:312:2: (otherlv_0= 'CLICK_IMAGE' ( (lv_altText_1_0= RULE_STRING ) ) )
            {
            // InternalBrowser.g:312:2: (otherlv_0= 'CLICK_IMAGE' ( (lv_altText_1_0= RULE_STRING ) ) )
            // InternalBrowser.g:313:3: otherlv_0= 'CLICK_IMAGE' ( (lv_altText_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClickImageAccess().getCLICK_IMAGEKeyword_0());
            		
            // InternalBrowser.g:317:3: ( (lv_altText_1_0= RULE_STRING ) )
            // InternalBrowser.g:318:4: (lv_altText_1_0= RULE_STRING )
            {
            // InternalBrowser.g:318:4: (lv_altText_1_0= RULE_STRING )
            // InternalBrowser.g:319:5: lv_altText_1_0= RULE_STRING
            {
            lv_altText_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_altText_1_0, grammarAccess.getClickImageAccess().getAltTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickImageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"altText",
            						lv_altText_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleClickImage"


    // $ANTLR start "entryRuleVerifyLink"
    // InternalBrowser.g:339:1: entryRuleVerifyLink returns [EObject current=null] : iv_ruleVerifyLink= ruleVerifyLink EOF ;
    public final EObject entryRuleVerifyLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifyLink = null;


        try {
            // InternalBrowser.g:339:51: (iv_ruleVerifyLink= ruleVerifyLink EOF )
            // InternalBrowser.g:340:2: iv_ruleVerifyLink= ruleVerifyLink EOF
            {
             newCompositeNode(grammarAccess.getVerifyLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerifyLink=ruleVerifyLink();

            state._fsp--;

             current =iv_ruleVerifyLink; 
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
    // $ANTLR end "entryRuleVerifyLink"


    // $ANTLR start "ruleVerifyLink"
    // InternalBrowser.g:346:1: ruleVerifyLink returns [EObject current=null] : (otherlv_0= 'VERIFY_LINK' ( (lv_texts_1_0= ruleTextPart ) ) (otherlv_2= ',' ( (lv_texts_3_0= ruleTextPart ) ) )* ) ;
    public final EObject ruleVerifyLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_texts_1_0 = null;

        EObject lv_texts_3_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:352:2: ( (otherlv_0= 'VERIFY_LINK' ( (lv_texts_1_0= ruleTextPart ) ) (otherlv_2= ',' ( (lv_texts_3_0= ruleTextPart ) ) )* ) )
            // InternalBrowser.g:353:2: (otherlv_0= 'VERIFY_LINK' ( (lv_texts_1_0= ruleTextPart ) ) (otherlv_2= ',' ( (lv_texts_3_0= ruleTextPart ) ) )* )
            {
            // InternalBrowser.g:353:2: (otherlv_0= 'VERIFY_LINK' ( (lv_texts_1_0= ruleTextPart ) ) (otherlv_2= ',' ( (lv_texts_3_0= ruleTextPart ) ) )* )
            // InternalBrowser.g:354:3: otherlv_0= 'VERIFY_LINK' ( (lv_texts_1_0= ruleTextPart ) ) (otherlv_2= ',' ( (lv_texts_3_0= ruleTextPart ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifyLinkAccess().getVERIFY_LINKKeyword_0());
            		
            // InternalBrowser.g:358:3: ( (lv_texts_1_0= ruleTextPart ) )
            // InternalBrowser.g:359:4: (lv_texts_1_0= ruleTextPart )
            {
            // InternalBrowser.g:359:4: (lv_texts_1_0= ruleTextPart )
            // InternalBrowser.g:360:5: lv_texts_1_0= ruleTextPart
            {

            					newCompositeNode(grammarAccess.getVerifyLinkAccess().getTextsTextPartParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_texts_1_0=ruleTextPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerifyLinkRule());
            					}
            					add(
            						current,
            						"texts",
            						lv_texts_1_0,
            						"fr.imt.bertin.dala.project.Browser.TextPart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowser.g:377:3: (otherlv_2= ',' ( (lv_texts_3_0= ruleTextPart ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBrowser.g:378:4: otherlv_2= ',' ( (lv_texts_3_0= ruleTextPart ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVerifyLinkAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBrowser.g:382:4: ( (lv_texts_3_0= ruleTextPart ) )
            	    // InternalBrowser.g:383:5: (lv_texts_3_0= ruleTextPart )
            	    {
            	    // InternalBrowser.g:383:5: (lv_texts_3_0= ruleTextPart )
            	    // InternalBrowser.g:384:6: lv_texts_3_0= ruleTextPart
            	    {

            	    						newCompositeNode(grammarAccess.getVerifyLinkAccess().getTextsTextPartParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_texts_3_0=ruleTextPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVerifyLinkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"texts",
            	    							lv_texts_3_0,
            	    							"fr.imt.bertin.dala.project.Browser.TextPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleVerifyLink"


    // $ANTLR start "entryRuleFillText"
    // InternalBrowser.g:406:1: entryRuleFillText returns [EObject current=null] : iv_ruleFillText= ruleFillText EOF ;
    public final EObject entryRuleFillText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFillText = null;


        try {
            // InternalBrowser.g:406:49: (iv_ruleFillText= ruleFillText EOF )
            // InternalBrowser.g:407:2: iv_ruleFillText= ruleFillText EOF
            {
             newCompositeNode(grammarAccess.getFillTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFillText=ruleFillText();

            state._fsp--;

             current =iv_ruleFillText; 
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
    // $ANTLR end "entryRuleFillText"


    // $ANTLR start "ruleFillText"
    // InternalBrowser.g:413:1: ruleFillText returns [EObject current=null] : (otherlv_0= 'FILL_TEXT' ( (lv_text_1_0= ruleTextPart ) ) otherlv_2= 'INTO' ( (lv_field_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleFillText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_field_3_0=null;
        EObject lv_text_1_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:419:2: ( (otherlv_0= 'FILL_TEXT' ( (lv_text_1_0= ruleTextPart ) ) otherlv_2= 'INTO' ( (lv_field_3_0= RULE_STRING ) ) ) )
            // InternalBrowser.g:420:2: (otherlv_0= 'FILL_TEXT' ( (lv_text_1_0= ruleTextPart ) ) otherlv_2= 'INTO' ( (lv_field_3_0= RULE_STRING ) ) )
            {
            // InternalBrowser.g:420:2: (otherlv_0= 'FILL_TEXT' ( (lv_text_1_0= ruleTextPart ) ) otherlv_2= 'INTO' ( (lv_field_3_0= RULE_STRING ) ) )
            // InternalBrowser.g:421:3: otherlv_0= 'FILL_TEXT' ( (lv_text_1_0= ruleTextPart ) ) otherlv_2= 'INTO' ( (lv_field_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFillTextAccess().getFILL_TEXTKeyword_0());
            		
            // InternalBrowser.g:425:3: ( (lv_text_1_0= ruleTextPart ) )
            // InternalBrowser.g:426:4: (lv_text_1_0= ruleTextPart )
            {
            // InternalBrowser.g:426:4: (lv_text_1_0= ruleTextPart )
            // InternalBrowser.g:427:5: lv_text_1_0= ruleTextPart
            {

            					newCompositeNode(grammarAccess.getFillTextAccess().getTextTextPartParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_text_1_0=ruleTextPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFillTextRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_1_0,
            						"fr.imt.bertin.dala.project.Browser.TextPart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFillTextAccess().getINTOKeyword_2());
            		
            // InternalBrowser.g:448:3: ( (lv_field_3_0= RULE_STRING ) )
            // InternalBrowser.g:449:4: (lv_field_3_0= RULE_STRING )
            {
            // InternalBrowser.g:449:4: (lv_field_3_0= RULE_STRING )
            // InternalBrowser.g:450:5: lv_field_3_0= RULE_STRING
            {
            lv_field_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_field_3_0, grammarAccess.getFillTextAccess().getFieldSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFillTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"field",
            						lv_field_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleFillText"


    // $ANTLR start "entryRuleClickButton"
    // InternalBrowser.g:470:1: entryRuleClickButton returns [EObject current=null] : iv_ruleClickButton= ruleClickButton EOF ;
    public final EObject entryRuleClickButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickButton = null;


        try {
            // InternalBrowser.g:470:52: (iv_ruleClickButton= ruleClickButton EOF )
            // InternalBrowser.g:471:2: iv_ruleClickButton= ruleClickButton EOF
            {
             newCompositeNode(grammarAccess.getClickButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClickButton=ruleClickButton();

            state._fsp--;

             current =iv_ruleClickButton; 
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
    // $ANTLR end "entryRuleClickButton"


    // $ANTLR start "ruleClickButton"
    // InternalBrowser.g:477:1: ruleClickButton returns [EObject current=null] : (otherlv_0= 'CLICK_BUTTON' ( (lv_buttonText_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleClickButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_buttonText_1_0=null;


        	enterRule();

        try {
            // InternalBrowser.g:483:2: ( (otherlv_0= 'CLICK_BUTTON' ( (lv_buttonText_1_0= RULE_STRING ) ) ) )
            // InternalBrowser.g:484:2: (otherlv_0= 'CLICK_BUTTON' ( (lv_buttonText_1_0= RULE_STRING ) ) )
            {
            // InternalBrowser.g:484:2: (otherlv_0= 'CLICK_BUTTON' ( (lv_buttonText_1_0= RULE_STRING ) ) )
            // InternalBrowser.g:485:3: otherlv_0= 'CLICK_BUTTON' ( (lv_buttonText_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClickButtonAccess().getCLICK_BUTTONKeyword_0());
            		
            // InternalBrowser.g:489:3: ( (lv_buttonText_1_0= RULE_STRING ) )
            // InternalBrowser.g:490:4: (lv_buttonText_1_0= RULE_STRING )
            {
            // InternalBrowser.g:490:4: (lv_buttonText_1_0= RULE_STRING )
            // InternalBrowser.g:491:5: lv_buttonText_1_0= RULE_STRING
            {
            lv_buttonText_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_buttonText_1_0, grammarAccess.getClickButtonAccess().getButtonTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"buttonText",
            						lv_buttonText_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleClickButton"


    // $ANTLR start "entryRuleVerifyText"
    // InternalBrowser.g:511:1: entryRuleVerifyText returns [EObject current=null] : iv_ruleVerifyText= ruleVerifyText EOF ;
    public final EObject entryRuleVerifyText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifyText = null;


        try {
            // InternalBrowser.g:511:51: (iv_ruleVerifyText= ruleVerifyText EOF )
            // InternalBrowser.g:512:2: iv_ruleVerifyText= ruleVerifyText EOF
            {
             newCompositeNode(grammarAccess.getVerifyTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerifyText=ruleVerifyText();

            state._fsp--;

             current =iv_ruleVerifyText; 
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
    // $ANTLR end "entryRuleVerifyText"


    // $ANTLR start "ruleVerifyText"
    // InternalBrowser.g:518:1: ruleVerifyText returns [EObject current=null] : (otherlv_0= 'VERIFY_TEXT' ( (lv_texts_1_0= ruleTextPart ) ) (otherlv_2= ',' ( (lv_texts_3_0= ruleTextPart ) ) )* ) ;
    public final EObject ruleVerifyText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_texts_1_0 = null;

        EObject lv_texts_3_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:524:2: ( (otherlv_0= 'VERIFY_TEXT' ( (lv_texts_1_0= ruleTextPart ) ) (otherlv_2= ',' ( (lv_texts_3_0= ruleTextPart ) ) )* ) )
            // InternalBrowser.g:525:2: (otherlv_0= 'VERIFY_TEXT' ( (lv_texts_1_0= ruleTextPart ) ) (otherlv_2= ',' ( (lv_texts_3_0= ruleTextPart ) ) )* )
            {
            // InternalBrowser.g:525:2: (otherlv_0= 'VERIFY_TEXT' ( (lv_texts_1_0= ruleTextPart ) ) (otherlv_2= ',' ( (lv_texts_3_0= ruleTextPart ) ) )* )
            // InternalBrowser.g:526:3: otherlv_0= 'VERIFY_TEXT' ( (lv_texts_1_0= ruleTextPart ) ) (otherlv_2= ',' ( (lv_texts_3_0= ruleTextPart ) ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifyTextAccess().getVERIFY_TEXTKeyword_0());
            		
            // InternalBrowser.g:530:3: ( (lv_texts_1_0= ruleTextPart ) )
            // InternalBrowser.g:531:4: (lv_texts_1_0= ruleTextPart )
            {
            // InternalBrowser.g:531:4: (lv_texts_1_0= ruleTextPart )
            // InternalBrowser.g:532:5: lv_texts_1_0= ruleTextPart
            {

            					newCompositeNode(grammarAccess.getVerifyTextAccess().getTextsTextPartParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_texts_1_0=ruleTextPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerifyTextRule());
            					}
            					add(
            						current,
            						"texts",
            						lv_texts_1_0,
            						"fr.imt.bertin.dala.project.Browser.TextPart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowser.g:549:3: (otherlv_2= ',' ( (lv_texts_3_0= ruleTextPart ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBrowser.g:550:4: otherlv_2= ',' ( (lv_texts_3_0= ruleTextPart ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVerifyTextAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBrowser.g:554:4: ( (lv_texts_3_0= ruleTextPart ) )
            	    // InternalBrowser.g:555:5: (lv_texts_3_0= ruleTextPart )
            	    {
            	    // InternalBrowser.g:555:5: (lv_texts_3_0= ruleTextPart )
            	    // InternalBrowser.g:556:6: lv_texts_3_0= ruleTextPart
            	    {

            	    						newCompositeNode(grammarAccess.getVerifyTextAccess().getTextsTextPartParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_texts_3_0=ruleTextPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVerifyTextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"texts",
            	    							lv_texts_3_0,
            	    							"fr.imt.bertin.dala.project.Browser.TextPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleVerifyText"


    // $ANTLR start "entryRuleSelectOption"
    // InternalBrowser.g:578:1: entryRuleSelectOption returns [EObject current=null] : iv_ruleSelectOption= ruleSelectOption EOF ;
    public final EObject entryRuleSelectOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectOption = null;


        try {
            // InternalBrowser.g:578:53: (iv_ruleSelectOption= ruleSelectOption EOF )
            // InternalBrowser.g:579:2: iv_ruleSelectOption= ruleSelectOption EOF
            {
             newCompositeNode(grammarAccess.getSelectOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectOption=ruleSelectOption();

            state._fsp--;

             current =iv_ruleSelectOption; 
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
    // $ANTLR end "entryRuleSelectOption"


    // $ANTLR start "ruleSelectOption"
    // InternalBrowser.g:585:1: ruleSelectOption returns [EObject current=null] : (otherlv_0= 'SELECT_OPTION' ( (lv_linkText_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSelectOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_linkText_1_0=null;


        	enterRule();

        try {
            // InternalBrowser.g:591:2: ( (otherlv_0= 'SELECT_OPTION' ( (lv_linkText_1_0= RULE_STRING ) ) ) )
            // InternalBrowser.g:592:2: (otherlv_0= 'SELECT_OPTION' ( (lv_linkText_1_0= RULE_STRING ) ) )
            {
            // InternalBrowser.g:592:2: (otherlv_0= 'SELECT_OPTION' ( (lv_linkText_1_0= RULE_STRING ) ) )
            // InternalBrowser.g:593:3: otherlv_0= 'SELECT_OPTION' ( (lv_linkText_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectOptionAccess().getSELECT_OPTIONKeyword_0());
            		
            // InternalBrowser.g:597:3: ( (lv_linkText_1_0= RULE_STRING ) )
            // InternalBrowser.g:598:4: (lv_linkText_1_0= RULE_STRING )
            {
            // InternalBrowser.g:598:4: (lv_linkText_1_0= RULE_STRING )
            // InternalBrowser.g:599:5: lv_linkText_1_0= RULE_STRING
            {
            lv_linkText_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_linkText_1_0, grammarAccess.getSelectOptionAccess().getLinkTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"linkText",
            						lv_linkText_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleSelectOption"


    // $ANTLR start "entryRuleUncheckAllCheckboxes"
    // InternalBrowser.g:619:1: entryRuleUncheckAllCheckboxes returns [String current=null] : iv_ruleUncheckAllCheckboxes= ruleUncheckAllCheckboxes EOF ;
    public final String entryRuleUncheckAllCheckboxes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUncheckAllCheckboxes = null;


        try {
            // InternalBrowser.g:619:60: (iv_ruleUncheckAllCheckboxes= ruleUncheckAllCheckboxes EOF )
            // InternalBrowser.g:620:2: iv_ruleUncheckAllCheckboxes= ruleUncheckAllCheckboxes EOF
            {
             newCompositeNode(grammarAccess.getUncheckAllCheckboxesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUncheckAllCheckboxes=ruleUncheckAllCheckboxes();

            state._fsp--;

             current =iv_ruleUncheckAllCheckboxes.getText(); 
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
    // $ANTLR end "entryRuleUncheckAllCheckboxes"


    // $ANTLR start "ruleUncheckAllCheckboxes"
    // InternalBrowser.g:626:1: ruleUncheckAllCheckboxes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'UNCHECK_ALL_CHECKBOXES' ;
    public final AntlrDatatypeRuleToken ruleUncheckAllCheckboxes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowser.g:632:2: (kw= 'UNCHECK_ALL_CHECKBOXES' )
            // InternalBrowser.g:633:2: kw= 'UNCHECK_ALL_CHECKBOXES'
            {
            kw=(Token)match(input,21,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getUncheckAllCheckboxesAccess().getUNCHECK_ALL_CHECKBOXESKeyword());
            	

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
    // $ANTLR end "ruleUncheckAllCheckboxes"


    // $ANTLR start "entryRuleCheckCheckboxes"
    // InternalBrowser.g:641:1: entryRuleCheckCheckboxes returns [EObject current=null] : iv_ruleCheckCheckboxes= ruleCheckCheckboxes EOF ;
    public final EObject entryRuleCheckCheckboxes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckCheckboxes = null;


        try {
            // InternalBrowser.g:641:56: (iv_ruleCheckCheckboxes= ruleCheckCheckboxes EOF )
            // InternalBrowser.g:642:2: iv_ruleCheckCheckboxes= ruleCheckCheckboxes EOF
            {
             newCompositeNode(grammarAccess.getCheckCheckboxesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckCheckboxes=ruleCheckCheckboxes();

            state._fsp--;

             current =iv_ruleCheckCheckboxes; 
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
    // $ANTLR end "entryRuleCheckCheckboxes"


    // $ANTLR start "ruleCheckCheckboxes"
    // InternalBrowser.g:648:1: ruleCheckCheckboxes returns [EObject current=null] : (otherlv_0= 'CHECK_CHECKBOXES' otherlv_1= '[' ( (lv_items_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_items_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleCheckCheckboxes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_items_2_0=null;
        Token otherlv_3=null;
        Token lv_items_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBrowser.g:654:2: ( (otherlv_0= 'CHECK_CHECKBOXES' otherlv_1= '[' ( (lv_items_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_items_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) )
            // InternalBrowser.g:655:2: (otherlv_0= 'CHECK_CHECKBOXES' otherlv_1= '[' ( (lv_items_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_items_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            {
            // InternalBrowser.g:655:2: (otherlv_0= 'CHECK_CHECKBOXES' otherlv_1= '[' ( (lv_items_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_items_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            // InternalBrowser.g:656:3: otherlv_0= 'CHECK_CHECKBOXES' otherlv_1= '[' ( (lv_items_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_items_4_0= RULE_STRING ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckCheckboxesAccess().getCHECK_CHECKBOXESKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckCheckboxesAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalBrowser.g:664:3: ( (lv_items_2_0= RULE_STRING ) )
            // InternalBrowser.g:665:4: (lv_items_2_0= RULE_STRING )
            {
            // InternalBrowser.g:665:4: (lv_items_2_0= RULE_STRING )
            // InternalBrowser.g:666:5: lv_items_2_0= RULE_STRING
            {
            lv_items_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_items_2_0, grammarAccess.getCheckCheckboxesAccess().getItemsSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckCheckboxesRule());
            					}
            					addWithLastConsumed(
            						current,
            						"items",
            						lv_items_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBrowser.g:682:3: (otherlv_3= ',' ( (lv_items_4_0= RULE_STRING ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBrowser.g:683:4: otherlv_3= ',' ( (lv_items_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCheckCheckboxesAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalBrowser.g:687:4: ( (lv_items_4_0= RULE_STRING ) )
            	    // InternalBrowser.g:688:5: (lv_items_4_0= RULE_STRING )
            	    {
            	    // InternalBrowser.g:688:5: (lv_items_4_0= RULE_STRING )
            	    // InternalBrowser.g:689:6: lv_items_4_0= RULE_STRING
            	    {
            	    lv_items_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    						newLeafNode(lv_items_4_0, grammarAccess.getCheckCheckboxesAccess().getItemsSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCheckCheckboxesRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"items",
            	    							lv_items_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCheckCheckboxesAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCheckCheckboxes"


    // $ANTLR start "entryRuleSaveLink"
    // InternalBrowser.g:714:1: entryRuleSaveLink returns [EObject current=null] : iv_ruleSaveLink= ruleSaveLink EOF ;
    public final EObject entryRuleSaveLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSaveLink = null;


        try {
            // InternalBrowser.g:714:49: (iv_ruleSaveLink= ruleSaveLink EOF )
            // InternalBrowser.g:715:2: iv_ruleSaveLink= ruleSaveLink EOF
            {
             newCompositeNode(grammarAccess.getSaveLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSaveLink=ruleSaveLink();

            state._fsp--;

             current =iv_ruleSaveLink; 
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
    // $ANTLR end "entryRuleSaveLink"


    // $ANTLR start "ruleSaveLink"
    // InternalBrowser.g:721:1: ruleSaveLink returns [EObject current=null] : (otherlv_0= 'SAVE_LINK' ( (lv_index_1_0= RULE_INT ) ) otherlv_2= 'INTO' ( (lv_container_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSaveLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_index_1_0=null;
        Token otherlv_2=null;
        Token lv_container_3_0=null;


        	enterRule();

        try {
            // InternalBrowser.g:727:2: ( (otherlv_0= 'SAVE_LINK' ( (lv_index_1_0= RULE_INT ) ) otherlv_2= 'INTO' ( (lv_container_3_0= RULE_STRING ) ) ) )
            // InternalBrowser.g:728:2: (otherlv_0= 'SAVE_LINK' ( (lv_index_1_0= RULE_INT ) ) otherlv_2= 'INTO' ( (lv_container_3_0= RULE_STRING ) ) )
            {
            // InternalBrowser.g:728:2: (otherlv_0= 'SAVE_LINK' ( (lv_index_1_0= RULE_INT ) ) otherlv_2= 'INTO' ( (lv_container_3_0= RULE_STRING ) ) )
            // InternalBrowser.g:729:3: otherlv_0= 'SAVE_LINK' ( (lv_index_1_0= RULE_INT ) ) otherlv_2= 'INTO' ( (lv_container_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSaveLinkAccess().getSAVE_LINKKeyword_0());
            		
            // InternalBrowser.g:733:3: ( (lv_index_1_0= RULE_INT ) )
            // InternalBrowser.g:734:4: (lv_index_1_0= RULE_INT )
            {
            // InternalBrowser.g:734:4: (lv_index_1_0= RULE_INT )
            // InternalBrowser.g:735:5: lv_index_1_0= RULE_INT
            {
            lv_index_1_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_index_1_0, grammarAccess.getSaveLinkAccess().getIndexINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSaveLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"index",
            						lv_index_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSaveLinkAccess().getINTOKeyword_2());
            		
            // InternalBrowser.g:755:3: ( (lv_container_3_0= RULE_STRING ) )
            // InternalBrowser.g:756:4: (lv_container_3_0= RULE_STRING )
            {
            // InternalBrowser.g:756:4: (lv_container_3_0= RULE_STRING )
            // InternalBrowser.g:757:5: lv_container_3_0= RULE_STRING
            {
            lv_container_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_container_3_0, grammarAccess.getSaveLinkAccess().getContainerSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSaveLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"container",
            						lv_container_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleSaveLink"


    // $ANTLR start "entryRuleTextPart"
    // InternalBrowser.g:777:1: entryRuleTextPart returns [EObject current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final EObject entryRuleTextPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextPart = null;


        try {
            // InternalBrowser.g:777:49: (iv_ruleTextPart= ruleTextPart EOF )
            // InternalBrowser.g:778:2: iv_ruleTextPart= ruleTextPart EOF
            {
             newCompositeNode(grammarAccess.getTextPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextPart=ruleTextPart();

            state._fsp--;

             current =iv_ruleTextPart; 
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
    // $ANTLR end "entryRuleTextPart"


    // $ANTLR start "ruleTextPart"
    // InternalBrowser.g:784:1: ruleTextPart returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_VariableReference_1= ruleVariableReference ) ;
    public final EObject ruleTextPart() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_VariableReference_1 = null;



        	enterRule();

        try {
            // InternalBrowser.g:790:2: ( (this_StringLiteral_0= ruleStringLiteral | this_VariableReference_1= ruleVariableReference ) )
            // InternalBrowser.g:791:2: (this_StringLiteral_0= ruleStringLiteral | this_VariableReference_1= ruleVariableReference )
            {
            // InternalBrowser.g:791:2: (this_StringLiteral_0= ruleStringLiteral | this_VariableReference_1= ruleVariableReference )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBrowser.g:792:3: this_StringLiteral_0= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getTextPartAccess().getStringLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowser.g:801:3: this_VariableReference_1= ruleVariableReference
                    {

                    			newCompositeNode(grammarAccess.getTextPartAccess().getVariableReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableReference_1=ruleVariableReference();

                    state._fsp--;


                    			current = this_VariableReference_1;
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
    // $ANTLR end "ruleTextPart"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalBrowser.g:813:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalBrowser.g:813:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalBrowser.g:814:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalBrowser.g:820:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBrowser.g:826:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalBrowser.g:827:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalBrowser.g:827:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalBrowser.g:828:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalBrowser.g:828:3: (lv_value_0_0= RULE_STRING )
            // InternalBrowser.g:829:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleVariableReference"
    // InternalBrowser.g:848:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // InternalBrowser.g:848:58: (iv_ruleVariableReference= ruleVariableReference EOF )
            // InternalBrowser.g:849:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
             newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;

             current =iv_ruleVariableReference; 
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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalBrowser.g:855:1: ruleVariableReference returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowser.g:861:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBrowser.g:862:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBrowser.g:862:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBrowser.g:863:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBrowser.g:863:3: (lv_name_0_0= RULE_ID )
            // InternalBrowser.g:864:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableReferenceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableReferenceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleVariableReference"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000027D7802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});

}