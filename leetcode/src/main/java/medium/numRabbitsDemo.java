package medium;

import org.junit.Test;

import java.util.Arrays;

public class numRabbitsDemo {
    @Test
    public void test() {
        int[] answers = {98,887,803,922,962,632,903,99,315,194,951,331,660,958,537,959,71,683,872,234,969,936,634,310,712,1,669,445,510,198,429,194,984,939,793,913,484,178,607,856,521,188,944,787,503,928,371,679,186,469,410,965,244,49,452,723,230,710,690,747,478,556,468,138,935,138,176,703,271,431,152,632,898,499,858,310,417,346,761,223,528,794,591,56,111,855,281,194,92,343,585,986,821,788,91,336,157,297,610,180,433,404,495,768,534,782,743,740,191,80,731,647,980,161,4,191,722,854,679,312,743,676,223,665,658,94,290,412,807,647,713,880,113,244,728,775,557,723,273,393,918,843,752,271,971,373,379,105,894,223,240,734,114,169,998,264,902,63,452,283,395,139,249,800,55,299,189,473,581,504,24,541,556,727,713,950,961,594,178,879,329,289,77,113,41,999,68,384,141,349,384,916,40,643,808,515,965,631,929,84,132,460,852,497,672,376,373,225,951,405,804,336,760,395,994,205,282,82,298,806,0,488,48,125,0,253,342,99,752,496,365,14,762,849,516,735,763,593,84,154,503,665,8,573,857,294,987,494,452,253,212,812,906,97,943,27,465,207,544,513,794,603,438,133,675,655,528,833,500,189,60,764,994,617,912,122,363,561,524,269,23,590,406,757,259,492,330,927,758,622,335,641,696,167,335,979,558,502,606,338,735,522,410,512,212,996,858,789,183,536,135,485,843,904,306,55,697,558,43,344,149,526,649,861,301,596,448,576,428,10,285,592,331,383,0,200,977,377,340,714,736,905,755,511,214,140,115,900,919,419,678,673,787,920,47,614,290,491,383,641,993,12,502,175,49,468,340,570,956,625,474,927,618,856,26,948,794,508,576,418,873,68,843,476,85,412,256,579,463,82,893,546,158,651,731,3,116,16,205,395,56,908,515,353,828,411,517,284,497,381,741,433,989,414,328,628,918,341,655,572,73,359,79,578,711,330,388,77,951,287,832,481,539,163,307,721,561,478,577,203,760,414,918,895,214,385,465,532,190,646,735,601,363,508,733,685,97,22,733,454,881,231,836,235,467,657,682,821,18,656,29,925,755,835,279,605,59,311,122,24,377,960,616,542,453,532,983,640,79,284,910,875,845,612,122,809,106,286,245,217,527,302,556,272,950,587,50,411,964,542,285,238,127,78,306,905,717,587,715,940,443,301,887,6,182,218,52,601,962,2,560,477,846,239,908,256,306,591,538,326,924,5,795,821,842,726,486,114,878,404,405,955,85,517,903,373,284,210,270,958,662,420,95,961,987,492,441,950,915,485,958,376,535,893,871,679,337,374,317,837,251,532,152,21,815,711,98,597,973,774,869,790,949,325,75,511,46,961,299,392,321,749,473,28,815,722,802,42,846,138,272,208,48,457,585,96,362,771,126,329,367,836,805,146,248,628,373,48,711,93,705,821,939,688,647,523,408,476,296,752,299,340,258,607,681,9,583,23,933,916,424,342,75,811,171,705,705,145,642,147,138,635,470,898,864,737,626,112,308,605,131,864,545,785,649,258,656,286,441,119,202,99,997,549,540,394,597,610,761,517,104,938,667,834,832,9,930,451,411,745,23,886,363,990,513,214,457,986,147,371,554,662,318,377,36,754,769,965,279,125,995,628,472,733,734,416,464,53,345,689,706,197,416,835,852,414,675,646,891,726,104,782,24,691,905,690,883,96,798,990,809,601,764,612,805,83,382,9,301,148,828,104,189,596,205,758,18,337,115,385,701,27,597,12,277,272,217,354,970,327,702,401,678,859,919,11,229,191,425,436,730,602,26,436,850,350,820,260,220,677,94,70,705,858,264,142,754,70,495,327,47,182,356,882,763,321,499,270,147,940,993,938,220,90,259,66,486,139,499,230,246,487,675,998,674,121,351,55,264,379,180,669,283,528,790,22,597,317,828,808,935,571,263,917,16,727,862,679,408,349,781,890,675,919,324,433,181,369,376,994,853,648,909,619,744,307,599,705,273,689,328,778,205,643,653,18,288,142,655,708,850,471,578,721,634,100,115,679,470,207,991,277,32,676,230,56,116,784,176,225,933,723,589,211,665,696,533,193,712,484,931,863,940,238,402,415,313,124,175,64,651,500,205,767,734,718,64,824,223,359,621,549,623,521,886,146,743,854,572,587,733,33,478,588,717,239,901,331,976,213,267,595,777,318,948,859,672,737,236,294,398,249,784,889,641,81,463,297,388,704,806,368,444,99,574,726,177,52,193,838,983,180,871,623,172,245,921,319,773,894};
        System.out.println(numRabbits(answers));
    }

    public int numRabbits(int[] answers) {
        //构造辅助数组
        int[] a = new int[1000];

        int value = 0;
        int nums = 0;
        int answerNums = answers.length;
        //
        for (int i=0;i<answers.length;i++) {
            value = answers[i];
            if (a[value] == 0) {
                a[value] = value;
            } else {
                a[value]  = a[value] - 1;
                if (a[value] == 0) {
                    nums = nums + value;
                    answerNums = answerNums - value;
                }
            }
        }

        // 清空辅助数组
        for (int i=0;i<a.length;i++) {
            if (a[i] != 0) {
                nums = nums + a[i];
            }
        }
        nums = nums + answerNums;
        return nums;
    }
}
