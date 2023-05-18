package fr.mrtigreroux.tigerreports.data.config;

import fr.mrtigreroux.tigerreports.utils.MessageUtils;

/**
 * @author MrTigreroux
 */

public enum Message {

	RELOAD("Messages.Reload"),
	REPORT_SENT("Messages.Report-sent"),
	ALERT("Messages.Alert"),
	ALERT_DETAILS("Messages.Alert-details"),
	TELEPORT_CURRENT_LOCATION("Messages.Teleport-to-current-location"),
	TELEPORT_OLD_LOCATION("Messages.Teleport-to-old-location"),
	STAFF_PUNISH("Messages.Staff-punish"),
	PUNISHED("Messages.Punished"),
	STAFF_STOPCOOLDOWN("Messages.Staff-stop-cooldown"),
	COOLDOWN_STOPPED("Messages.Cooldown-stopped"),
	STAFF_PROCESS("Messages.Staff-process"),
	STAFF_PROCESS_AUTO("Messages.Staff-process-auto"),
	STAFF_PROCESS_ABUSIVE("Messages.Staff-process-abusive"),
	STAFF_PROCESS_PUNISH("Messages.Staff-process-punish"),
	STAFF_PROCESS_PUNISH_AUTO("Messages.Staff-process-punish-auto"),
	STAFF_ARCHIVE("Messages.Staff-archive"),
	STAFF_ARCHIVEALL("Messages.Staff-archiveall"),
	STAFF_RESTORE("Messages.Staff-restore"),
	STAFF_DELETE_ARCHIVE("Messages.Staff-delete-archive"),
	STAFF_DELETE("Messages.Staff-delete"),
	STAFF_MAX_REPORTS_REACHED("Messages.Staff-max-reports-reached"),
	STAFF_NOTIFICATIONS("Messages.Staff-notifications"),
	COMMENT_NOTIFICATION("Messages.Comment-notification"),
	REPORT_NOTIFICATION("Messages.Report-notification"),
	REPORTS_NOTIFICATION("Messages.Reports-notification"),
	REPORT_BUTTON("Messages.Report-button"),
	REPORT_CHAT_DETAILS("Messages.Report-chat-details"),
	REPORT_CHAT_DATA("Messages.Report-chat-data"),
	REPORT_MESSAGES_HISTORY("Messages.Report-messages-history"),
	REPORT_MESSAGE_FORMAT("Messages.Report-message-format"),
	EDIT_COMMENT("Messages.Edit-comment"),
	CANCEL_COMMENT("Messages.Cancel-comment"),
	PROCESS_REPORT_PUNISHING_WITH_STAFF_REASON("Messages.Process-report-punishing-with-staff-reason"),
	CANCEL_PROCESS_REPORT_PUNISHING_WITH_STAFF_REASON("Messages.Cancel-process-report-punishing-with-staff-reason"),

	INVALID_SYNTAX_REPORT("ErrorMessages.Invalid-syntax-report"),
	INVALID_SYNTAX_REPORTS("ErrorMessages.Invalid-syntax-reports"),
	PERMISSION_COMMAND("ErrorMessages.Permission-command"),
	PERMISSION_REPORT("ErrorMessages.Permission-report"),
	PERMISSION_ACCESS_DETAILS("ErrorMessages.Permission-access-details"),
	PLAYER_ONLY("ErrorMessages.Player-only"),
	COOLDOWN("ErrorMessages.Cooldown"),
	PLAYER_ALREADY_REPORTED("ErrorMessages.Player-already-reported"),
	REPORT_ONESELF("ErrorMessages.Report-oneself"),
	REPORTED_OFFLINE("ErrorMessages.Reported-offline"),
	TOO_SHORT_REASON("ErrorMessages.Too-short-reason"),
	LOCATION_UNKNOWN("ErrorMessages.Location-unknown"),
	INVALID_REPORT_ID("ErrorMessages.Invalid-report-id"),
	INVALID_REPORT("ErrorMessages.Invalid-report"),
	INVALID_PLAYER("ErrorMessages.Invalid-player"),
	PLAYER_OFFLINE("ErrorMessages.Player-offline"),
	INVALID_TIME("ErrorMessages.Invalid-time"),

