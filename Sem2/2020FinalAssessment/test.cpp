#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main(){
    
    char operation = '0';
    char shape = 'x';
    double length = 0.0, width = 0.0, height = 0.0, area = 0.0, radius = 0.0, volume = 0.0;

    while (operation != 1 && operation != 2){
        cout << "\nCODE\tCHOOSE OPERATION" << endl;
        cout << "----\t----------------" << endl;
        cout << "1\tFind Area\n2\tFind Volume" << endl;
        cout << "Choose Operation: ";
        cin >> operation;

        if (operation == '1'){
            cout << "\nFIND AREA CALCULATOR" << endl;
            cout << "--------------------\nA. Rectangle\nB. Circle" << endl;

            shape = 'x', length = 0.0, width = 0.0, height = 0.0, area = 0.0, radius = 0.0, volume = 0.0;
            while (shape != 'A' && shape != 'B'){
                cout << "Choose Shape: ";
                cin >> shape;

                if (shape == 'A'){ //FIND AREA SHAPE A
                    cout << "\nRECTANGLE AREA" << endl;
                    cout << "--------------" << endl;
                    cout << "Enter width: ";
                    cin >> width;
                    cout << "Enter height: ";
                    cin >> height;

                    area = width * height;

                    cout << "Area of rectangle: " << area << endl;
                    cout << "Press 9 to continue: ";
                    cin >> operation;
                    if (operation == 'X'){
                        goto jump;
                    }
                } else if (shape == 'B'){ // FIND AREA SHAPE B
                    cout << "\nCIRCLE AREA" << endl;
                    cout << "--------------" << endl;
                    cout << "Enter radius: ";
                    cin >> radius;

                    area = pow(radius, 2) * (3.142);

                    cout << "Area of circle: " << area << endl;
                    cout << "Press 9 to continue: ";
                    cin >> operation;
                    if (operation == 'X'){
                        goto jump;
                    }
                }
            } 
        } else if (operation == '2'){
            cout << "\nFIND VOLUME CALCULATOR" << endl;
            cout << "----------------------\nA. BOX\nB. SPHERE" << endl;
            
            shape = 'x', length = 0.0, width = 0.0, height = 0.0, area = 0.0, radius = 0.0, volume = 0.0;
            while (shape != 'A' && shape != 'B'){
                cout << "Choose Shape: ";
                cin >> shape;

                if (shape == 'A'){  // FIND VOLUME SHAPE A
                    cout << "\nBOX VOLUME" << endl;
                    cout << "--------------" << endl;
                    cout << "Enter length: ";
                    cin >> length;
                    cout << "Enter width: ";
                    cin >> width;
                    cout << "Enter height: ";
                    cin >> height;

                    volume = length * width * height;

                    cout << "Volume of box: " << volume << endl;
                    cout << "Press 9 to continue: ";
                    cin >> operation;
                    if (operation == 'X'){
                        goto jump;
                    }
                } else if (shape == 'B'){
                    cout << "\nSPHERE VOLUME" << endl;
                    cout << "--------------" << endl;
                    cout << "Enter radius: ";
                    cin >> radius;

                    volume = (4/3) * (3.142) * pow(radius, 2);

                    cout << "Volume of box: " << volume << endl;
                    cout << "Press 9 to continue: ";
                    cin >> operation;
                    if (operation == 'X'){
                        goto jump;
                    }
                }
            }
        } else if (operation == 'X'){
            break;
        }
        jump:
            cout << "\nTERMINATING PROGRAM" << endl;
            break;
    }
    return 0;
}