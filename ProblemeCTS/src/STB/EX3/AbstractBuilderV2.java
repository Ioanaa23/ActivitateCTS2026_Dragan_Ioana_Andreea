package STB.EX3;

public interface AbstractBuilderV2 {
    AutobuzLinie build();

    AbstractBuilderV2 setModel(String model);
    AbstractBuilderV2 setNumeSofer(String numeSofer);

}