	REASON_TITLE("Menus.Reason-title"),
	REASONS("Menus.Reasons"),
	REASON("Menus.Reason"),
	REASON_DETAILS("Menus.Reason-details"),
	REPORT("Menus.Report"),
	REPORT_DETAILS("Menus.Report-details"),
	REPORT_SHOW_ACTION("Menus.Report-show-action"),
	REPORT_ARCHIVE_ACTION("Menus.Report-archive-action"),
	REPORT_DELETE_ACTION("Menus.Report-delete-action"),
	REPORTS_TITLE("Menus.Reports-title"),
	REPORTS("Menus.Reports"),
	REPORTS_DETAILS("Menus.Reports-details"),
	REPORT_TITLE("Menus.Report-title"),
	REPORT_CHAT_ACTION("Menus.Report-chat-action"),
	REPORTER("Menus.Reporter"),
	REPORTED("Menus.Reported"),
	PLAYER_DETAILS("Menus.Player-details"),
	TELEPORT_TO_CURRENT_POSITION("Menus.Teleport-to-current-position"),
	CAN_NOT_TELEPORT_TO_CURRENT_POSITION("Menus.Can-not-teleport-to-current-position"),
	TELEPORT_TO_OLD_POSITION("Menus.Teleport-to-old-position"),
	CAN_NOT_TELEPORT_TO_OLD_POSITION("Menus.Can-not-teleport-to-old-position"),
	PUNISH_ABUSE("Menus.Punish-abuse"),
	PUNISH_ABUSE_DETAILS("Menus.Punish-abuse-details"),
	CHANGE_STATUS("Menus.Change-status"),
	CHANGE_STATUS_DETAILS("Menus.Change-status-details"),
	PROCESS_STATUS("Menus.Process-status"),
	PROCESS_STATUS_DETAILS("Menus.Process-status-details"),
	ARCHIVE("Menus.Archive"),
	ARCHIVE_DETAILS("Menus.Archive-details"),
	DATA("Menus.Data"),
	DATA_DETAILS("Menus.Data-details"),
	DEFAULT_DATA("Menus.Default-data"),
	PLAYER_WAS_OFFLINE("Menus.Player-was-offline"),
	EFFECT("Menus.Effect"),
	ADVANCED_DATA_REPORTED("Menus.Advanced-data-reported"),
	ADVANCED_DATA_REPORTER("Menus.Advanced-data-reporter"),
	COMMENTS("Menus.Comments"),
	COMMENTS_DETAILS("Menus.Comments-details"),
	DELETE("Menus.Delete"),
	DELETE_DETAILS("Menus.Delete-details"),
	CONFIRM_DELETE_TITLE("Menus.Confirm-delete-title"),
	CONFIRM_DELETE("Menus.Confirm-delete"),
	CONFIRM_DELETE_DETAILS("Menus.Confirm-delete-details"),
	CANCEL_DELETE("Menus.Cancel-delete"),
	CANCEL_DELETE_DETAILS("Menus.Cancel-delete-details"),
	CONFIRM_ARCHIVE_TITLE("Menus.Confirm-archive-title"),
	CONFIRM_ARCHIVE("Menus.Confirm-archive"),
	CONFIRM_ARCHIVE_DETAILS("Menus.Confirm-archive-details"),
	CANCEL_ARCHIVE("Menus.Cancel-archive"),
	CANCEL_ARCHIVE_DETAILS("Menus.Cancel-archive-details"),
	PROCESS_TITLE("Menus.Process-title"),
	PROCESS("Menus.Process"),
	PROCESS_DETAILS("Menus.Process-details"),
	CANCEL_PROCESS("Menus.Cancel-process"),
	CANCEL_PROCESS_DETAILS("Menus.Cancel-process-details"),
	PUNISH_TITLE("Menus.Punish-title"),
	PUNISHMENTS("Menus.Punishments"),
	NO_PUNISHMENT("Menus.No-punishment"),
	NO_PUNISHMENT_DETAILS("Menus.No-punishment-details"),
	PUNISHMENT("Menus.Punishment"),
	PUNISHMENT_DETAILS("Menus.Punishment-details"),
	COMMENTS_TITLE("Menus.Comments-title"),
	COMMENT("Menus.Comment"),
	COMMENT_DETAILS("Menus.Comment-details"),
	COMMENT_ADD_MESSAGE_ACTION("Menus.Comment-add-message-action"),
	COMMENT_SEND_ACTION("Menus.Comment-send-action"),
	COMMENT_CANCEL_SEND_ACTION("Menus.Comment-cancel-send-action"),
	COMMENT_DELETE_ACTION("Menus.Comment-delete-action"),
	WRITE_COMMENT("Menus.Write-comment"),
	WRITE_COMMENT_DETAILS("Menus.Write-comment-details"),
	USER_TITLE("Menus.User-title"),
	USER("Menus.User"),
	USER_STATISTIC("Menus.User-statistic"),
	USER_STATISTIC_DETAILS("Menus.User-statistic-details"),
	COOLDOWN_STATUS("Menus.Cooldown-status"),
	COOLDOWN_STATUS_DETAILS("Menus.Cooldown-status-details"),
	ARCHIVED_REPORTS("Menus.Archived-reports"),
	ARCHIVED_REPORTS_DETAILS("Menus.Archived-reports-details"),
	ARCHIVED_REPORTS_TITLE("Menus.Archived-reports-title"),
	REPORT_RESTORE_ACTION("Menus.Report-restore-action"),
	PAGE_INFO("Menus.Page-info"),
	PAGE_SWITCH_PREVIOUS("Menus.Switch-to-previous-page"),
	PAGE_SWITCH_NEXT("Menus.Switch-to-next-page"),
	CLOSE("Menus.Close"),

