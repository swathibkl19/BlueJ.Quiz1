 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int result=1;
          for(int factor = 2; factor <=number; factor++)
          {
              result= (result*factor);
            }
          return result;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String acronym = "";
          
            
                acronym += phrase.toUpperCase().charAt(0);
                for(int i = 1; i <= phrase.length()-1; i++)
                {
                    if(phrase.charAt( i - 1) ==' '|| phrase.charAt(i -1) == '-')
                    {
                        acronym +=phrase.toUpperCase().charAt(i);
                    }
                }
                return acronym;
            }
        
          
        

    

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
        
      public String encrypt(String word) {
            String encryptedstr = "";
            System.out.print('\u000C');
            //String[] alphabet ={"a","b","c","d","e","f","g"};
            //char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
                      //String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
          char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
          char[] arrayChar = word.toCharArray();
          Integer lengthArr = alphabet.length;
          String container = "";
          //System.out.println( lengthArr );
          for( char c : arrayChar){
              Integer indexChar = new String(alphabet).indexOf(c);
              //System.out.println(indexChar);
              Integer indexUp = ((indexChar + 3)%lengthArr);
              //System.out.println( " --> " +  indexUp + " - " + alphabet[indexUp]);
              container += alphabet[indexUp];
              //System.out.println( c + "-" + findIndex(alphabet,'b'));
          }
          //System.out.println(container);
          return container;
        }
            
          
          
        }
    
  

