package clueGame;

public enum DoorDirection {
	UP('U'), DOWN('D'), LEFT('L'), RIGHT('R');
    private char value;

    private DoorDirection(char value) {
            this.value = value;
    }
}
