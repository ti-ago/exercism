class SqueakyClean {
    static String clean(String identifier) {
        String newId = "";
        String newId2 = "";
        for(int i = 0; i < identifier.length(); i++){
            if (identifier.charAt(i) == ('-')){
                newId+= Character.toUpperCase(identifier.charAt(i+1));
                i++;
                continue;
            }
            newId+= identifier.charAt(i);
        }
        newId = newId.replaceAll(" ", "_");
        newId = newId.replaceAll("4", "a");
        newId = newId.replaceAll("3", "e");
        newId = newId.replaceAll("0", "o");
        newId = newId.replaceAll("1", "l");
        newId = newId.replaceAll("7", "t");

        for(int i = 0; i < newId.length(); i++){
            if (Character.isAlphabetic(newId.charAt(i)) || newId.charAt(i) == '_'){
                newId2+= newId.charAt(i);
            }
        }
        return newId2;
    }
}
