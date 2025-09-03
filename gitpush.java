
public class gitpush {
    
    public static void main(String[] args) {
        System.out.println("Push in git");
    }
}

/*
 * PS D:\javaforplacement> git init
Reinitialized existing Git repository in D:/javaforplacement/.git/
PS D:\javaforplacement> git remote set-url origin https://github.com/shivaay22/javaforplacement.git
PS D:\javaforplacement> git add gitpush.java
PS D:\javaforplacement> git commit -m "Added gitpush.java file"
[main d6f24d8] Added gitpush.java file
 1 file changed, 7 insertions(+)
 create mode 100644 gitpush.java
PS D:\javaforplacement> git push -u origin main 
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 392 bytes | 392.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/shivaay22/javaforplacement.git   
   a9c4a40..d6f24d8  main -> main
branch 'main' set up to track 'origin/main'.
PS D:\javaforplacement> 
 */


 /*
  * cd D:\javaforplacement                         # Go to your project folder
git init                                       # (only if not already initialized)
git remote set-url origin https://github.com/shivaay22/javaforplacement.git  # Ensure correct remote
git add graph/                                 # Add the entire 'graph' folder and its contents
git commit -m "Added graph folder with Java files"  # Commit the change
git push -u origin main                        # Push to GitHub


cd D:\javaforplacement                                      # Go to your project folder

git init                                                    # Initialize git (only if not done already)

git remote set-url origin https://github.com/shivaay22/javaforplacement.git   # Set the correct remote

git add graph/dfs.java                                      # Add only the specific file

git commit -m "Added dfs.java file in graph folder"         # Commit with a message

git push -u origin main                                     # Push to the main branch

  */


  /*
   * PS C:\Users\hp\Desktop\pullCode>  cd .\jobDekho
PS C:\Users\hp\Desktop\pullCode\jobDekho> git init
Reinitialized existing Git repository in C:/Users/hp/Desktop/pullCode/jobDekho/.git/
PS C:\Users\hp\Desktop\pullCode\jobDekho> git remote add origin https://github.com/Surendrakumain main
>>
remote: Enumerating objects: 111, done.
remote: Counting objects: 100% (24/24), done.
remote: Compressing objects: 100% (23/23), done.
remote: Total 111 (delta 3), reused 1 (delta 1), pack-reused 87 (from 1)
Receiving objects: 100% (111/111), 194.50 KiB | 995.00 KiB/s, done.
Resolving deltas: 100% (20/20), done.
From https://github.com/Surendrakumarpatel/jobportal-yt
 * branch            main       -> FETCH_HEAD
 * [new branch]      main       -> origin/main
PS C:\Users\hp\Desktop\pullCode\jobDekho>

   */