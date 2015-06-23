# p3stasny.v3_NutritionApp

Mobile Application Development
Programming Assignment #3
Spring 2015
Due: Thursday,April 9th at Midnight.

For this assignment, there is no specific application to develop.
You are asked to demonstrate that you understand and can implement a set of Android concepts in a single application of your choosing.
It might be helpful if you use this programming assignment as a start toward figuring out pieces of your final class project.
Or you can use the money tracking example from the last quiz/lab.

Develop a single application (you choose the domain) that demonstrates the use of at least five of the following Android concepts.
Plus, you should also include one extra concept of your choice, so long as it isn’t something basic that we have already covered.
It is probably best to clear it with me before you count on using a different concept.

• Action Bar
• Long Press
• ListView
• Dynamic UI
• Fragment (or DialogFragment)
• Drawable
• Database
• SharedPreferences

Upload a single zip file to Blackboard, Prog3.
The file should that contains the whole project and a README.
The README is very important this time so put some extra effort into it.
In the README, explain which of the concepts you implemented, why that feature makes sense to use the way you did, and any resources you consulted to figure out how to use it.

_______________________________________________________________________________

CONCEPTS IMPLEMENTED
__________________________
[Sean Stasny]
[ststasny]
[Program Assignment #3]
[04/07/2015]
__________________________
-Long Press
        >MainActivity.java - Lines: 31-54
            ~I used a drawable with a long press click listener to randomly generate a separate drawable below the one clicked.
             The drawable that is generated is the chemical formula for one of the 8 B Vitamins.
             
-Dynamic UI
        >MainActivity.java - Lines: 44-52
            >strings.xml - Lines: 7-27
                ~I used a drawable with a long press click listener to dynamically and randomly generate a separate drawable below the one clicked.
                 The drawable that is generated is the chemical formula for one of the 8 B Vitamins. I used a string array to hold the file names.
                 I dynamically did this so I could show each picture.
            
        >activity_nutr_info.xml - Lines: 9-14
            >NutrInfo.java - Lines: 25-32
                >ListFrag.java: - Lines: 24-35
                    ~I created a FrameLayout in activity_nutr_info.xml and used a fragment manager and transaction in NutrInfo.java to dynamically add the ListView (ListFrag.java) to the FrameLayout.
                     This ListView is for selected which nutrient you would like to display information about.

        >NutrInfo.java - Lines: 41-53
            >Communicator.java
                >InfoFrag.java - Lines: 50-85
                    ~I dynamically changed the information in the fragment (InfoFrag.java) to display information for the nutrient selected in the ListView.
                     I dynamically did this so I could reuse the same fragment.
                     
                     #I consulted Dr. Wilkins' Fragment3 & SEC_Fragment Android Apps.
    
-Drawable
        >activity_main.xml - Lines: 40-45
            >activity_main.xml - Lines: 54-58
                >strings.xml - Lines: 7-27
                    >MainActivity - Lines: 34-51
                        ~I used a drawable with a long press click listener to dynamically and randomly generate a separate drawable below the one clicked.
                         The drawable that is generated is the chemical formula for one of the 8 B Vitamins. I used a string array to hold the file names.
                         
                        #I consulted http://stackoverflow.com/questions/9156698/how-to-get-images-dynamically-from-drawable-folder
                         to figure out how to retrieve the names of the drawables.
                        #I consulted https://en.wikipedia.org/wiki/B_vitamins for the images used for drawables. They were all labelled for reuse.
-ListView
        >ListFrag.java
            ~I created a FrameLayout in activity_nutr_info.xml and used a fragment manager and transaction in NutrInfo.java to add the ListView (ListFrag.java) to the FrameLayout.
             This ListView is for selected which nutrient you would like to display information about.
             Using a ListView worked well for the amount of items I need to display on the screen.
                     
             #I consulted Dr. Wilkins' SEC_Fragment Android App.
                
-Fragment
        >activity_nutr_info.xml - Lines: 16-21
            >NutrInfo.java - Lines: 34-38
                >activity_info_frag.xml
                    >InfoFrag.java
                        ~I used a fragment (InfoFrag.java) to display information about the nutrient that is selected on the ListView.
                         Using a fragment was a clean way to show the information.
                         
                         #I consulted Dr. Wilkins' Fragment3 Android App.
