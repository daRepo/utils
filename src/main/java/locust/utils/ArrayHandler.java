/*
 * .
 */
package locust.utils;

/**
 *
 * @author stnal
 */
public class ArrayHandler {

    private String[] array;
    private String string;
    private String divider = ",";
    private boolean sqlWrapping = true;

    public ArrayHandler(String v_input) {

        string = v_input;

        if (v_input == null) {

            array = new String[0];
        } else {

            array = v_input.split(divider);
        }
    }

    public void setSqlWrapping(boolean v_bool) {

        sqlWrapping = v_bool;
    }

    public void setArray(String v_input, String v_separator) {

        if (v_input == null) {

            array = new String[0];
        } else {

            array = v_input.split(v_separator);
        }
    }

    public boolean contains(String v_input) {

        for (String currentElement : array) {

            if (currentElement.equalsIgnoreCase(v_input)) {
                return true;
            }
        }
        return false;
    }

    public void addElement(String v_input) {

        String[] newArray = new String[array.length + 1];

        for (int i = 0; i < array.length; i++) {

            newArray[i] = array[i];
        }

        newArray[newArray.length - 1] = v_input;
        array = newArray;
    }

    public void removeElement(String v_input) {

        if (contains(v_input)) {

            String[] newArray = new String[array.length - 1];
            int newArrayCounter = 0;

            for (int i = 0; i < array.length; i++) {

                if (!array[i].equalsIgnoreCase(v_input)) {

                    newArray[newArrayCounter] = array[i];
                    i++;
                }
            }

            array = newArray;
        }
    }

    public boolean addUniqueElement(String v_input) {

        if (contains(v_input)) {

            return false;
        } else {

            addElement(v_input);
            return true;
        }
    }

    public String[] getArray() {

        return array;
    }

    @Override
    public String toString() {

        if (array.length == 0) {

            return "NULL";
        }

        String returnable = array[0];

        if (sqlWrapping) {

            for (int i = 1; i < array.length; i++) {

                String currentElemet = array[i];

                returnable += divider + currentElemet;
            }
            return "'" + returnable + "'";

        } else {

            for (int i = 1; i < array.length; i++) {

                String currentElemet = array[i];

                returnable += divider + currentElemet;
            }
            return returnable;
        }
    }

    public void setDivider(String v_newDivider) {

        divider = v_newDivider;
    }
}
