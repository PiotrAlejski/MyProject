package service;

import model.User;

/**
 * Created by RENT on 2017-03-13.
 */
public class UserService {

    private User userFromFile;

    public boolean authenticate(User user) {
        //pobieramy password z user, gdy mamy więcej niż 1 usera
        //pobieramy userFromFile czyli usera z pliku
        DataService dataService = new DataService();
        User userFromFile = dataService.loadData();

        return user.equals(userFromFile);
    }
}
