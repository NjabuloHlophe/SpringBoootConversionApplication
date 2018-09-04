package com.example.demo;
public class Convert{
	
	public String type; //Length or Temperature conversion?
	
	public Convert() {
		// TODO Auto-generated constructor stub
		super();
	}
	 //LENGTH CONVERSION ALGORITHMS //
    public static double ConvertLength(double input, String from, String to) {
    	 double value = 0;
    	 
    	  /**IMPERIAL TO METRIC CONVERSIONS*/
    	 
    	 // Inch TO METRIC
    	 if (from.equals("Inch") && to.equals("millimetres/mm")) {
             return input * 1000 * 0.0254;
         }
         if (from.equals("Inch") && to.equals("centimetres/cm")) {
             return input * 100 * 0.0254;
         }
         if (from.equals("Inch") && to.equals("metres/m")) {
             return input * 0.0254;
         }
         if (from.equals("Inch") && to.equals("kilometres/km")) {
             return (input * 0.0254) / 1000;
         }

         //INCH -> IMPERIAL
         if (from.equals("Inch") && to.equals("Inch")) {
             return input;
         }
         if (from.equals("Inch") && to.equals("Foot")) {
             return input / ((30.48 / 100) / (25.4 / 1000));
         }
         if (from.equals("Inch") && to.equals("Yard")) {
             return input / ((0.9144) / (25.4 / 1000));
         }
         if (from.equals("Inch") && to.equals("Mile")) {
             return input / ((1609) / (25.4 / 1000));
         }


         //FOOT -> METRIC
         if (from.equals("Foot") && to.equals("millimetres/mm")) {
             return input * 1000 * 0.3048;
         }
         if (from.equals("Foot") && to.equals("centimetres/cm")) {
             return input * 100 * 0.3048;
         }
         if (from.equals("Foot") && to.equals("metres/m")) {
             return input * 0.3048;
         }
         if (from.equals("Foot") && to.equals("kilometres/km")) {
             return (input * 0.3048) / 1000;
         }

         //FOOT -> IMPERIAL
         if (from.equals("Foot") && to.equals("Inch")) {
             return input / ((0.0254) / (0.3048));
         }
         if (from.equals("Foot") && to.equals("Foot")) {
             return input / ((0.3048) / (0.3048));
         }
         if (from.equals("Foot") && to.equals("Yard")) {
             return input / ((0.9144) / (0.3048));
         }
         if (from.equals("Foot") && to.equals("Mile")) {
             return input / ((1609) / (0.3048));
         }


         //YARD -> METRIC
         if (from.equals("Yard") && to.equals("millimetres/mm")) {
             return input * 1000 * 0.9144;
         }
         if (from.equals("Yard") && to.equals("centimetres/cm")) {
             return input * 100 * 0.9144;
         }
         if (from.equals("Yard") && to.equals("metres/m")) {
             return input * 0.9144;
         }
         if (from.equals("Yard") && to.equals("kilometres/km")) {
             return (input * 0.9144) / 1000;
         }

         //Yard -> IMPERIAL
         if (from.equals("Yard") && to.equals("Inch")) {
             return input / ((0.0254) / (0.9144));
         }
         if (from.equals("Yard") && to.equals("Foot")) {
             return input / ((0.3048) / (0.9144));
         }
         if (from.equals("Yard") && to.equals("Yard")) {
             return input / ((0.9144) / (0.9144));
         }
         if (from.equals("Yard") && to.equals("Mile")) {
             return input / ((1609) / (0.9144));
         }


         //Mile -> METRIC
         if (from.equals("Mile") && to.equals("millimetres/mm")) {
             return input * 1000 * 1609;
         }
         if (from.equals("Mile") && to.equals("centimetres/cm")) {
             return input * 100 * 1609;
         }
         if (from.equals("Mile") && to.equals("metres/m")) {
             return input * 1609;
         }
         if (from.equals("Mile") && to.equals("kilometres/km")) {
             return (input * 1609) / 1000;
         }

         //Mile -> IMPERIAL
         if (from.equals("Mile") && to.equals("Inch")) {
             return input / ((0.0254) / (1609));
         }
         if (from.equals("Mile") && to.equals("Foot")) {
             return input / ((0.3048) / (1609));
         }
         if (from.equals("Mile") && to.equals("Yard")) {
             return input / ((0.9144) / (1609));
         }
         if (from.equals("Mile") && to.equals("Mile")) {
             return input;
         }

         //TO IMPERIAL
         if ((from.equals("millimetres/mm") || from.equals("centimetres/cm") || from.equals("metres/m") || from.equals("kilometres/km")) && (to.equals("Inch") || to.equals("Foot") || to.equals("Yard") || to.equals("Mile"))) {
             //TO INCH//
             if (to.equals("Inch")) {
                 value = input / 0.0254;
                 if (from.equals("millimetres/mm")) {
                     return value / 1000;
                 }
                 if (from.equals("centimetres/cm")) {
                     return value / 100;
                 }
                 if (from.equals("metres/m")) {
                     return value;
                 }
                 if (from.equals("kilometres/km")) {
                     return value * 1000;
                 }
             }
             //TO FOOT
             if (to.equals("Foot")) {
                 value = input / 0.3048;
                 if (from.equals("millimetres/mm")) {
                     return value / 1000;
                 }
                 if (from.equals("centimetres/cm")) {
                     return value / 100;
                 }
                 if (from.equals("metres/m")) {
                     return value;
                 }
                 if (from.equals("kilometres/km")) {
                     return value * 1000;
                 }
             }

             //TO YARD
             if (to.equals("Yard")) {
                 value = input / 0.9144;
                 if (from.equals("millimetres/mm")) {
                     return value / 1000;
                 }
                 if (from.equals("centimetres/cm")) {
                     return value / 100;
                 }
                 if (from.equals("metres/m")) {
                     return value;
                 }
                 if (from.equals("kilometres/km")) {
                     return value * 1000;
                 }
             }

             //TO MILE
             if (to.equals("Mile")) {
                 value = input / 1609;
                 if (from.equals("millimetres/mm")) {
                     return value / 1000;
                 }
                 if (from.equals("centimetres/cm")) {
                     return value / 100;
                 }
                 if (from.equals("metres/m")) {
                     return value;
                 }
                 if (from.equals("kilometres/km")) {
                     return value * 1000;
                 }
             }
         }
          //METRIC TO METRIC
         if ((from.equals("millimetres/mm") || from.equals("centimetres/cm") || from.equals("metres/m") || from.equals("kilometres/km")) && (to.equals("millimetres/mm") || to.equals("centimetres/cm") || to.equals("metres/m") || to.equals("kilometres/km"))) {
             //FROM MILLIMETRES//
             if (from.equals("millimetres/mm")) {
                 if (to.equals("millimetres/mm")) {
                     return input;
                 }
                 if (to.equals("centimetres/cm")) {
                     return input / 100;
                 }
                 if (to.equals("metres/m")) {
                     return input / 1000;
                 }
                 if (to.equals("kilometres/km")) {
                     return input / (1000 * 1000);
                 }
             }
             //FROM CENTIMETRES
             if (from.equals("centimetres/cm")) {
                 if (to.equals("millimetres/mm")) {
                     return input * 10;
                 }
                 if (to.equals("centimetres/cm")) {
                     return input;
                 }
                 if (to.equals("metres/m")) {
                     return input / 100;
                 }
                 if (to.equals("kilometres/km")) {
                     return input / (100 * 1000);
                 }
             }
             //FROM METRES
             if (from.equals("metres/m")) {
                 if (to.equals("millimetres/mm")) {
                     return input * 1000;
                 }
                 if (to.equals("centimetres/cm")) {
                     return input * 100;
                 }
                 if (to.equals("metres/m")) {
                     return input;
                 }
                 if (to.equals("kilometres/km")) {
                     return input / 1000;
                 }
             }
             //FROM KILOMETRES
             if (from.equals("kilometres/km")) {
                 if (to.equals("millimetres/mm")) {
                     return input * 1000000;
                 }
                 if (to.equals("centimetres/cm")) {
                     return input * 100000;
                 }
                 if (to.equals("metres/m")) {
                     return input * 1000;
                 }
                 if (to.equals("kilometres/km")) {
                     return input;
                 }
             }

         }
         return 0.00000;
		
    }
    public static double ConvertTemperature(double input, String from, String to) {
    	
    	//CELSIUS TO FAHRNHEIT
    	if (from.equals("celsius/tC") && to.equals("fahrnheit/tF")) {
    	            return 9 * input / 5 + 32;
    	}
    	//CELSIUS TO CELSIUS / FAHRNHEIT TO FAHRNHEIT
    	if ((from.equals("celsius/tC") && to.equals("celsius/tC")) || (from.equals("fahrnheit/tF") && to.equals("fahrnheit/tF"))) {
    	            return input;
    	}
    	//FAHRNHEIT TO CELSIUS 
    	if (from.equals("fahrnheit/tF") && to.equals("celsius/tC")) {
    	            return (input - 32) * 5 / 9;
    	}

    	return 0.00000;
   }
   
