package com.example.ashu.programmingpie;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Programs_Activity extends AppCompatActivity {
    private Button btnHelloWorld,btnAddition,btnIfElse,btnWhileLoop,btnDoWhileLoop,btnForLoop,btnSwitchCase,btnContinue,btnEvenOdd,btnLargestNo;
    private Button btnPrimeNo,btnPalindromeNo,btnFindFactorial,btnFactorialUsingRecursion,btnAreaOfCircle,btnAreaOfRectangle,btnBitwiseAddition,btnSimpleInterest,btnCalculatePercentage,btnGCDAndLCM;
    private Button btnLeapYear,btnPrintTable,btnFindArmstrongNo,btnSwappinttwoNo,btnSwappingWithout3rdVariable,btnFloydTringle,btnPascalTriangle,btnBinarytoDecimal,btnDecimalToBinary,btnDecimalToHex;
    private Button btnDecimalToOctal,btnHexToDecimal,btnOctalToDecimal,btnConstructorProgram,btnThreadProgram,btnFinallyProgram,btnUserDefineExceptionProgram,btnPrintAlhpabets,btnPalindromeString,btnStringChangeCase;
    private Button btnStringLength,btnStringCompare,btnStringConcat,btnStringReverse,btnStringTrim,btnRemoveVowels,btnStringRemoveChar,btnReverseStringArray,btnSortStringArray,btnStringToCharArray,btnCharArrayToString;
    private Button btnLargestSmallest,btnAverageOfArray,btnArrayCopy,btnDeleteElementFromArray,btnTwoDArray,btnMatrixMultiplication,btnMatrixTranspose,btnSparseMatrix,btnInterfaceProgram,btnLinearSearch;
    private Button btnBinarySearch,btnBubbleSort,btnSelectionSort,btnInsertionSort,btnQuickSort,btnMultipleCatch,btnGarbageCollection,btnCreateFile,btnCreateDirectory,btnListContentsOdDir;
    private Button btnRenameFile_Dir,btnDeleteDirectory,btnLastModificationTime,btnDateTime,btnDateToString,btnRandomFunctions,btnRandomNumbers,btnOpenNotepad,btnDisplayIpAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs_);
        btnHelloWorld = (Button)findViewById(R.id.btnHelloWolrd);
        btnAddition = (Button)findViewById(R.id.btnAddition);
        btnIfElse = (Button)findViewById(R.id.btnIfElse);
        btnWhileLoop = (Button)findViewById(R.id.btnWhileLoopProgram);
        btnDoWhileLoop = (Button)findViewById(R.id.btnDoWhileLoopProgram);
        btnForLoop = (Button)findViewById(R.id.btnForLoopProgram);
        btnSwitchCase = (Button)findViewById(R.id.btnSwitchProgram);
        btnContinue = (Button)findViewById(R.id.btnContinueProgram);
        btnEvenOdd = (Button)findViewById(R.id.btnEvenOddProgram);
        btnLargestNo = (Button)findViewById(R.id.btnLargestNoProgram);
        btnPrimeNo = (Button)findViewById(R.id.btnPrimeNumberProgram);
        btnPalindromeNo = (Button)findViewById(R.id.btnPalindromeNumberProgram);
        btnFindFactorial = (Button)findViewById(R.id.btnFindFactorialProgram);
        btnFactorialUsingRecursion = (Button)findViewById(R.id.btnFactorialUsingRecursionProgram);
        btnAreaOfCircle = (Button)findViewById(R.id.btnAreaOfCircleProgram);
        btnAreaOfRectangle = (Button)findViewById(R.id.btnAreaOfRectangleProgram);
        btnBitwiseAddition = (Button)findViewById(R.id.btnBitwiseAdditionProgram);
        btnSimpleInterest = (Button)findViewById(R.id.btnSimpleInterestProgram);
        btnCalculatePercentage = (Button)findViewById(R.id.btnCalculatePercentageProgram);
        btnGCDAndLCM = (Button)findViewById(R.id.btnGCDAndLCMProgram);
        btnLeapYear = (Button)findViewById(R.id.btnLeapYearProgram);
        btnPrintTable = (Button)findViewById(R.id.btnPrintTablesProgram);
        btnFindArmstrongNo = (Button)findViewById(R.id.btnFindArmstrongNumberProgram);
        btnSwappinttwoNo = (Button)findViewById(R.id.btnSwappingTwoNoProgram);
        btnSwappingWithout3rdVariable = (Button)findViewById(R.id.btnSwappingWithout3rdVariableProgram);
        btnFloydTringle = (Button)findViewById(R.id.btnFloydTriangleProgram);
        btnPascalTriangle = (Button)findViewById(R.id.btnPascalTriangleProgram);
        btnBinarytoDecimal = (Button)findViewById(R.id.btnBinaryToDecimalProgram);
        btnDecimalToBinary = (Button)findViewById(R.id.btnDecimalToBinaryProgram);
        btnDecimalToHex = (Button)findViewById(R.id.btnDecimalToHexProgram);
        btnDecimalToOctal = (Button)findViewById(R.id.btnDecimalToOctalProgram);
        btnHexToDecimal = (Button)findViewById(R.id.btnHexToDecimalProgram);
        btnOctalToDecimal = (Button)findViewById(R.id.btnOctalToDecimalProgram);
        btnConstructorProgram = (Button)findViewById(R.id.btnConstructorExampleProgram);
        btnThreadProgram = (Button)findViewById(R.id.btnThreadExampleProgram);
        btnFinallyProgram = (Button)findViewById(R.id.btnFinallyExampleProgram);
        btnUserDefineExceptionProgram = (Button)findViewById(R.id.btnUserDefineExceptionProgram);
        btnPrintAlhpabets = (Button)findViewById(R.id.btnPrintAlphabetsProgram);
        btnPalindromeString = (Button)findViewById(R.id.btnPalindromeStringProgram);
        btnStringChangeCase = (Button)findViewById(R.id.btnStringChangeCaseProgram);
        btnStringLength = (Button)findViewById(R.id.btnStringlengthProgram);
        btnStringCompare = (Button)findViewById(R.id.btnStringCompareProgram);
        btnStringConcat = (Button)findViewById(R.id.btnStringConcatProgram);
        btnStringReverse = (Button)findViewById(R.id.btnStringReverseProgram);
        btnStringTrim = (Button)findViewById(R.id.btnStringTrimProgram);
        btnRemoveVowels = (Button)findViewById(R.id.btnRemoveVowelsProgram);
        btnStringRemoveChar = (Button)findViewById(R.id.btnStringRemoveCharProgram);
        btnReverseStringArray = (Button)findViewById(R.id.btnReverseStringArrayProgram);
        btnSortStringArray = (Button)findViewById(R.id.btnSortStringArrayProgram);
        btnStringToCharArray = (Button)findViewById(R.id.btnStringToCharArrayProgram);
        btnCharArrayToString = (Button)findViewById(R.id.btnCharArrayToStringProgram);
        btnLargestSmallest = (Button)findViewById(R.id.btnLargesSmallestProgram);
        btnAverageOfArray = (Button)findViewById(R.id.btnAverageOfArrayProgram);
        btnArrayCopy = (Button)findViewById(R.id.btnArrayCopyProgram);
        btnDeleteElementFromArray = (Button)findViewById(R.id.btnDeleteElementFromArrayProgram);
        btnTwoDArray = (Button)findViewById(R.id.btnTwoDArrayExampleProgram);
        btnMatrixMultiplication = (Button)findViewById(R.id.btnMatrixMultiplicationProgram);
        btnMatrixTranspose = (Button)findViewById(R.id.btnMatrixTransposeProgram);
        btnSparseMatrix = (Button)findViewById(R.id.btnSparseMatrixProgram);
        btnInterfaceProgram = (Button)findViewById(R.id.btnInterfaceExampleProgram);
        btnLinearSearch = (Button)findViewById(R.id.btnLinearSearchProgram);
        btnBinarySearch = (Button)findViewById(R.id.btnBinarySearchProgram);
        btnBubbleSort = (Button)findViewById(R.id.btnBubbleSortProgram);
        btnSelectionSort = (Button)findViewById(R.id.btnSelectionSortProgram);
        btnInsertionSort = (Button)findViewById(R.id.btnInsertionSortProgram);
        btnQuickSort = (Button)findViewById(R.id.btnQuickSortProgram);
        btnMultipleCatch = (Button)findViewById(R.id.btnMultipleCatchProgram);
        btnGarbageCollection = (Button)findViewById(R.id.btnGarbageCollectionProgram);
        btnCreateFile = (Button)findViewById(R.id.btnCreatFileProgram);
        btnCreateDirectory = (Button)findViewById(R.id.btnCreateDirectoryProgram);
        btnListContentsOdDir = (Button)findViewById(R.id.btnListContentOfDirProgram);
        btnRenameFile_Dir = (Button)findViewById(R.id.btnRenameFileDirProgram);
        btnDeleteDirectory = (Button)findViewById(R.id.btnDeleteDirectoryProgram);
        btnLastModificationTime = (Button)findViewById(R.id.btnLastModificationTimeProgram);
        btnDateTime = (Button)findViewById(R.id.btnDateTimeProgram);
        btnDateToString = (Button)findViewById(R.id.btnDatetoStringProgram);
        btnRandomFunctions = (Button)findViewById(R.id.btnRandomFuntionsProgram);
        btnRandomNumbers = (Button)findViewById(R.id.btnRandomNumbersProgram);
        btnOpenNotepad = (Button)findViewById(R.id.btnOpenNotepadProgram);
        btnDisplayIpAddress = (Button)findViewById(R.id.btnDisplayIpAddressProgram);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.sample);


       btnHelloWorld.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              mp.start();
               Intent i = new Intent(Programs_Activity.this,Hello_World_Activity.class);
               startActivity(i);
           }
       });
       btnAddition.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Addition_Activity.class);
               startActivity(i);
           }
       });
       btnIfElse.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,IfElse_program_Activity.class);
               startActivity(i);
           }
       });

       btnWhileLoop.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,While_Program_Activity.class);
               startActivity(i);
           }
       });
       btnDoWhileLoop.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Do_While_Program_Activity.class);
               startActivity(i);
           }
       });

       btnForLoop.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,For_Loop_Activity.class);
               startActivity(i);
           }
       });
       btnSwitchCase.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Switch_Case_Activity.class);
               startActivity(i);
           }
       });
       btnContinue.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Continue_Program_Activity.class);
               startActivity(i);
           }
       });
       btnEvenOdd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Even_Odd_Program_Activity.class);
               startActivity(i);
           }
       });
       btnLargestNo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,LargestNumber_Activity.class);
               startActivity(i);
           }
       });
       btnPrimeNo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Prime_Program_Activity.class);
               startActivity(i);
           }
       });
       btnPalindromeNo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Palindrome_Program_Activity.class);
               startActivity(i);
           }
       });
       btnFindFactorial.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Factorial_Program_Activity.class);
               startActivity(i);
           }
       });
       btnFactorialUsingRecursion.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Factorial_Recursion_Program_Activity.class);
               startActivity(i);
           }
       });
       btnAreaOfCircle.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Area_Of_Circle_Program_Activity.class);
               startActivity(i);
           }
       });
       btnAreaOfRectangle.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Area_Of_Rectangle_Program_Activity.class);
               startActivity(i);
           }
       });
       btnBitwiseAddition.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Bitwise_Addition_Program_Activity.class);
               startActivity(i);
           }
       });
       btnSimpleInterest.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Simple_Interest_Program_Activity.class);
               startActivity(i);
           }
       });
       btnCalculatePercentage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Calculate_Percentage_Program_Activity.class);
               startActivity(i);
           }
       });
       btnGCDAndLCM.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,GCD_And_LCM_Program_Activity.class);
               startActivity(i);
           }
       });
       btnLeapYear.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Leap_Year_Program_Activity.class);
               startActivity(i);
           }
       });
       btnPrintTable.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Print_Table_Program_Activity.class);
               startActivity(i);
           }
       });
       btnFindArmstrongNo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Find_Armstrong_Number_Program_Activity.class);
               startActivity(i);
           }
       });
       btnSwappinttwoNo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Swapping_Two_Number_Program_Activity.class);
               startActivity(i);
           }
       });
       btnSwappingWithout3rdVariable.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Swapping_With_3_Program_Activity.class);
               startActivity(i);
           }
       });

       btnFloydTringle.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Floyd_Triangle_Program_Activity.class);
               startActivity(i);
           }
       });
       btnPascalTriangle.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Pascal_Triangle_Progam_Activity.class);
               startActivity(i);
           }
       });
       btnBinarytoDecimal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Binary_To_Decimal_Progarm_Activity.class);
               startActivity(i);
           }
       });
       btnDecimalToBinary.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Decimal_To_Binary_Program_Activity.class);
               startActivity(i);
           }
       });
       btnDecimalToHex.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Decimal_To_Hexa_Progarm_Activity.class);
               startActivity(i);
           }
       });
       btnDecimalToOctal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Decimal_To_Octal_Program_Activity.class);
               startActivity(i);
           }
       });
       btnHexToDecimal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Hex_To_Decimal_Progarm_Activity.class);
               startActivity(i);
           }
       });
       btnOctalToDecimal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Octal_To_Decimal_Program_Activity.class);
               startActivity(i);
           }
       });
        btnConstructorProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Programs_Activity.this,Constructor_Example_Activity.class);
                startActivity(i);
            }
        });

        btnThreadProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Programs_Activity.this,Thread_Program_Activity.class);
                startActivity(i);
            }
        });
       btnFinallyProgram.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Finally_Program_Activity.class);
               startActivity(i);
           }
       });
       btnUserDefineExceptionProgram.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,UserDefine_Exception_Program_Activity.class);
               startActivity(i);
           }
       });
       btnPrintAlhpabets.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mp.start();
               Intent i = new Intent(Programs_Activity.this,Print_Alphabets_Program_Activity.class);
               startActivity(i);
           }
       });
      btnPalindromeString.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              mp.start();
              Intent i = new Intent(Programs_Activity.this,Palindrome_String_Program_Activity.class);
              startActivity(i);
          }
      });
     btnStringChangeCase.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             mp.start();
             Intent i = new Intent(Programs_Activity.this,String_Change_Case_Program_Activity.class);
             startActivity(i);
         }
     });
     btnStringLength.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             mp.start();
             Intent i = new Intent(Programs_Activity.this,StringLength_Program_Activity.class);
             startActivity(i);
         }
     });
     btnStringCompare.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             mp.start();
             Intent i = new Intent(Programs_Activity.this,String_Compare_Program_Activity.class);
             startActivity(i);
         }
     });
     btnStringConcat.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             mp.start();
             Intent i = new Intent(Programs_Activity.this,String_ConCat_Program_Activity.class);
             startActivity(i);
         }
     });
     btnStringReverse.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             mp.start();
             Intent i = new Intent(Programs_Activity.this,String_Reverse_Program_Activity.class);
             startActivity(i);
         }
     });
     btnStringTrim.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             mp.start();
             Intent i = new Intent(Programs_Activity.this,Strng_Trim_Program_Activity.class);
             startActivity(i);
         }
     });
    btnRemoveVowels.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          mp.start();
          Intent i = new Intent(Programs_Activity.this,Remove_Vowels_Program_Activity.class);
          startActivity(i);
        }
    });
    btnStringRemoveChar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,String_Remove_Char_Program_Activity.class);
            startActivity(i);
        }
    });
    btnReverseStringArray.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Reverse_String_Array_Program_Activity.class);
            startActivity(i);
        }
    });
    btnSortStringArray.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Sort_String_Array_Program_Activity.class);
            startActivity(i);
        }
    });
    btnStringToCharArray.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,String_To_Char_Program_Activity.class);
            startActivity(i);
        }
    });
    btnCharArrayToString.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Char_Array_To_String_Program_Activity.class);
            startActivity(i);
        }
    });
    btnLargestSmallest.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Largest_Smallest_Program_Activity.class);
            startActivity(i);
        }
    });
    btnAverageOfArray.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Average_Of_Array_Program_Activity.class);
            startActivity(i);
        }
    });
    btnArrayCopy.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Array_Copy_Program_Activity.class);
            startActivity(i);
        }
    });
    btnDeleteElementFromArray.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Delete_Element_From_Array_Program_Activity.class);
            startActivity(i);
        }
    });
    btnTwoDArray.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Two_D_Array_Program_Activity.class);
            startActivity(i);
        }
    });
    btnMatrixMultiplication.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Matrix_Multiplication_Program_Activity.class);
            startActivity(i);
        }
    });
    btnMatrixTranspose.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Matrix_Transpose_Program_Activity.class);
            startActivity(i);
        }
    });
    btnSparseMatrix.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Sparse_Matrix_Program_Activity.class);
            startActivity(i);
        }
    });
    btnInterfaceProgram.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Interface_Program_Activity.class);
            startActivity(i);
        }
    });
    btnLinearSearch.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Linear_Search_Program_Activity.class);
            startActivity(i);
        }
    });
    btnBinarySearch.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Binary_Search_Program_Activity.class);
            startActivity(i);
        }
    });
    btnBubbleSort.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Bubble_Sort_Program_Activity.class);
            startActivity(i);
        }
    });
    btnSelectionSort.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Selection_Sort_Program_Activity.class);
            startActivity(i);
        }
    });
    btnInsertionSort.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Insertion_Sort_Program_Activity.class);
            startActivity(i);
        }
    });
    btnQuickSort.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Quick_Sort_Program_Activity.class);
            startActivity(i);

        }
    });
    btnMultipleCatch.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Multiple_Catch_Program_Activity.class);
            startActivity(i);
        }
    });
    btnGarbageCollection.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Garbage_Collection_Program_Activity.class);
            startActivity(i);
        }
    });
    btnCreateFile.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Create_File_Program_Activity.class);
            startActivity(i);
        }
    });
    btnCreateDirectory.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Create_Directory_Program_Activity.class);
            startActivity(i);
        }
    });
    btnListContentsOdDir.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,List_Contstants_Dir_Program_Activity.class);
            startActivity(i);
        }
    });
    btnRenameFile_Dir.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Rename_File_Dir_Program_Activity.class);
            startActivity(i);
        }
    });
    btnDeleteDirectory.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Delete_Directory_Program_Activity.class);
            startActivity(i);
        }
    });
    btnLastModificationTime.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Last_Modification_Time_Program_Activity.class);
            startActivity(i);
        }
    });
    btnDateTime.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Date_And_Time_Program_Activity.class);
            startActivity(i);
        }
    });
    btnDateToString.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Date_To_String_Program_Activity.class);
            startActivity(i);
        }
    });
    btnRandomFunctions.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Random_Functions_Program_Activity.class);
            startActivity(i);
        }
    });
    btnRandomNumbers.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Random_Number_Program_Activity.class);
            startActivity(i);
        }
    });
    btnOpenNotepad.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Open_Notepad_Program_Activity.class);
            startActivity(i);
        }
    });
    btnDisplayIpAddress.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.start();
            Intent i = new Intent(Programs_Activity.this,Display_IP_Address_Program_Activity.class);
            startActivity(i);
        }
    });



    }

    public void btnAbout(){
        Intent i = new Intent(Programs_Activity.this,AboutUs_Activity.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        //return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.about){
            btnAbout();
            return true;
        }
        // return super.onOptionsItemSelected(item);
        if (id == R.id.shareIt){
            Intent myIntent = new Intent(Intent.ACTION_SEND);
            myIntent.setType("text/plan");
            String shareBody = "Your Body is here";
            String shareSub = "Your Subject is Here";
            myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
            myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
            startActivity(Intent.createChooser(myIntent,"Share Using"));

            return true;
        }
        if(id == R.id.setting){
            Intent i = new Intent(Programs_Activity.this,Settings_Activity.class);
            startActivity(i);
            return  true;
        }
        if(id == R.id.exit){
            onBackPressed();
            return true;
        }
        return true;
    }

}
