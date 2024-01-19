public interface Strategy {
    boolean isApplicable(String type);
    void execute();
}
