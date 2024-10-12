package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class SoldierService extends Service<ObservableList<String>> {

    @Override
    protected Task<ObservableList<String>> createTask() {
        return new Task<ObservableList<String>>() {
            @Override
            protected ObservableList<String> call() throws Exception {
                String[] names = {"Big Boss",
                        "Solid Snake",
                        "Revolver Ocelot",
                        "Liquid Snake",
                        "Grey Fox",
                        "Roy Campbell"};

                ObservableList<String> soldiers = FXCollections.observableArrayList();

                for(int i = 0; i < 6; i++) {
                    soldiers.add(names[i]);
                    updateMessage("Added " + names[i] + " to the list");
                    updateProgress(i + 1, 6);
                    Thread.sleep(200);
                }
                return soldiers;
            }
        };
    }
}
