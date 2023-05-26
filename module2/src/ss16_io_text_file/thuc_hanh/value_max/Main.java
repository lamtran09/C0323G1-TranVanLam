package ss16_io_text_file.thuc_hanh.value_max;

import java.util.List;

public class Main {
        public static int findMax(List<Integer> numbers) {
            int max = numbers.get(0);
            for (int i = 0; i < numbers.size(); i++) {
                if (max < numbers.get(i)) {
                    max = numbers.get(i);
                }
            }
            return max;
        }

        public static void main(String[] args) {
            ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
            List<Integer> numbers = readAndWriteFile.readFile("numbers.txt");
            int maxValue = findMax(numbers);
                    readAndWriteFile.writeFile("result.txt", maxValue);
        }
    }