	REPORT_NAME("Words.Report-name"),
	REPORTED_NAME("Words.Reported-name"),
	REPORTER_NAME("Words.Reporter-name"),
	REPORTERS_NAMES("Words.Reporters-names"),
	ONLINE_SUFFIX("Words.Online-suffix"),
	OFFLINE_SUFFIX("Words.Offline-suffix"),
	NOT_FOUND_MALE("Words.Not-found-male"),
	NOT_FOUND_FEMALE("Words.Not-found-female"),
	ACTIVATED("Words.Activated"),
	DISABLED("Words.Disabled"),
	NONE_MALE("Words.None-male"),
	NONE_FEMALE("Words.None-female"),
	SECOND("Words.Second"),
	SECONDS("Words.Seconds"),
	MINUTE("Words.Minute"),
	MINUTES("Words.Minutes"),
	HOUR("Words.Hour"),
	HOURS("Words.Hours"),
	DAY("Words.Day"),
	DAYS("Words.Days"),
	WEEK("Words.Week"),
	WEEKS("Words.Weeks"),
	MONTH("Words.Month"),
	MONTHS("Words.Months"),
	YEAR("Words.Year"),
	YEARS("Words.Years"),
	WAITING("Words.Waiting"),
	IN_PROGRESS("Words.In-progress"),
	IMPORTANT("Words.Important"),
	DONE("Words.Done"),
	APPRECIATION("Words.Appreciation"),
	TRUE("Words.True-appreciation"),
	UNCERTAIN("Words.Uncertain-appreciation"),
	FALSE("Words.False-appreciation"),
	REPORTS_STATISTIC("Words.Reports-statistic"),
	REPORTED_TIMES_STATISTIC("Words.Reported-times-statistic"),
	PROCESSED_REPORTS_STATISTIC("Words.Processed-reports-statistic"),
	YES("Words.Yes-state"),
	NO("Words.No-state"),
	SURVIVAL("Words.Survival"),
	CREATIVE("Words.Creative"),
	ADVENTURE("Words.Adventure"),
	SPECTATOR("Words.Spectator"),
	PRIVATE("Words.Private"),
	SENT("Words.Sent"),
	READ("Words.Read"),
	REPORT_TYPE("Words.Report-type"),
	REPORTS_TYPE("Words.Reports-type"),
	STAFF_REASON("Words.Staff-reason");

	private final String path;

	Message(String path) {
		this.path = path;
	}

	public String get() {
		return MessageUtils.translateColorCodes(ConfigFile.MESSAGES.get().getString(path));
	}

	public String getPath() {
		return path;
	}

	public static String get(String path) {
		return MessageUtils.translateColorCodes(ConfigFile.MESSAGES.get().getString(path));
	}

}
