/*
 * generated by Xtext 2.36.0
 */
package fr.imt.bertin.dala.project.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class BrowserGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.bertin.dala.project.Browser.Model");
		private final Assignment cStatementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStatementsStatementParserRuleCall_0 = (RuleCall)cStatementsAssignment.eContents().get(0);
		
		//Model:
		//    statements+=Statement*;
		@Override public ParserRule getRule() { return rule; }
		
		//statements+=Statement*
		public Assignment getStatementsAssignment() { return cStatementsAssignment; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_0() { return cStatementsStatementParserRuleCall_0; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.bertin.dala.project.Browser.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cOpenUrlParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cClickLinkParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cClickImageParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cVerifyLinkParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cFillTextParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cClickButtonParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cVerifyTextParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cSelectOptionParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cUncheckAllCheckboxesParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cCheckCheckboxesParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cSaveLinkParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		
		//Statement:
		//    OpenUrl
		//    | ClickLink
		//    | ClickImage
		//    | VerifyLink
		//    | FillText
		//    | ClickButton
		//    | VerifyText
		//    | SelectOption
		//    | UncheckAllCheckboxes
		//    | CheckCheckboxes
		//    | SaveLink;
		@Override public ParserRule getRule() { return rule; }
		
		//OpenUrl
		//| ClickLink
		//| ClickImage
		//| VerifyLink
		//| FillText
		//| ClickButton
		//| VerifyText
		//| SelectOption
		//| UncheckAllCheckboxes
		//| CheckCheckboxes
		//| SaveLink
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//OpenUrl
		public RuleCall getOpenUrlParserRuleCall_0() { return cOpenUrlParserRuleCall_0; }
		
		//ClickLink
		public RuleCall getClickLinkParserRuleCall_1() { return cClickLinkParserRuleCall_1; }
		
		//ClickImage
		public RuleCall getClickImageParserRuleCall_2() { return cClickImageParserRuleCall_2; }
		
		//VerifyLink
		public RuleCall getVerifyLinkParserRuleCall_3() { return cVerifyLinkParserRuleCall_3; }
		
		//FillText
		public RuleCall getFillTextParserRuleCall_4() { return cFillTextParserRuleCall_4; }
		
		//ClickButton
		public RuleCall getClickButtonParserRuleCall_5() { return cClickButtonParserRuleCall_5; }
		
		//VerifyText
		public RuleCall getVerifyTextParserRuleCall_6() { return cVerifyTextParserRuleCall_6; }
		
		//SelectOption
		public RuleCall getSelectOptionParserRuleCall_7() { return cSelectOptionParserRuleCall_7; }
		
		//UncheckAllCheckboxes
		public RuleCall getUncheckAllCheckboxesParserRuleCall_8() { return cUncheckAllCheckboxesParserRuleCall_8; }
		
		//CheckCheckboxes
		public RuleCall getCheckCheckboxesParserRuleCall_9() { return cCheckCheckboxesParserRuleCall_9; }
		
		//SaveLink
		public RuleCall getSaveLinkParserRuleCall_10() { return cSaveLinkParserRuleCall_10; }
	}
	public class OpenUrlElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.bertin.dala.project.Browser.OpenUrl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOPEN_URLKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cUrlAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cUrlSTRINGTerminalRuleCall_1_0 = (RuleCall)cUrlAssignment_1.eContents().get(0);
		
		//OpenUrl:
		//    'OPEN_URL' url=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'OPEN_URL' url=STRING
		public Group getGroup() { return cGroup; }
		
		//'OPEN_URL'
		public Keyword getOPEN_URLKeyword_0() { return cOPEN_URLKeyword_0; }
		
		//url=STRING
		public Assignment getUrlAssignment_1() { return cUrlAssignment_1; }
		
		//STRING
		public RuleCall getUrlSTRINGTerminalRuleCall_1_0() { return cUrlSTRINGTerminalRuleCall_1_0; }
	}
	public class ClickLinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.bertin.dala.project.Browser.ClickLink");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCLICK_LINKKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cLinkTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLinkTextSTRINGTerminalRuleCall_1_0 = (RuleCall)cLinkTextAssignment_1.eContents().get(0);
		
		//ClickLink:
		//    'CLICK_LINK' linkText=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'CLICK_LINK' linkText=STRING
		public Group getGroup() { return cGroup; }
		
		//'CLICK_LINK'
		public Keyword getCLICK_LINKKeyword_0() { return cCLICK_LINKKeyword_0; }
		
		//linkText=STRING
		public Assignment getLinkTextAssignment_1() { return cLinkTextAssignment_1; }
		
		//STRING
		public RuleCall getLinkTextSTRINGTerminalRuleCall_1_0() { return cLinkTextSTRINGTerminalRuleCall_1_0; }
	}
	public class ClickImageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.bertin.dala.project.Browser.ClickImage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCLICK_IMAGEKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAltTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAltTextSTRINGTerminalRuleCall_1_0 = (RuleCall)cAltTextAssignment_1.eContents().get(0);
		
		//ClickImage:
		//    'CLICK_IMAGE' altText=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'CLICK_IMAGE' altText=STRING
		public Group getGroup() { return cGroup; }
		
		//'CLICK_IMAGE'
		public Keyword getCLICK_IMAGEKeyword_0() { return cCLICK_IMAGEKeyword_0; }
		
		//altText=STRING
		public Assignment getAltTextAssignment_1() { return cAltTextAssignment_1; }
		
		//STRING
		public RuleCall getAltTextSTRINGTerminalRuleCall_1_0() { return cAltTextSTRINGTerminalRuleCall_1_0; }
	}
	public class VerifyLinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.bertin.dala.project.Browser.VerifyLink");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVERIFY_LINKKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTextsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextsTextPartParserRuleCall_1_0 = (RuleCall)cTextsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTextsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTextsTextPartParserRuleCall_2_1_0 = (RuleCall)cTextsAssignment_2_1.eContents().get(0);
		
		//VerifyLink:
		//    'VERIFY_LINK' texts+=TextPart (',' texts+=TextPart)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'VERIFY_LINK' texts+=TextPart (',' texts+=TextPart)*
		public Group getGroup() { return cGroup; }
		
		//'VERIFY_LINK'
		public Keyword getVERIFY_LINKKeyword_0() { return cVERIFY_LINKKeyword_0; }
		
		//texts+=TextPart
		public Assignment getTextsAssignment_1() { return cTextsAssignment_1; }
		
		//TextPart
		public RuleCall getTextsTextPartParserRuleCall_1_0() { return cTextsTextPartParserRuleCall_1_0; }
		
		//(',' texts+=TextPart)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//texts+=TextPart
		public Assignment getTextsAssignment_2_1() { return cTextsAssignment_2_1; }
		
		//TextPart
		public RuleCall getTextsTextPartParserRuleCall_2_1_0() { return cTextsTextPartParserRuleCall_2_1_0; }
	}
	public class FillTextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.bertin.dala.project.Browser.FillText");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFILL_TEXTKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextTextPartParserRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		private final Keyword cINTOKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFieldAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFieldSTRINGTerminalRuleCall_3_0 = (RuleCall)cFieldAssignment_3.eContents().get(0);
		
		//FillText:
		//    'FILL_TEXT' text=TextPart 'INTO' field=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'FILL_TEXT' text=TextPart 'INTO' field=STRING
		public Group getGroup() { return cGroup; }
		
		//'FILL_TEXT'
		public Keyword getFILL_TEXTKeyword_0() { return cFILL_TEXTKeyword_0; }
		
		//text=TextPart
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }
		
		//TextPart
		public RuleCall getTextTextPartParserRuleCall_1_0() { return cTextTextPartParserRuleCall_1_0; }
		
		//'INTO'
		public Keyword getINTOKeyword_2() { return cINTOKeyword_2; }
		
		//field=STRING
		public Assignment getFieldAssignment_3() { return cFieldAssignment_3; }
		
		//STRING
		public RuleCall getFieldSTRINGTerminalRuleCall_3_0() { return cFieldSTRINGTerminalRuleCall_3_0; }
	}
	public class ClickButtonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.bertin.dala.project.Browser.ClickButton");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCLICK_BUTTONKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cButtonTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cButtonTextSTRINGTerminalRuleCall_1_0 = (RuleCall)cButtonTextAssignment_1.eContents().get(0);
		
		//ClickButton:
		//    'CLICK_BUTTON' buttonText=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'CLICK_BUTTON' buttonText=STRING
		public Group getGroup() { return cGroup; }
		
		//'CLICK_BUTTON'
		public Keyword getCLICK_BUTTONKeyword_0() { return cCLICK_BUTTONKeyword_0; }
		
		//buttonText=STRING
		public Assignment getButtonTextAssignment_1() { return cButtonTextAssignment_1; }
		
		//STRING
		public RuleCall getButtonTextSTRINGTerminalRuleCall_1_0() { return cButtonTextSTRINGTerminalRuleCall_1_0; }
	}
	public class VerifyTextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.bertin.dala.project.Browser.VerifyText");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVERIFY_TEXTKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTextsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextsTextPartParserRuleCall_1_0 = (RuleCall)cTextsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTextsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTextsTextPartParserRuleCall_2_1_0 = (RuleCall)cTextsAssignment_2_1.eContents().get(0);
		
		//VerifyText:
		//    'VERIFY_TEXT' texts+=TextPart (',' texts+=TextPart)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'VERIFY_TEXT' texts+=TextPart (',' texts+=TextPart)*
		public Group getGroup() { return cGroup; }
		
		//'VERIFY_TEXT'
		public Keyword getVERIFY_TEXTKeyword_0() { return cVERIFY_TEXTKeyword_0; }
		
		//texts+=TextPart
		public Assignment getTextsAssignment_1() { return cTextsAssignment_1; }
		
		//TextPart
		public RuleCall getTextsTextPartParserRuleCall_1_0() { return cTextsTextPartParserRuleCall_1_0; }
		
		//(',' texts+=TextPart)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//texts+=TextPart
		public Assignment getTextsAssignment_2_1() { return cTextsAssignment_2_1; }
		
		//TextPart
		public RuleCall getTextsTextPartParserRuleCall_2_1_0() { return cTextsTextPartParserRuleCall_2_1_0; }
	}
	public class SelectOptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.bertin.dala.project.Browser.SelectOption");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSELECT_OPTIONKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cLinkTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLinkTextSTRINGTerminalRuleCall_1_0 = (RuleCall)cLinkTextAssignment_1.eContents().get(0);
		
		//SelectOption:
		//    'SELECT_OPTION' linkText=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'SELECT_OPTION' linkText=STRING
		public Group getGroup() { return cGroup; }
		
		//'SELECT_OPTION'
		public Keyword getSELECT_OPTIONKeyword_0() { return cSELECT_OPTIONKeyword_0; }
		
		//linkText=STRING
		public Assignment getLinkTextAssignment_1() { return cLinkTextAssignment_1; }
		
		//STRING
		public RuleCall getLinkTextSTRINGTerminalRuleCall_1_0() { return cLinkTextSTRINGTerminalRuleCall_1_0; }
	}
	public class UncheckAllCheckboxesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.bertin.dala.project.Browser.UncheckAllCheckboxes");
		private final Keyword cUNCHECK_ALL_CHECKBOXESKeyword = (Keyword)rule.eContents().get(1);
		
		//UncheckAllCheckboxes:
		//    'UNCHECK_ALL_CHECKBOXES';
		@Override public ParserRule getRule() { return rule; }
		
		//'UNCHECK_ALL_CHECKBOXES'
		public Keyword getUNCHECK_ALL_CHECKBOXESKeyword() { return cUNCHECK_ALL_CHECKBOXESKeyword; }
	}
	public class CheckCheckboxesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.bertin.dala.project.Browser.CheckCheckboxes");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCHECK_CHECKBOXESKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cItemsSTRINGTerminalRuleCall_2_0 = (RuleCall)cItemsAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cItemsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cItemsSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cItemsAssignment_3_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//CheckCheckboxes:
		//    'CHECK_CHECKBOXES' '[' items+=STRING (',' items+=STRING)* ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'CHECK_CHECKBOXES' '[' items+=STRING (',' items+=STRING)* ']'
		public Group getGroup() { return cGroup; }
		
		//'CHECK_CHECKBOXES'
		public Keyword getCHECK_CHECKBOXESKeyword_0() { return cCHECK_CHECKBOXESKeyword_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//items+=STRING
		public Assignment getItemsAssignment_2() { return cItemsAssignment_2; }
		
		//STRING
		public RuleCall getItemsSTRINGTerminalRuleCall_2_0() { return cItemsSTRINGTerminalRuleCall_2_0; }
		
		//(',' items+=STRING)*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//items+=STRING
		public Assignment getItemsAssignment_3_1() { return cItemsAssignment_3_1; }
		
		//STRING
		public RuleCall getItemsSTRINGTerminalRuleCall_3_1_0() { return cItemsSTRINGTerminalRuleCall_3_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
	}
	public class SaveLinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.bertin.dala.project.Browser.SaveLink");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSAVE_LINKKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIndexAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIndexINTTerminalRuleCall_1_0 = (RuleCall)cIndexAssignment_1.eContents().get(0);
		private final Keyword cINTOKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cContainerAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cContainerSTRINGTerminalRuleCall_3_0 = (RuleCall)cContainerAssignment_3.eContents().get(0);
		
		//SaveLink:
		//    'SAVE_LINK' index=INT 'INTO' container=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'SAVE_LINK' index=INT 'INTO' container=STRING
		public Group getGroup() { return cGroup; }
		
		//'SAVE_LINK'
		public Keyword getSAVE_LINKKeyword_0() { return cSAVE_LINKKeyword_0; }
		
		//index=INT
		public Assignment getIndexAssignment_1() { return cIndexAssignment_1; }
		
		//INT
		public RuleCall getIndexINTTerminalRuleCall_1_0() { return cIndexINTTerminalRuleCall_1_0; }
		
		//'INTO'
		public Keyword getINTOKeyword_2() { return cINTOKeyword_2; }
		
		//container=STRING
		public Assignment getContainerAssignment_3() { return cContainerAssignment_3; }
		
		//STRING
		public RuleCall getContainerSTRINGTerminalRuleCall_3_0() { return cContainerSTRINGTerminalRuleCall_3_0; }
	}
	public class TextPartElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.bertin.dala.project.Browser.TextPart");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cStringLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cVariableReferenceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TextPart:
		//    StringLiteral | VariableReference;
		@Override public ParserRule getRule() { return rule; }
		
		//StringLiteral | VariableReference
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//StringLiteral
		public RuleCall getStringLiteralParserRuleCall_0() { return cStringLiteralParserRuleCall_0; }
		
		//VariableReference
		public RuleCall getVariableReferenceParserRuleCall_1() { return cVariableReferenceParserRuleCall_1; }
	}
	public class StringLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.bertin.dala.project.Browser.StringLiteral");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//StringLiteral:
		//    value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//value=STRING
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0() { return cValueSTRINGTerminalRuleCall_0; }
	}
	public class VariableReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.imt.bertin.dala.project.Browser.VariableReference");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//VariableReference:
		//    name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	
	
	private final ModelElements pModel;
	private final StatementElements pStatement;
	private final OpenUrlElements pOpenUrl;
	private final ClickLinkElements pClickLink;
	private final ClickImageElements pClickImage;
	private final VerifyLinkElements pVerifyLink;
	private final FillTextElements pFillText;
	private final ClickButtonElements pClickButton;
	private final VerifyTextElements pVerifyText;
	private final SelectOptionElements pSelectOption;
	private final UncheckAllCheckboxesElements pUncheckAllCheckboxes;
	private final CheckCheckboxesElements pCheckCheckboxes;
	private final SaveLinkElements pSaveLink;
	private final TextPartElements pTextPart;
	private final StringLiteralElements pStringLiteral;
	private final VariableReferenceElements pVariableReference;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BrowserGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pStatement = new StatementElements();
		this.pOpenUrl = new OpenUrlElements();
		this.pClickLink = new ClickLinkElements();
		this.pClickImage = new ClickImageElements();
		this.pVerifyLink = new VerifyLinkElements();
		this.pFillText = new FillTextElements();
		this.pClickButton = new ClickButtonElements();
		this.pVerifyText = new VerifyTextElements();
		this.pSelectOption = new SelectOptionElements();
		this.pUncheckAllCheckboxes = new UncheckAllCheckboxesElements();
		this.pCheckCheckboxes = new CheckCheckboxesElements();
		this.pSaveLink = new SaveLinkElements();
		this.pTextPart = new TextPartElements();
		this.pStringLiteral = new StringLiteralElements();
		this.pVariableReference = new VariableReferenceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.imt.bertin.dala.project.Browser".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    statements+=Statement*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Statement:
	//    OpenUrl
	//    | ClickLink
	//    | ClickImage
	//    | VerifyLink
	//    | FillText
	//    | ClickButton
	//    | VerifyText
	//    | SelectOption
	//    | UncheckAllCheckboxes
	//    | CheckCheckboxes
	//    | SaveLink;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//OpenUrl:
	//    'OPEN_URL' url=STRING;
	public OpenUrlElements getOpenUrlAccess() {
		return pOpenUrl;
	}
	
	public ParserRule getOpenUrlRule() {
		return getOpenUrlAccess().getRule();
	}
	
	//ClickLink:
	//    'CLICK_LINK' linkText=STRING;
	public ClickLinkElements getClickLinkAccess() {
		return pClickLink;
	}
	
	public ParserRule getClickLinkRule() {
		return getClickLinkAccess().getRule();
	}
	
	//ClickImage:
	//    'CLICK_IMAGE' altText=STRING;
	public ClickImageElements getClickImageAccess() {
		return pClickImage;
	}
	
	public ParserRule getClickImageRule() {
		return getClickImageAccess().getRule();
	}
	
	//VerifyLink:
	//    'VERIFY_LINK' texts+=TextPart (',' texts+=TextPart)*;
	public VerifyLinkElements getVerifyLinkAccess() {
		return pVerifyLink;
	}
	
	public ParserRule getVerifyLinkRule() {
		return getVerifyLinkAccess().getRule();
	}
	
	//FillText:
	//    'FILL_TEXT' text=TextPart 'INTO' field=STRING;
	public FillTextElements getFillTextAccess() {
		return pFillText;
	}
	
	public ParserRule getFillTextRule() {
		return getFillTextAccess().getRule();
	}
	
	//ClickButton:
	//    'CLICK_BUTTON' buttonText=STRING;
	public ClickButtonElements getClickButtonAccess() {
		return pClickButton;
	}
	
	public ParserRule getClickButtonRule() {
		return getClickButtonAccess().getRule();
	}
	
	//VerifyText:
	//    'VERIFY_TEXT' texts+=TextPart (',' texts+=TextPart)*;
	public VerifyTextElements getVerifyTextAccess() {
		return pVerifyText;
	}
	
	public ParserRule getVerifyTextRule() {
		return getVerifyTextAccess().getRule();
	}
	
	//SelectOption:
	//    'SELECT_OPTION' linkText=STRING;
	public SelectOptionElements getSelectOptionAccess() {
		return pSelectOption;
	}
	
	public ParserRule getSelectOptionRule() {
		return getSelectOptionAccess().getRule();
	}
	
	//UncheckAllCheckboxes:
	//    'UNCHECK_ALL_CHECKBOXES';
	public UncheckAllCheckboxesElements getUncheckAllCheckboxesAccess() {
		return pUncheckAllCheckboxes;
	}
	
	public ParserRule getUncheckAllCheckboxesRule() {
		return getUncheckAllCheckboxesAccess().getRule();
	}
	
	//CheckCheckboxes:
	//    'CHECK_CHECKBOXES' '[' items+=STRING (',' items+=STRING)* ']';
	public CheckCheckboxesElements getCheckCheckboxesAccess() {
		return pCheckCheckboxes;
	}
	
	public ParserRule getCheckCheckboxesRule() {
		return getCheckCheckboxesAccess().getRule();
	}
	
	//SaveLink:
	//    'SAVE_LINK' index=INT 'INTO' container=STRING;
	public SaveLinkElements getSaveLinkAccess() {
		return pSaveLink;
	}
	
	public ParserRule getSaveLinkRule() {
		return getSaveLinkAccess().getRule();
	}
	
	//TextPart:
	//    StringLiteral | VariableReference;
	public TextPartElements getTextPartAccess() {
		return pTextPart;
	}
	
	public ParserRule getTextPartRule() {
		return getTextPartAccess().getRule();
	}
	
	//StringLiteral:
	//    value=STRING;
	public StringLiteralElements getStringLiteralAccess() {
		return pStringLiteral;
	}
	
	public ParserRule getStringLiteralRule() {
		return getStringLiteralAccess().getRule();
	}
	
	//VariableReference:
	//    name=ID;
	public VariableReferenceElements getVariableReferenceAccess() {
		return pVariableReference;
	}
	
	public ParserRule getVariableReferenceRule() {
		return getVariableReferenceAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
