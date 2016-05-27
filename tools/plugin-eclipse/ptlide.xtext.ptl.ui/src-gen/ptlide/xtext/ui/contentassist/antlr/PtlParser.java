/*
* generated by Xtext
*/
package ptlide.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import ptlide.xtext.services.PtlGrammarAccess;

public class PtlParser extends AbstractContentAssistParser {
	
	@Inject
	private PtlGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected ptlide.xtext.ui.contentassist.antlr.internal.InternalPtlParser createParser() {
		ptlide.xtext.ui.contentassist.antlr.internal.InternalPtlParser result = new ptlide.xtext.ui.contentassist.antlr.internal.InternalPtlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTransitionTypeAccess().getAlternatives(), "rule__TransitionType__Alternatives");
					put(grammarAccess.getTriggerAccess().getAlternatives_1(), "rule__Trigger__Alternatives_1");
					put(grammarAccess.getOccurrenceAccess().getAlternatives_5(), "rule__Occurrence__Alternatives_5");
					put(grammarAccess.getDutyTypeAccess().getAlternatives_1(), "rule__DutyType__Alternatives_1");
					put(grammarAccess.getStateTypeAccess().getAlternatives_1(), "rule__StateType__Alternatives_1");
					put(grammarAccess.getParticipantDescriptionAccess().getAlternatives_0(), "rule__ParticipantDescription__Alternatives_0");
					put(grammarAccess.getParticipantCardinalityAccess().getAlternatives(), "rule__ParticipantCardinality__Alternatives");
					put(grammarAccess.getParticipantCardinalityMaxAccess().getAlternatives_1(), "rule__ParticipantCardinalityMax__Alternatives_1");
					put(grammarAccess.getProtocolAccess().getGroup(), "rule__Protocol__Group__0");
					put(grammarAccess.getTransitionsAccess().getGroup(), "rule__Transitions__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getTimeoutAccess().getGroup(), "rule__Timeout__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getMappingAccess().getGroup(), "rule__Mapping__Group__0");
					put(grammarAccess.getMapFromToAccess().getGroup(), "rule__MapFromTo__Group__0");
					put(grammarAccess.getTriggerAccess().getGroup(), "rule__Trigger__Group__0");
					put(grammarAccess.getTriggerAccess().getGroup_1_0(), "rule__Trigger__Group_1_0__0");
					put(grammarAccess.getPatternAccess().getGroup(), "rule__Pattern__Group__0");
					put(grammarAccess.getContentAccess().getGroup(), "rule__Content__Group__0");
					put(grammarAccess.getOccurrenceAccess().getGroup(), "rule__Occurrence__Group__0");
					put(grammarAccess.getDutyAccess().getGroup(), "rule__Duty__Group__0");
					put(grammarAccess.getDutyTypeAccess().getGroup(), "rule__DutyType__Group__0");
					put(grammarAccess.getDutyTypeAccess().getGroup_1_2(), "rule__DutyType__Group_1_2__0");
					put(grammarAccess.getParticipantOccurrenceAccess().getGroup(), "rule__ParticipantOccurrence__Group__0");
					put(grammarAccess.getParticipantOccurrenceAccess().getGroup_1(), "rule__ParticipantOccurrence__Group_1__0");
					put(grammarAccess.getStatesAccess().getGroup(), "rule__States__Group__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getStateTypeAccess().getGroup(), "rule__StateType__Group__0");
					put(grammarAccess.getParticipantsAccess().getGroup(), "rule__Participants__Group__0");
					put(grammarAccess.getParticipantAccess().getGroup(), "rule__Participant__Group__0");
					put(grammarAccess.getParticipantDescriptionAccess().getGroup(), "rule__ParticipantDescription__Group__0");
					put(grammarAccess.getParticipantDescriptionAccess().getGroup_0_0(), "rule__ParticipantDescription__Group_0_0__0");
					put(grammarAccess.getParticipantDescriptionAccess().getGroup_0_1(), "rule__ParticipantDescription__Group_0_1__0");
					put(grammarAccess.getParticipantCardinalityAccess().getGroup_0(), "rule__ParticipantCardinality__Group_0__0");
					put(grammarAccess.getParticipantCardinalityMinMaxAccess().getGroup(), "rule__ParticipantCardinalityMinMax__Group__0");
					put(grammarAccess.getParticipantCardinalityMinAccess().getGroup(), "rule__ParticipantCardinalityMin__Group__0");
					put(grammarAccess.getParticipantCardinalityMaxAccess().getGroup(), "rule__ParticipantCardinalityMax__Group__0");
					put(grammarAccess.getDescriptionAccess().getGroup(), "rule__Description__Group__0");
					put(grammarAccess.getDescriptionAccess().getGroup_1(), "rule__Description__Group_1__0");
					put(grammarAccess.getGoalsAccess().getGroup(), "rule__Goals__Group__0");
					put(grammarAccess.getGoalAccess().getGroup(), "rule__Goal__Group__0");
					put(grammarAccess.getProtocolAccess().getNameAssignment_1(), "rule__Protocol__NameAssignment_1");
					put(grammarAccess.getProtocolAccess().getDescriptionAssignment_3(), "rule__Protocol__DescriptionAssignment_3");
					put(grammarAccess.getProtocolAccess().getGoalsAssignment_4(), "rule__Protocol__GoalsAssignment_4");
					put(grammarAccess.getProtocolAccess().getParticipantsAssignment_5(), "rule__Protocol__ParticipantsAssignment_5");
					put(grammarAccess.getProtocolAccess().getStatesAssignment_6(), "rule__Protocol__StatesAssignment_6");
					put(grammarAccess.getProtocolAccess().getTransitionsAssignment_7(), "rule__Protocol__TransitionsAssignment_7");
					put(grammarAccess.getTransitionsAccess().getNameAssignment_0(), "rule__Transitions__NameAssignment_0");
					put(grammarAccess.getTransitionsAccess().getTransitionsAssignment_2(), "rule__Transitions__TransitionsAssignment_2");
					put(grammarAccess.getTransitionAccess().getSourceStateAssignment_0(), "rule__Transition__SourceStateAssignment_0");
					put(grammarAccess.getTransitionAccess().getDestinationStateAssignment_2(), "rule__Transition__DestinationStateAssignment_2");
					put(grammarAccess.getTransitionAccess().getTypeAssignment_4(), "rule__Transition__TypeAssignment_4");
					put(grammarAccess.getTransitionTypeAccess().getTypeAssignment_0(), "rule__TransitionType__TypeAssignment_0");
					put(grammarAccess.getTransitionTypeAccess().getTypeAssignment_1(), "rule__TransitionType__TypeAssignment_1");
					put(grammarAccess.getTransitionTypeAccess().getTypeAssignment_2(), "rule__TransitionType__TypeAssignment_2");
					put(grammarAccess.getTimeoutAccess().getNameAssignment_0(), "rule__Timeout__NameAssignment_0");
					put(grammarAccess.getTimeoutAccess().getTimeoutAssignment_1(), "rule__Timeout__TimeoutAssignment_1");
					put(grammarAccess.getImportAccess().getNameAssignment_0(), "rule__Import__NameAssignment_0");
					put(grammarAccess.getImportAccess().getFileAssignment_1(), "rule__Import__FileAssignment_1");
					put(grammarAccess.getImportAccess().getMappingAssignment_2(), "rule__Import__MappingAssignment_2");
					put(grammarAccess.getMappingAccess().getNameAssignment_0(), "rule__Mapping__NameAssignment_0");
					put(grammarAccess.getMappingAccess().getMapsAssignment_2(), "rule__Mapping__MapsAssignment_2");
					put(grammarAccess.getMapFromToAccess().getFromAssignment_0(), "rule__MapFromTo__FromAssignment_0");
					put(grammarAccess.getMapFromToAccess().getToAssignment_1(), "rule__MapFromTo__ToAssignment_1");
					put(grammarAccess.getTriggerAccess().getPatternAssignment_1_0_0(), "rule__Trigger__PatternAssignment_1_0_0");
					put(grammarAccess.getTriggerAccess().getContentAssignment_1_0_1(), "rule__Trigger__ContentAssignment_1_0_1");
					put(grammarAccess.getTriggerAccess().getContentAssignment_1_1(), "rule__Trigger__ContentAssignment_1_1");
					put(grammarAccess.getPatternAccess().getNameAssignment_0(), "rule__Pattern__NameAssignment_0");
					put(grammarAccess.getPatternAccess().getPatternAssignment_1(), "rule__Pattern__PatternAssignment_1");
					put(grammarAccess.getContentAccess().getContentAssignment_1(), "rule__Content__ContentAssignment_1");
					put(grammarAccess.getOccurrenceAccess().getParticipantSourceAssignment_0(), "rule__Occurrence__ParticipantSourceAssignment_0");
					put(grammarAccess.getOccurrenceAccess().getDutyAssignment_2(), "rule__Occurrence__DutyAssignment_2");
					put(grammarAccess.getOccurrenceAccess().getParticipantDestinationAssignment_4(), "rule__Occurrence__ParticipantDestinationAssignment_4");
					put(grammarAccess.getOccurrenceAccess().getTriggerAssignment_5_0(), "rule__Occurrence__TriggerAssignment_5_0");
					put(grammarAccess.getDutyAccess().getDutytypeAssignment_0(), "rule__Duty__DutytypeAssignment_0");
					put(grammarAccess.getDutyAccess().getDutyAssignment_1(), "rule__Duty__DutyAssignment_1");
					put(grammarAccess.getDutyTypeAccess().getNameAssignment_1_0(), "rule__DutyType__NameAssignment_1_0");
					put(grammarAccess.getDutyTypeAccess().getNameAssignment_1_1(), "rule__DutyType__NameAssignment_1_1");
					put(grammarAccess.getDutyTypeAccess().getNameAssignment_1_2_0(), "rule__DutyType__NameAssignment_1_2_0");
					put(grammarAccess.getDutyTypeAccess().getPerformativeAssignment_1_2_2(), "rule__DutyType__PerformativeAssignment_1_2_2");
					put(grammarAccess.getParticipantOccurrenceAccess().getParticipantSourceAssignment_0(), "rule__ParticipantOccurrence__ParticipantSourceAssignment_0");
					put(grammarAccess.getParticipantOccurrenceAccess().getCardinalityAssignment_1_1(), "rule__ParticipantOccurrence__CardinalityAssignment_1_1");
					put(grammarAccess.getStatesAccess().getNameAssignment_0(), "rule__States__NameAssignment_0");
					put(grammarAccess.getStatesAccess().getStatesAssignment_2(), "rule__States__StatesAssignment_2");
					put(grammarAccess.getStateAccess().getIdAssignment_0(), "rule__State__IdAssignment_0");
					put(grammarAccess.getStateAccess().getTypeAssignment_1(), "rule__State__TypeAssignment_1");
					put(grammarAccess.getStateIdAccess().getNameAssignment(), "rule__StateId__NameAssignment");
					put(grammarAccess.getStateTypeAccess().getInitialAssignment_1_0(), "rule__StateType__InitialAssignment_1_0");
					put(grammarAccess.getStateTypeAccess().getFinalAssignment_1_1(), "rule__StateType__FinalAssignment_1_1");
					put(grammarAccess.getParticipantsAccess().getNameAssignment_0(), "rule__Participants__NameAssignment_0");
					put(grammarAccess.getParticipantsAccess().getParticipantsAssignment_2(), "rule__Participants__ParticipantsAssignment_2");
					put(grammarAccess.getParticipantAccess().getNameAssignment_0(), "rule__Participant__NameAssignment_0");
					put(grammarAccess.getParticipantAccess().getParticipantDescriptionAssignment_1(), "rule__Participant__ParticipantDescriptionAssignment_1");
					put(grammarAccess.getParticipantIdAccess().getNameAssignment(), "rule__ParticipantId__NameAssignment");
					put(grammarAccess.getParticipantDescriptionAccess().getKindAssignment_0_0_0(), "rule__ParticipantDescription__KindAssignment_0_0_0");
					put(grammarAccess.getParticipantDescriptionAccess().getRoleAssignment_0_0_1(), "rule__ParticipantDescription__RoleAssignment_0_0_1");
					put(grammarAccess.getParticipantDescriptionAccess().getKindAssignment_0_1_0(), "rule__ParticipantDescription__KindAssignment_0_1_0");
					put(grammarAccess.getParticipantDescriptionAccess().getTypeAssignment_0_1_1(), "rule__ParticipantDescription__TypeAssignment_0_1_1");
					put(grammarAccess.getParticipantDescriptionAccess().getCardAssignment_1(), "rule__ParticipantDescription__CardAssignment_1");
					put(grammarAccess.getParticipantCardinalityAccess().getCardAllAssignment_0_1(), "rule__ParticipantCardinality__CardAllAssignment_0_1");
					put(grammarAccess.getParticipantCardinalityAccess().getCardMinMaxAssignment_1(), "rule__ParticipantCardinality__CardMinMaxAssignment_1");
					put(grammarAccess.getParticipantCardinalityMinMaxAccess().getMinAssignment_1(), "rule__ParticipantCardinalityMinMax__MinAssignment_1");
					put(grammarAccess.getParticipantCardinalityMinMaxAccess().getMaxAssignment_2(), "rule__ParticipantCardinalityMinMax__MaxAssignment_2");
					put(grammarAccess.getParticipantCardinalityMinAccess().getNameAssignment_0(), "rule__ParticipantCardinalityMin__NameAssignment_0");
					put(grammarAccess.getParticipantCardinalityMinAccess().getMinAssignment_1(), "rule__ParticipantCardinalityMin__MinAssignment_1");
					put(grammarAccess.getParticipantCardinalityMaxAccess().getNameAssignment_0(), "rule__ParticipantCardinalityMax__NameAssignment_0");
					put(grammarAccess.getParticipantCardinalityMaxAccess().getMaxAssignment_1_0(), "rule__ParticipantCardinalityMax__MaxAssignment_1_0");
					put(grammarAccess.getParticipantCardinalityMaxAccess().getMax2Assignment_1_1(), "rule__ParticipantCardinalityMax__Max2Assignment_1_1");
					put(grammarAccess.getParticipantCardinalityAllAccess().getNameAssignment(), "rule__ParticipantCardinalityAll__NameAssignment");
					put(grammarAccess.getTypeAccess().getTypeAssignment(), "rule__Type__TypeAssignment");
					put(grammarAccess.getRoleAccess().getRoleAssignment(), "rule__Role__RoleAssignment");
					put(grammarAccess.getDescriptionAccess().getNameAssignment_1_0(), "rule__Description__NameAssignment_1_0");
					put(grammarAccess.getDescriptionAccess().getDescriptionAssignment_1_2(), "rule__Description__DescriptionAssignment_1_2");
					put(grammarAccess.getGoalsAccess().getNameAssignment_0(), "rule__Goals__NameAssignment_0");
					put(grammarAccess.getGoalsAccess().getGoalsAssignment_2(), "rule__Goals__GoalsAssignment_2");
					put(grammarAccess.getGoalAccess().getGoalAssignment_0(), "rule__Goal__GoalAssignment_0");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			ptlide.xtext.ui.contentassist.antlr.internal.InternalPtlParser typedParser = (ptlide.xtext.ui.contentassist.antlr.internal.InternalPtlParser) parser;
			typedParser.entryRuleProtocol();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT" };
	}
	
	public PtlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PtlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}