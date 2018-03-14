import db.DBHelper;
import models.Folder;
import models.File;
import models.Owner;

import java.util.List;


public class Runner {

    public static void main(String[] args) {

        Owner owner1 = new Owner("Del", "Delboy");
        DBHelper.save(owner1);
        Folder folder1 = new Folder("Day_1", owner1);
        DBHelper.save(folder1);

        Folder folder2 = new Folder("Day_2", owner1);
        DBHelper.save(folder2);

        File file1 = new File("maven_intro", "java", 40, folder1);
        DBHelper.save(file1);

        File file2 = new File("annotations_intro", "java", 35, folder2);
        DBHelper.save(file2);

        File file3 = new File("hibernate_intro", "java", 35, folder2);
        DBHelper.save(file3);

        DBHelper.delete(file3);

        Owner foundOwner = DBHelper.find(Owner.class, owner1.getId());

        Folder foundFolder = DBHelper.find(Folder.class, folder1.getId());



        List<File> filesInFolder1 = DBHelper.getFilesInFolder(folder1);
        List<File> filesInFolder2 = DBHelper.getFilesInFolder(folder2);

        List<Folder> allFolders = DBHelper.getAll(Folder.class);
    }
}
