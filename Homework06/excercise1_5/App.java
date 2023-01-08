package excercise1_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        //init();
        readListData("excercise1_5/data/countries.csv");
        System.out.println("Test Original Data :");
        testOriginalData();
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Sort Increasing By Population :");
        testSortIncreasingByPopulation();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Sort Decreasing By Population :");
        testSortDecreasingByPopulation();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Sort Increasing By Area :");
        testSortIncreasingByArea();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Sort Decreasing By Area :");
        testSortDecreasingByArea();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Sort Increasing By Gdp :");
        testSortIncreasingByGdp();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Sort Decreasing By Gdp :");
        testSortDecreasingByGdp();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Filter Africa Country :");
        testFilterAfricaCountry();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Filter Asia Country :");
        testFilterAsiaCountry();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Filter Europe Country :");
        testFilterEuropeCountry();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Filter North America Country :");
        testFilterNorthAmericaCountry();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Filter Oceania Country :");
        testFilterOceaniaCountry();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Filter South America Country :");
        testFilterSouthAmericaCountry();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Filter Most Populous Countries :");
        testFilterMostPopulousCountries();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Filter Least Populous Countries :");
        testFilterLeastPopulousCountries();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Filter Largest Area Countries :");
        testFilterLargestAreaCountries();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Filter Smallest Area Countries :");
        testFilterSmallestAreaCountries();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Filter Highest Gdp Countries :");
        testFilterHighestGdpCountries();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Test Filter Lowest Gdp Countries :");
        testFilterLowestGdpCountries();
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }
                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5);
                if (continent.equals("Africa")) {
                    countryManager.append(new AfricaCountry(code, name, population, area, gdp));
                } else if (continent.equals("South America")) {
                    countryManager.append(new SouthAmericaCountry(code, name, population, area, gdp));
                } else if (continent.equals("Europe")) {
                    countryManager.append(new EuropeCountry(code, name, population, area, gdp));
                } else if (continent.equals("Asia")) {
                    countryManager.append(new AsiaCountry(code, name, population, area, gdp));
                } else if (continent.equals("North America")) {
                    countryManager.append(new NorthAmericaCountry(code, name, population, area, gdp));
                } else if (continent.equals("Oceania")) {
                    countryManager.append(new OceaniaCountry(code, name, population, area, gdp));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            Collections.addAll(result, splitData);
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        for (int i = 0; i < countries.length; i++) {
            System.out.println((countries[i]));
        }
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void testFilterAfricaCountry() {
        Country[] countries = countryManager.filterAfricaCountry();
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void testFilterAsiaCountry() {
        Country[] countries = countryManager.filterAsiaCountry();
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void testFilterEuropeCountry() {
        Country[] countries = countryManager.filterEuropeCountry();
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] countries = countryManager.filterNorthAmericaCountry();
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void testFilterOceaniaCountry() {
        Country[] countries = countryManager.filterOceaniaCountry();
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] countries = countryManager.filterSouthAmericaCountry();
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = countryManager.filterMostPopulousCountries(5);
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] countries = countryManager.filterLeastPopulousCountries(5);
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void testFilterLargestAreaCountries() {
        Country[] countries = countryManager.filterLargestAreaCountries(5);
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] countries = countryManager.filterSmallestAreaCountries(5);
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void testFilterHighestGdpCountries() {
        Country[] countries = countryManager.filterHighestGdpCountries(5);
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }

    public static void testFilterLowestGdpCountries() {
        Country[] countries = countryManager.filterLowestGdpCountries(5);
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }
}
