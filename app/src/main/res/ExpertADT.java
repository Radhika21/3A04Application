/**
 * Created by Radhi on 4/6/2016.
 */
public class ExpertADT {
    int IDNumber;
    static int NumberOfCategories;
    static ArrayList ParametersOptions = new ArrayList();



    public static int getNumCat(ExpertADT a) {
        return a.NumberOfCategories;
    }
    public static void setNumCat(ExpertADT a, int numberOfCategories) {
        a.NumberOfCategories = numberOfCategories;
    }

    public static ArrayList getParametersOptions(ExpertADT b) {
        return b.ParametersOptions;
    }
    public static void setParametersOptions(ExpertADT a, ArrayList parametersOptions) {
        a.ParametersOptions.addAll(parametersOptions);
    }

    public static int getIDNumber(ExpertADT a ) {
        return a.IDNumber;
    }
    public static void setIDNumber(ExpertADT a, int iDNumber) {
        a.IDNumber = iDNumber;
    }

}
