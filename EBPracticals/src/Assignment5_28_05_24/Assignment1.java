//package Assignment5_28_05_24;
//
//import java.util.HashMap;
//import java.util.Map;
////import java.util.TextAnalyzer;
//
//public class Assignment1 {
//	
//	private StringBuilder text;
//
//    public Assignment1(String text) {
//        this.text = new StringBuilder(text);
//    }
//
//    // Method to remove all occurrences of a given word
//    public void removeWord(String word) {
//        String toRemove = "\\b" + word + "\\b";
//        String result = text.toString().replaceAll(toRemove, "");
//        text = new StringBuilder(result);
//    }
//
//    // Method to replace all occurrences of a given word with another word
//    public void replaceWord(String oldWord, String newWord) {
//        String toReplace = "\\b" + oldWord + "\\b";
//        String result = text.toString().replaceAll(toReplace, newWord);
//        text = new StringBuilder(result);
//    }
//
//    // Method to count the frequency of each word
//    public Map<String, Integer> countWordFrequency() {
//        Map<String, Integer> wordCount = new HashMap<>();
//        String[] words = text.toString().split("\\W+");
//
//        for (String word : words) {
//            if (word.isEmpty()) continue;
//            word = word.toLowerCase(); // To make it case insensitive
//            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
//        }
//        
//        return wordCount;
//    }
//
//    // Method to find the longest word
//    public String findLongestWord() {
//        String[] words = text.toString().split("\\W+");
//        String longestWord = "";
//
//        for (String word : words) {
//            if (word.length() > longestWord.length()) {
//                longestWord = word;
//            }
//        }
//
//        return longestWord;
//    }
//
//    // Getter for the modified text
//    public String getText() {
//        return text.toString();
//    }
//	
//	
////	public static void main(String[] args) {
////        String sampleText = "This is a sample text for the text analyzer. This text contains words for testing.";
////        Assignment1 analyzer = new Assignment1(sampleText);
////
////        // Remove a word
////        analyzer.removeWord("text");
////        System.out.println("After removing 'text': " + analyzer.getText());
////
////        // Replace a word
////        analyzer.replaceWord("sample", "example");
////        System.out.println("After replacing 'sample' with 'example': " + analyzer.getText());
////
////        // Count word frequency
////        Map<String, Integer> wordFrequency = analyzer.countWordFrequency();
////        System.out.println("Word frequencies: " + wordFrequency);
////
////        // Find the longest word
////        String longestWord = analyzer.findLongestWord();
////        System.out.println("Longest word: " + longestWord);
////    }
//}
