class TeamMate {
  private String userId;
  private String name;
  private boolean online;

  public TeamMate() {
    online = false;
    userId = "a";
    name = "a";
  }

  public TeamMate(String userId, String name, boolean online) {
    this.online = online;
    this.userId = userId;
    this.name = name;
  }

  public TeamMate(String userId, String name) {
    this.online = false;
    this.userId = userId;
    this.name = name;
  }
  
  public String getuserId() {
    return userId;
  }
  
  public void setuserId(String userId) {
    this.userId = userId;
  }

  public String getname() {
    return name;
  }
  
  public void setname(String name) {
    this.name = name;
  }

  public boolean getonline() {
    return online;
  }

  public void setonline(boolean online) {
    this.online = online;
  }

}