    public static double massconversion(double input, String from, String to) {
        double value;
        //FROM IMPERIAL//
        //Ounce -> METRIC//
        if (from.equals("Ounce") && to.equals("grammes/g")) {
            return input * 1000 * 0.02835;
        }
        if (from.equals("Ounce") && to.equals("kilogrammes/kg")) {
            return input * 0.02835;
        }
        if (from.equals("Ounce") && to.equals("metric tonnes/mT")) {
            return input * (0.02835 / 1000);
        }

        //Ounce -> IMPERIAL//
        if (from.equals("Ounce") && to.equals("Ounce")) {
            return input;
        }
        if (from.equals("Ounce") && to.equals("Pound")) {
            return input / ((0.4536) / (0.02835));
        }
        if (from.equals("Ounce") && to.equals("Stone")) {
            return input / ((6.3503) / (0.02835));
        }
        if (from.equals("Ounce") && to.equals("Long ton")) {
            return input / ((1016) / (0.02835));
        }


        //Pound -> METRIC//
        if (from.equals("Pound") && to.equals("grammes/g")) {
            return input * 1000 * 0.4536;
        }
        if (from.equals("Pound") && to.equals("kilogrammes/kg")) {
            return input * 0.4536;
        }
        if (from.equals("Pound") && to.equals("metric tonnes/mT")) {
            return input * (0.4536 / 1000);
        }

        //Pound -> IMPERIAL//
        if (from.equals("Pound") && to.equals("Ounce")) {
            return input / ((0.02835) / (0.4536));
        }
        if (from.equals("Pound") && to.equals("Pound")) {
            return input / ((0.4536) / (0.4536));
        }
        if (from.equals("Pound") && to.equals("Stone")) {
            return input / ((6.3503) / (0.4536));
        }
        if (from.equals("Pound") && to.equals("Long ton")) {
            return input / ((1016) / (0.4536));
        }


        //Stone -> METRIC//
        if (from.equals("Stone") && to.equals("grammes/g")) {
            return input * 1000 * 6.3503;
        }
        if (from.equals("Stone") && to.equals("kilogrammes/kg")) {
            return input * 6.3503;
        }
        if (from.equals("Stone") && to.equals("metric tonnes/mT")) {
            return input * (6.3503 / 1000);
        }

        //Stone -> IMPERIAL//
        if (from.equals("Stone") && to.equals("Ounce")) {
            return input / ((0.02835) / (6.3503));
        }
        if (from.equals("Stone") && to.equals("Pound")) {
            return input / ((0.4536) / (6.3503));
        }
        if (from.equals("Stone") && to.equals("Stone")) {
            return input / ((6.3503) / (6.3503));
        }
        if (from.equals("Stone") && to.equals("Long ton")) {
            return input / ((1016) / (6.3503));
        }


        //Long ton -> METRIC//
        if (from.equals("Long ton") && to.equals("grammes/g")) {
            return input * 1000 * 1016;
        }
        if (from.equals("Long ton") && to.equals("kilogrammes/kg")) {
            return input * 1016;
        }
        if (from.equals("Long ton") && to.equals("metric tonnes/mT")) {
            return input * 1.016;
        }

        //Long ton -> IMPERIAL//
        if (from.equals("Long ton") && to.equals("Ounce")) {
            return input / ((0.02835) / (1016));
        }
        if (from.equals("Long ton") && to.equals("Pound")) {
            return input / ((0.4536) / (1016));
        }
        if (from.equals("Long ton") && to.equals("Stone")) {
            return input / ((6.3503) / (1016));
        }
        if (from.equals("Long ton") && to.equals("Long ton")) {
            return input;
        }

//TO IMPERIAL//
        if ((from.equals("grammes/g") || from.equals("kilogrammes/kg") || from.equals("metric tonnes/mT")) && (to.equals("Ounce") || to.equals("Pound") || to.equals("Stone") || to.equals("Long ton"))) {
            //TO Ounce//
            if (to.equals("Ounce")) {
                value = input / 0.02835;
                if (from.equals("grammes/g")) {
                    return value / 1000;
                }
                if (from.equals("kilogrammes/kg")) {
                    return value;
                }
                if (from.equals("metric tonnes/mT")) {
                    return value * 1000;
                }
            }
            //TO Pound//
            if (to.equals("Pound")) {
                value = input / 0.4536;
                if (from.equals("grammes/g")) {
                    return value / 1000;
                }
                if (from.equals("kilogrammes/kg")) {
                    return value;
                }
                if (from.equals("metric tonnes/mT")) {
                    return value * 1000;
                }
            }

            //TO Stone//
            if (to.equals("Stone")) {
                value = input / 6.3503;
                if (from.equals("grammes/g")) {
                    return value / 1000;
                }
                if (from.equals("kilogrammes/kg")) {
                    return value;
                }
                if (from.equals("metric tonnes/mT")) {
                    return value * 1000;
                }
            }

            //TO Long ton//
            if (to.equals("Long ton")) {
                value = input / 1016;
                if (from.equals("grammes/g")) {
                    return value / 1000;
                }
                if (from.equals("kilogrammes/kg")) {
                    return value;
                }
                if (from.equals("metric tonnes/mT")) {
                    return value * 1000;
                }
            }
        }
//METRIC TO METRIC//
        if ((from.equals("grammes/g") || from.equals("kilogrammes/kg") || from.equals("metric tonnes/mT")) && (to.equals("grammes/g") || to.equals("kilogrammes/kg") || to.equals("metric tonnes/mT"))) {
            //FROM GRAMMES//
            if (from.equals("grammes/g")) {
                if (to.equals("grammes/g")) {
                    return input;
                }
                if (to.equals("kilogrammes/kg")) {
                    return input / 1000;
                }
                if (to.equals("metric tonnes/mT")) {
                    return input / 1000000;
                }
            }
            //FROM KILOGRAMMES//
            if (from.equals("kilogrammes/kg")) {
                if (to.equals("grammes/g")) {
                    return input * 1000;
                }
                if (to.equals("kilogrammes/kg")) {
                    return input;
                }
                if (to.equals("metric tonnes/mT")) {
                    return input / 1000;
                }
            }
            //FROM METRIC TONNES//
            if (from.equals("metric tonnes/mT")) {
                if (to.equals("grammes/g")) {
                    return input * 1000000;
                }
                if (to.equals("kilogrammes/kg")) {
                    return input * 1000;
                }
                if (to.equals("metric tonnes/mT")) {
                    return input;
                }
            }

        }
        return 0.00000;
    }
    
   

}
