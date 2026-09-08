class Solution {

    public String encode(List<String> strs) {

        StringBuilder builder = new StringBuilder();

        for(String str : strs){
            builder.append(str.length())
                   .append("#")
                   .append(str);
        }
        return builder.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while(i < str.length()){

            //Start j at the same position i
            int j = i;

            //Find the "#"
            while(str.charAt(j) != '#'){
                j++;
            }

            //vGet the number before #
            int length = Integer.parseInt(str.substring(i,j));

            // The actual word starts after #
            int wordStart = j + 1;

            // Extract exactly 'length' characters
            String word = str.substring(wordStart, wordStart + length);

            // Add decoded word to result
            result.add(word);

            // Move i to the next encoded string 
            i = wordStart + length;
        }
        
        return result;
    }
}
