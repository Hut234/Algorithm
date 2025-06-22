class Solution {
    public int minimumDeletions(String word, int k) {
        int[] alphabets = new int[26];
        for (int i = 0; i < word.length(); i++) {
            ++alphabets[word.charAt(i) - 'a'];
        }

        List<Integer> frequency = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (alphabets[i] != 0) frequency.add(alphabets[i]);
        }

        int result = 100001;
        for (int i = 0; i < frequency.size(); i++) {
            int minimum = frequency.get(i);
            int delete = 0;
            for (int j = 0; j < frequency.size(); j++) {
                int maximum = frequency.get(j);
                if (minimum > maximum) {
                    delete += maximum;
                } else if (minimum + k < maximum) {
                    delete += maximum - (minimum + k);
                }
            }
            result = Integer.min(result, delete);
        }

        return result;
    }
}