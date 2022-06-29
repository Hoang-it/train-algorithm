import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Conference {
    @SerializedName(value = "ConferenceId")
    private String conferenceId;
    @SerializedName(value = "CallId")
    private String callId;
    @SerializedName(value = "CallStartDate")
    private String callStartDate;
    @SerializedName(value = "CallEndDate")
    private String callEndDate;
    @SerializedName(value = "connectionTime")
    private List<Connection> connectionTime;

    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public String getCallStartDate() {
        return callStartDate;
    }

    public void setCallStartDate(String callStartDate) {
        this.callStartDate = callStartDate;
    }

    public String getCallEndDate() {
        return callEndDate;
    }

    public void setCallEndDate(String callEndDate) {
        this.callEndDate = callEndDate;
    }

    public List<Connection> getConnectionTime() {
        return connectionTime;
    }

    public void setConnectionTime(List<Connection> connectionTime) {
        this.connectionTime = connectionTime;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "conferenceId='" + conferenceId + '\'' +
                ", callId='" + callId + '\'' +
                ", callStartDate=" + callStartDate +
                ", callEndDate=" + callEndDate +
                ", connectionTime=" + connectionTime +
                '}';
    }
}
