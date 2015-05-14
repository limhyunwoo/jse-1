package OOP01.game;

public class NumberMatchVo {
	int player, com;
	int input;
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		if(player <1 || player >5){
			System.out.println("1부터 5까지의 정수만 입력해야 합니다.");
		}else{
			this.player = player;
		}
	}
	public int getCom() {
		return com;
	}
	public int getInput() {
		return input;
	}
	public void setInput(int input) {
		this.input = input;
	}
	public void setCom() {
		this.com = (int) ((Math.random()*2)+1);
	}
	public void setCom(int com){
		this.com = com;
	}

}
