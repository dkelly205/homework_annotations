# homework_annotations

Create a one-to-many hibernate application using annotations

MVP
Create a system to track files and folders.

A file should have a name, extension (e.g. txt, rb, java, ppt), size and folder.

A folder should have a title and list of files.

Create the CRUD methods.

Create method to get list of all files in a folder.

Extension
Add an owner of the folder. (An owner can own many folders.)
Owner should have name and username.
Create method to get all folders an owner has.
Note
Sometimes when you use FetchType.Eager you can get duplicate results. This is when you have nested Sets.

So our owner has a set of folders which has a set of files.

In this case when we get all folders for an owner it may duplicate our results as it will run the code for each subset as well. (Weird i know and has to do with the Joins hibernate does under the surface).

If you find this happening add the following line of code in your query:

cr.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

This will only get one distinct copy of duplicate rows back.
