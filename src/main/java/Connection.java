import com.google.gson.annotations.SerializedName;

public class Connection {
    @SerializedName(value = "ParticipantId")
    private String participantId;
    @SerializedName(value = "ConnectionTime")
    private String connectionTime;

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public String getConnectionTime() {
        return connectionTime;
    }

    public void setConnectionTime(String connectionTime) {
        this.connectionTime = connectionTime;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "participantId='" + participantId + '\'' +
                ", connectionTime='" + connectionTime + '\'' +
                '}';
    }
}
