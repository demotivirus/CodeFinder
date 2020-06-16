package Patterns.Adapter.Example_05;

public class CarWashToTrackAdapter implements Car{
    private Track track;

    public CarWashToTrackAdapter(Track track){
        this.track = track;
    }

    @Override
    public void wash() {
        track.clean();
    }
}
