class SnapchatUser{
	String username;
	String idName;
	int streaks;
	String nickName;
	
	public SnapchatFriends(String username, String idName, int streaks, String nickName){
		this.username = username;
		this.idName = idName;
		this.streaks = streaks;
		this.nickName = nickName;
	}
	
	public void friends(){
		System.out.println(username);
		System.out.println(idName);
		System.out.println(streaks);
		System.out.println(nickName);
	}
}