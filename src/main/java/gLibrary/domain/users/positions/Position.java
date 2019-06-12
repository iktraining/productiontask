package gLibrary.domain.users.positions;

public class Position {
	private PositionCode positionCode;
	private PositionName positionName;
	private PositionKana positionKana;

	public Position(PositionCode positionCode, PositionName positionName, PositionKana positionKana) {
		this.positionCode = positionCode;
		this.positionName = positionName;
		this.positionKana = positionKana;
	}

	public PositionCode getPositionCode() {
		return positionCode;
	}

	public PositionName getPositionName() {
		return positionName;
	}
	public PositionKana getPositionKana() {
		return positionKana;
	}
}
