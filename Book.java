package Project;

interface Book {
	String reset = "\033[0m";  // Text Reset

    // Regular Colors
    String black = "\033[0;30m";   // BLACK
    String red = "\033[0;31m";     // RED
    String green = "\033[0;32m";   // GREEN
    String yellow = "\033[0;33m";  // YELLOW
    String blue = "\033[0;34m";    // BLUE
    String purple = "\033[0;35m";  // PURPLE
    String cyan = "\033[0;36m";    // CYAN
    String white = "\033[0;37m";   // WHITE
	
	void book();
}
