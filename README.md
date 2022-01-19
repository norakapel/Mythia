# Mythia
Οδηγίες μεταγλώττισης του προγράμματος:
javac MythiaMainMenu.java

και για run της εφαρμογής: java MythiaMainMenu

Οδηγίες εκτέλεσης του προγράμματος:
java -jar Mythia.jar (στον υπολογιστή που το δημιουργήσαμε τρέχει κανονικά, με την εντολή και με διπλό αριστερό κλικ στο ποντίκι)

Οδηγίες χρήσης του προγράμματος: (όπως στο αρχείο txt)

ΜΥΤΗΙΑ 

A unique gaming experience consisting of three sub-games of knowledge and strategy based on ancient Greek mythology!
You can excpirience mythia alone or with your friends!  

CASE : SINGLE PLAYER 

  GAME 1: QUIZ GAME 
  
  Do you know enough about your character?
  You will know after the firs game , a quiz of five questions that are answered with YES or NO. 
  If you manage to answer right your points increase by 10 .
  Otherwise your points remain the same.

  GAME 2: THE FAITH 

  A unique knowledge game of five approximate questions to see how well you know your chosen hero. 
  Αnswer all the questions and try to make the most accurate predictions!
  With each correct answer you increase your points by 10.
  With each answer that deviates by 2 points from the correct one, you increase your points by 5. 
  While with each answer with a deviation greater than 10, your points remain the same.

  GAME 3: THE BATTLE 

  Strategy and battle game! Experience the virtual battle of your favorite heroes of ancient Greek mythology!
  With the card of your chosen hero in your hand, choose one of the three moves to prevail in the battle against your opponent!
  Each player has 100 LPs (Life Points). Each move removes or adds LP to the characters.
  The player who will be the first to reset the opponent's LPs is the winner.
  If the points that you have already collected from the two previous games are more than fifty you start first.
  In case your points are below fifty your virtual opponent starts first.
  In the last case that yours and your opponent's points are equal you play heads or tails to see who starts. 
  First Move  : Limited force attack, without consequences for your character.
  Second Move : Stronger attack, so strong that 30% of the force is removed from your own character.
  Third Move  : LP recovery. Beware, 1 in 3 attempts will fail.

CASE : MULTI PLAYER

  GAME 1: QUIZ GAME 
  
  Who knows better his chosen character?
  You will know after the firs game , a quiz of five questions that are answered with YES or NO. 
  The last to chose his character is the first to play.
  The two players answer alternately.
  If you manage to answer right your points increase by 10 .
  Otherwise your points remain the same.

  GAME 2: THE FAITH 

  A unique knowledge game of ten approximate questions. 
  Αnswer all the questions and try to make the most accurate predictions!
  The questions are the same for the two players.
  In case only one player make the right prediction then this player's points increase by 20 when the other's remain the same.
  In case both players make the right prediction then their points increase by 15.
  In case the players have the same deviations from the right answer then their points increase by 5.
  In the last case that nither has an accurate prediction nor they have the same devidations ,the points of the player with the smaller deviation increase by five ,when the other's remain the same

  GAME 3: THE BATTLE 

  Strategy and battle game! Experience the virtual battle of your favorite heroes of ancient Greek mythology!
  With the card of your chosen hero in your hand, choose one of the three moves to prevail in the battle against your opponent!
  Each player has 100 LPs (Life Points). Each move removes or adds LP to the characters.
  The player who will be the first to reset the opponent's LPs is the winner.
  The player that has collected the most points starts first.
  In the last case that yours and your opponent's points are equal you play heads or tails to see who starts. 
  First Move  : Limited force attack, without consequences for your character.
  Second Move : Stronger attack, so strong that 30% of the force is removed from your own character.
  Third Move  : LP recovery. Beware, 1 in 3 attempts will fail.
  
 
Σύντομη παρουσίαση της δομής των περιεχομένων του αποθετηρίου:
-ένας φάκελος photos με αρχεία png (logo,Heroescards,backround, etc)
-ένας φάκελος csv με αρχεία csv(αρχεία με questions και answers για το stage 1 και stage 2)
-ένα txt αρχείο για το Info
-ένα αρχείο .jar που είναι η εφαρμογή
-10 class for the characters
-1 main class (MythiaMainMenu)
-1 class to choose character
-1 class PreferedSettings to set some default settings for frame and buttons
-1 class for Heroes
-1 class for Single
-1 class for Multi
-2 class for Stage 1 (1 Single , 1 Multi)
-2 class for Stage 2 (1 Single , 1 Multi)
-2 class for final stage 3 (1 Single , 1 Multi)
-1 .md README (inseption HA HA HA)


