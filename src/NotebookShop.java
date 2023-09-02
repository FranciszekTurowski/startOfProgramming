public class NotebookShop {
    public static void main(String[] args) {

       DataStore dataStore = new DataStore();
       dataStore.add(new Computer("HP", 1222));
       dataStore.add(new Computer("HP", 1222));
       dataStore.add(new Computer("XD", 1221));
       dataStore.add(new Computer("XD", 1221));
       dataStore.add(new Computer("HP", 1222));

       Computer computerToFind = new Computer("HP", 1222);
        int hp = dataStore.checkAvailability(computerToFind);
        System.out.println(hp);

        for (Computer c: dataStore.getComputers())
        System.out.println(c);

              {

        }
    }
}
