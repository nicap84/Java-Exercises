# Java-Exercises

Exercise 10

Simulate three Christmas lights. Each must display the
message "Merry Christmas!" flashing at different frequencies and in different
colors.
- Bright 1: flashes every two seconds and uses the black and white colors.
- Bright 2: flashes every 1 second and uses the red and blue colors.
- Bright 3: flashes every 0.5 seconds and uses the green and yellow colors.
Implement a timer to mark the hours, minutes and seconds. He
timer will start operating when pressing button "Start", is
stop when press the "Stop" button to stop and be set to zero
when you press the "Restart" button.

Exercise 9

ENROLLMENT MANAGEMENT CAREER
Control of enrollment of students in the careers of the University of Deusto.
This program must keep information about students and careers that are offered at UD.

· Student registrations
The aim will be to insert a new student, matriculándolo in a particular career.
For this student data is entered, the race will be selected in which
tuition (in the drop-down list), the "Insert" button is pressed and the student will be inserted
in the database.
Note: You must verify that the student ID entered does not match the ID of
another student already in the database. If so, an error message is displayed.
· Student Searches
The aim will display the data of a given your student ID. For it will be introduced
Student ID card in the corresponding text box, the "Search" button is pressed and the
student data will be displayed in the text boxes.
Note: If there is no student with that ID, message is displayed
error.
· Deleting Students
The aim will be to eliminate a particular student as your ID. For this to introduce the
Student ID card in the corresponding text box, the "delete" button is pressed and the
Students will be deleted from the database.
Note: If there is no student with that ID, message is displayed
error.
· Changing Student Facts
The aim will be to change an existing student database given its
DNI. For this, the general procedure is as follows:
- The student ID is entered in the corresponding text box and pressed the
"Search" button.
- The student data are displayed in the text boxes.
- The data was reissued want to change (the change is not contemplated
the student ID) and "Change Data" button is pressed.
- The student data with that ID should be changed in the database.
Note: You must ensure that the student ID to modify exists in the database.

Exercise 8

The objective of this practice is to capture and treat some events

First part
- Capture events that occur when you press buttons 7 interface.
The treatment to be given to each button is as follows:
· Search button: You should see the text area below the message "You want
search for students with ID <ID Introduced> ".
· Insert button: will be displayed in the lower text area data
Students entered in the text boxes.
· Modify button: the label must be displayed on the top of the message
"Modify button pressed" and the item should appear selected in the
top combobox will be "law".
· Delete button will be displayed on the label on the top of the message
"Delete button pressed", delete the contents of all text boxes and
delete the item that was selected from the top combobox.
· Students View button: is displayed in the lower text area item that is
selected in the lower combobox.
· Clean button: the content of the text area, the text boxes are cleared and
selects the first item in both combobox.
· Exit button: exits the application.
Capture events occurring over the window so that if the user
pressing the window close button (the X in the upper right), application
end.

Second part
- Capture The event that occurs when you select an item in the combobox and
display the selected item in the lower text area.
- Include A scroll bar to the text area. appears when text
entered by the user does not enter the size of the text area.
- Replace The text area by a JList (also with slider
built) and capture the events of "click" and "double click" on the elements of the
list. Show "click on the X element" messages and "double click on
element X "on the label at the top.
Note: At this time the buttons that made use of the text area stop
function. Can you comment your code to fix it.
- Capture Press events and mouse movement on the label
header that he says: "Consultations Career". For each of these events, show
A message other than standard output.
-Change The behavior of the button "Insert" so that each time you press, you
insert the contents of the box "Name" in the list and in the combobox
bottom.
