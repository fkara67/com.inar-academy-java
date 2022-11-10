package chapters.chapter_10.Exercises.Exercises_10_08;

public class TestTax {
    public static void main(String[] args) {

        double[] rates2001 = {0.15, 0.275, 0.305, 0.355,0.391};
        int[][] brackets2001 = {
                {27050, 65550, 136750, 297350},  // Single filer
                {45200, 109250, 166500, 297350}, // Married jointly or-qualifying widow(er)
                {22600, 54625, 83250, 148675},  // Married separately
                {36250, 93650, 151650, 297350} // Head of household
        };

        double[] rates2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets2009 = {
                {8350, 33950, 82250, 171550, 372950},  // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly or-qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475},  // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        Tax tax2001 = new Tax(0, brackets2001, rates2001, 50000);
        Tax tax2009 = new Tax(0, brackets2009, rates2009, 50000);

        System.out.println("2001 tax tables for taxable income from 50,000$ to 100,000$");
        print(tax2001);
        System.out.println();
        System.out.println("2009 tax tables for taxable income from 50,000$ to 100,000$");
        print(tax2009);

    }
    public static void print(Tax tax) {
        double income = tax.getTaxableIncome();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.print("Taxable\t\t\tSingle\t\t\tMarried Jointly or \t\t Married\t\t\t Head of\n" +
                         "Income\t\t\tFilers\t\t\tQualifying Widow(er)\t Seperately\t\t\tHousehold\n");
        System.out.println("------------------------------------------------------------------------------------");
        while (income <= 100000) {
            tax.setTaxableIncome(income);
            System.out.printf("%.0f", income);
            while (tax.getFilingStatus() < 4) {
                System.out.printf("\t\t\t%.2f ", tax.getTax());
                tax.setFilingStatus(tax.getFilingStatus() + 1);
            }
            income += 10000;
            tax.setFilingStatus(0);
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------------------");
    }
}
