package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String error = null;
    private String usernames = "";

    public ClearState(ClearState copy){

        this.error = copy.error;
        this.usernames = copy.usernames;
    }

    public ClearState(){

    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getUsernames() {
        return usernames;
    }

    public void setUsernames(String usernames) {
        this.usernames = usernames;
    }

    @Override
    public String toString() {
        return "ClearState{" +
                "error='" + error + '\'' +
                '}';
    }
}
