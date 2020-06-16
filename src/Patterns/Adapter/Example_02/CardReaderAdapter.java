package Patterns.Adapter.Example_02;

public class CardReaderAdapter implements USB{
    private MemoryCard memoryCard;

    public CardReaderAdapter(MemoryCard memoryCard){
        this.memoryCard = memoryCard;
    }

    @Override
    public void connect() {
        memoryCard.insert();
        memoryCard.copyData();
    }
}
