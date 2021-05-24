/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laidelibrary;

import java.awt.Cursor;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Login extends javax.swing.JFrame {

    Random randomObject = new Random();
    // Generate a random number from 0 - 110 
    // and assigns the same to the variable randomNumber
    int randomNumber = randomObject.nextInt(111);

    // Declare an array of one hundred and ten (110) quotes about reading
    String[] quotes = {
        "A reader lives a thousand lives before he dies ...\n "
        + "The man who never reads lives only one. – George R.R. Martin",
        "Never trust anyone who has not brought a book with them. – Lemony Snicket",
        "You can never get a cup of tea large enough or a \n"
        + "book long enough to suit me. – C.S. Lewis",
        "Reading is essential for those who seek to rise \n"
        + "above the ordinary. – Jim Rohn",
        "I find television very educating. Every time somebody \n"
        + "turns on the set, I go into the other room and \n"
        + "read a book. – Groucho Marx",
        "Classic – a book which people praise and don’t read. – Mark Twain",
        "You don’t have to burn books to destroy a culture. \n"
        + "Just get people to stop reading them. – Ray Bradbury",
        "So please, oh please, we beg, we pray, go throw your \n"
        + "TV set away, and in its place you can install a \n"
        + "lovely bookshelf on the wall. - Roald Dahl",
        "Think before you speak. Read before you think. – Fran Lebowitz",
        "Let’s be reasonable and add an eighth day to the \n"
        + "week that is devoted exclusively to reading. – Lena Dunham",
        "That’s the thing about books. They let you travel \n"
        + "without moving your feet. – Jhumpa Lahiri",
        "The reading of all good books is like conversation \n"
        + "with the finest (people) of the past centuries. – Descartes",
        "In the case of good books, the point is not to see \n"
        + "how many of them you can get through, but rather \n"
        + "how many can get through to you. – Mortimer J. Adler",
        "Reading one book is like eating one potato chip. – Diane Duane",
        "The more that you read, the more things you will know. \n"
        + "The more that you learn, the more places you’ll go. – Dr. Seuss",
        "Reading is an exercise in empathy; an exercise in walking \n"
        + "in someone else’s shoes for a while. — Malorie Blackman",
        "Books are a uniquely portable magic. – Stephen King",
        "I read a book one day and my whole life was changed. – Orhan Pamuk",
        "People say that life is the thing, but I prefer reading. – Logan Pearsall Smith",
        "Today a reader, tomorrow a leader. – Margaret Fuller",
        "People can lose their lives in libraries. \n"
        + "They ought to be warned. – Saul Bellow",
        "A good book is an event in my life. – Stendhal",
        "Reading brings us unknown friends. – Honoré de Balzac",
        "The world was hers for the reading. – Betty Smith",
        "I kept always two books in my pocket, one to read, \n"
        + "one to write in. – Robert Louis Stevenson",
        "The person who deserves most pity is a lonesome \n"
        + "one on a rainy day who doesn’t know how to read. – Benjamin Franklin",
        "Once you have read a book you care about, some \n"
        + "part of it is always with you. – Louis L’Amour",
        "Literature is the most agreeable way of ignoring life. – Fernando Pessoa",
        "No. I can survive well enough on my own—\n"
        + "if given the proper reading material. – Sarah J. Maas",
        "There is more treasure in books than in all \n"
        + "the pirate's loot on Treasure Island. – Walt Disney",
        "We are of opinion that instead of letting \n"
        + "books grow moldy behind an iron grating, \n"
        + "far from the vulgar gaze, it is better to \n"
        + "let them wear out by being read.” – Jules Verne",
        "A room without books is like a body without a soul. – Cicero",
        "My alma mater was books, a good library…. I \n"
        + "could spend the rest of my life reading, \n"
        + "just satisfying my curiosity. – Malcolm X",
        "It’s not that I don’t like people. It’s just that \n"
        + "when I’m in the company of others – even my \n"
        + "nearest and dearest – there always comes a \n"
        + "moment when I’d rather be reading a book. – Maureen Corrigan",
        "Books to the ceiling, Books to the sky, My pile \n"
        + "of books is a mile high. How I love them! \n"
        + "How I need them! I’ll have a long beard by \n"
        + "the time I read them. – Arnold Lobel",
        "There is nothing more luxurious than eating while \n"
        + "you read—unless it be reading while you eat. – E. Nesbit",
        "One glance at a book and you hear the voice of \n"
        + "another person, perhaps someone dead for \n"
        + "1,000 years. To read is to voyage through time. – Carl Sagan",
        "I have a passion for teaching kids to become \n"
        + "readers, to become comfortable with a book, \n"
        + "not daunted. Books shouldn’t be daunting, \n"
        + "they should be funny, exciting and wonderful; \n"
        + "and learning to be a reader gives a terrific advantage. – Roald Dahl",
        "Man reading should be man intensely alive. The book \n"
        + "should be a ball of light in one’s hand. – Ezra Pound",
        "If we encounter a man of rare intellect, we should \n"
        + "ask him what books he reads. – Ralph Waldo Emerson",
        "Always read something that will make you look good \n"
        + "if you die in the middle of it. – P.J. O’Rourke",
        "Many people, myself among them, feel better at the \n"
        + "mere sight of a book. – Jane Smiley",
        "Beware of the person of one book. – Thomas Aquinas",
        "Read the best books first, or you may not have a \n"
        + "chance to read them at all. – Henry David Thoreau",
        "Make it a rule never to give a child a book you \n"
        + "would not read yourself. – George Bernard Shaw",
        "Books serve to show a man that those original \n"
        + "thoughts of his aren’t very new after all. – Abraham Lincoln",
        "I can’t imagine a man really enjoying a book and \n"
        + "reading it only once. – C.S. Lewis",
        "You know you’ve read a good book when you turn \n"
        + "the last page and feel a little as if you have lost a friend. – Paul Sweeney",
        "Some books leave us free and some books make us free. – Ralph Waldo Emerson",
        "Once you learn to read, you will be forever free. – Frederick Douglas",
        "There are many little ways to enlarge your \n"
        + "child’s world. Love of books is the best of all. – Jacqueline Kennedy Onassis",
        "Wear the old coat and buy the new book. – Austin Phelps",
        "You may have tangible wealth untold. \n"
        + "Caskets of jewels and coffers of gold. \n"
        + "Richer than I you can never be — \n"
        + "I had a mother who read to me. – Strickland Gillilan",
        "The man who does not read good books is no \n"
        + "better than the man who can’t. – Mark Twain",
        "To learn to read is to light a fire; every \n"
        + "syllable that is spelled out is a spark. – Victor Hugo",
        "Oh, magic hour, when a child first knows \n"
        + "she can read printed words! – Betty Smith",
        "A book is a gift you can open again and again. – Garrison Keillor",
        "Fill your house with stacks of books, in \n"
        + "all the crannies and all the nooks. – Dr. Seuss",
        "Show me a family of readers, and I will \n"
        + "show you the people who move the world. – Napoléon Bonaparte",
        "A classic is a book that has never \n"
        + "finished saying what it has to say. – Italo Calvino",
        "I have always imagined that paradise \n"
        + "will be a kind of library. – Jorge Luis Borges",
        "Reading is a discount ticket to everywhere. – Mary Schmich",
        "No entertainment is so cheap as \n"
        + "reading, nor any pleasure so lasting. – Mary Wortley Montagu",
        "I think books are like people, \n"
        + "in the sense that they’ll \n"
        + "turn up in your life when you most need them. – Emma Thompson",
        "If you are going to get anywhere\n"
        + " in life you have to read a lot of books. – Roald Dahl",
        "That perfect tranquility of life, \n"
        + "which is nowhere to be found \n"
        + "but in retreat, a faithful friend and a good library. – Aphra Behn",
        "To acquire the habit of reading \n"
        + "is to construct for yourself \n"
        + "a refuge from almost all the miseries of life. – W. Somerset Maugham",
        "Rainy days should be spent at home \n"
        + "with a cup of tea and a good book. – Bill Watterson",
        "These books gave Matilda a hopeful \n"
        + "and comforting message: You are not alone. – Roald Dahl",
        "I guess there are never enough books. – John Steinbeck",
        "Despite the enormous quantity of books,\n"
        + " how few people read! And if one \n"
        + "reads profitably, one would realize \n"
        + "how much stupid stuff the vulgar herd is content to swallow every day. – Voltaire",
        "If you don’t like to read, you haven’t found the right book. – J.K. Rowling",
        "Libraries will get you through times of\n"
        + " no money better than money will get you through times of no libraries. – Anne Herbert",
        "Ah, how good it is to be among people who are reading. – Rainer Maria Rilke",
        "Children are made readers on the laps of their parents. – Emilie Buchwald",
        "I couldn’t live a week without a private \n"
        + "library – indeed, I’d part with all \n"
        + "my furniture and squat and sleep on \n"
        + "the floor before I’d let go of the 1500 or so books I possess. – H.P. Lovecraft",
        "Books are good company, in sad times and \n"
        + "happy times, for books are people – \n"
        + "people who have managed to stay alive \n"
        + "by hiding between the covers of a book. – E.B. White",
        "Luckily, I always travel with a book, just \n"
        + "in case I have to wait on line for \n"
        + "Santa, or some such inconvenience. – David Levithan",
        "Outside of a dog, a book is a man’s best \n"
        + "friend. Inside of a dog, it’s too dark to read. – Groucho Marx",
        "Somebody who only reads newspapers and at \n"
        + "best books of contemporary authors \n"
        + "looks to me like an extremely \n"
        + "near-sighted person who scorns eyeglasses. \n"
        + "He is completely dependent on the \n"
        + "prejudices and fashions of his times, \n"
        + "since he never gets to see or hear anything else. – Albert Einstein",
        "I always read. You know how sharks have to \n"
        + "keep swimming or they die? I’m like that. \n"
        + "If I stop reading, I die. – Patrick Rothfuss",
        "There is no Frigate like a Book To take us Lands away – Emily Dickinson",
        "I intend to put up with nothing that I can put down. – Edgar Allan Poe",
        "Books are not made for furniture, but there \n"
        + "is nothing else that so beautifully furnishes a house. – Henry Ward Beecher",
        "I took a speed-reading course and read War \n"
        + "and Peace in twenty minutes. It involves Russia. – Woody Allen",
        "There are worse crimes than burning books. \n"
        + "One of them is not reading them. – Joseph Brodsky",
        "When I look back, I am so impressed again \n"
        + "with the life-giving power of literature. \n"
        + "If I were a young person today, trying to \n"
        + "gain a sense of myself in the world, I would \n"
        + "do that again by reading, just as I did when I was young. – Maya Angelou",
        "I declare after all there is no enjoyment like reading! \n"
        + "How much sooner one tires of any thing than of a book! — \n"
        + "When I have a house of my own, I shall be miserable if I have not an excellent library. – Jane Austen",
        "Books break the shackles of time – proof that humans can work magic. – Carl Sagan",
        "Employ your time in improving yourself by other men’s writings \n"
        + "so that you shall come easily by what others have labored hard for. – Socrates",
        "For my whole life, my favorite activity was reading. It’s not \n"
        + "the most social pastime. – Audrey Hepburn",
        "Reading for me, is spending time with a friend. – Gary Paulsen",
        "From the reading of ‘good books’ there comes a richness of \n"
        + "life that can be obtained in no other way. – Gordon B. Hinckley",
        "Fools have a habit of believing that everything written by \n"
        + "a famous author is admirable. For my part I read \n"
        + "only to please myself and like only what suits my taste. – Voltaire",
        "How many a man has dated a new era in his life from the \n"
        + "reading of a book. – Henry David Thoreau",
        "Reading is a basic tool in the living of a good life. – Mortimer J. Adler",
        "A children’s story that can only be enjoyed by children \n"
        + "is not a good children’s story in the slightest. – C.S. Lewis",
        "It is a great thing to start life with a small number \n"
        + "of really good books which are your very own. – Arthur Conan Doyle",
        "Finally, from so little sleeping and so much reading, \n"
        + "his brain dried up and he went completely out of his mind. – Miguel de Cervantes Saavedra",
        "What better occupation, really, than to spend the \n"
        + "evening at the fireside with a book, with the \n"
        + "wind beating on the windows and the lamp burning bright. – Gustave Flaubert",
        "I’m old-fashioned and think that reading books is \n"
        + "the most glorious pastime that humankind has yet devised. – Wisława Szymborska",
        "Never put off till tomorrow the book you can read today. – Holbrook Jackson",
        "What kind of life can you have in a house without books? – Sherman Alexie",
        "Of course anyone who truly loves books buys more \n"
        + "of them than he or she can hope to read in \n"
        + "one fleeting lifetime. A good book, resting \n"
        + "unopened in its slot on a shelf, full of \n"
        + "majestic potentiality, is the most comforting \n"
        + "sort of intellectual wallpaper. – David Quammen",
        "Reading should not be presented to children as a chore \n"
        + "or a duty. It should be offered as a gift. — Kate DiCamillo"
    };

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        //Change the cursor to hand when mouse is over the label
        lblForgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblCreateAnAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        //Centralise the Login Window
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_logo = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblForgotPassword = new javax.swing.JLabel();
        lblCreateAnAccount = new javax.swing.JLabel();
        lblNewUser = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/laidelibrary/images/laide_library_logo.png"))); // NOI18N

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(56, 72, 96));
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(56, 72, 96));
        lblPassword.setText("Password:");

        txtUsername.setToolTipText("Enter your username");

        txtPassword.setToolTipText("Enter your password");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(56, 72, 96));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblForgotPassword.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblForgotPassword.setForeground(new java.awt.Color(28, 140, 188));
        lblForgotPassword.setText("<HTML><U>Forgot Password?</HTML></U>");
        lblForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotPasswordMouseClicked(evt);
            }
        });

        lblCreateAnAccount.setForeground(new java.awt.Color(28, 140, 188));
        lblCreateAnAccount.setText("<HTML><U>Create an Account</HTML></U>.");
        lblCreateAnAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreateAnAccountMouseClicked(evt);
            }
        });

        lblNewUser.setForeground(new java.awt.Color(56, 72, 96));
        lblNewUser.setText("New User?");

        lblTitle.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(56, 72, 96));
        lblTitle.setText("Login");

        btnExit.setBackground(new java.awt.Color(64, 120, 102));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblNewUser)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCreateAnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUsername)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPassword)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblTitle)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateAnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewUser))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        //Confirm that the username and password fields are not left blank
        if (txtUsername.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter your Username!",
                    "Username Field is Blank!", JOptionPane.WARNING_MESSAGE);
        } else if (txtPassword.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter your Password!",
                    "Password Field is Blank!", JOptionPane.WARNING_MESSAGE);
        } else {
            // Run the query to confirm existence of the user
            SQLQueries queryObject = new SQLQueries();
            String status = queryObject.validateUser(txtUsername.getText(),
                    txtPassword.getText());

            // If the user exists, run another query to check the user's role
            // and open the required dashboard
            if (status.equals("valid")) {
                String role = queryObject.validateUserRole();
                JOptionPane.showMessageDialog(this,
                        "Login Successful!", "Success!",
                        JOptionPane.INFORMATION_MESSAGE);
                if (role.equals("user")) {
                    this.dispose();
                    UserDashboard userDashboardObject
                            = new UserDashboard(txtUsername.getText());
                    userDashboardObject
                            .setTitle(txtUsername.getText()
                                    + " - User");
                    userDashboardObject.setVisible(true);
                    JOptionPane.showMessageDialog(this,
                            quotes[randomNumber], "Reading Quote of the Day",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (role.equals("librarian")) {
                    LibrarianDashboard librarianDashboardObject
                            = new LibrarianDashboard(txtUsername.getText());
                    librarianDashboardObject
                            .setTitle(txtUsername.getText()
                                    + " - Librarian");
                    librarianDashboardObject.setVisible(true);
                    this.dispose();
                } else if (role.equals("administrator")) {
                    AdministratorDashboard administratorDashboardObject
                            = new AdministratorDashboard(txtUsername.getText());
                    administratorDashboardObject
                            .setTitle(txtUsername.getText()
                                    + " - Administrator");
                    administratorDashboardObject.setVisible(true);
                    this.dispose();
                } else if (role.equals("invalid")) {
                    JOptionPane.showMessageDialog(this,
                            "Invalid User!Exiting...",
                            "Invalid User!",
                            JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            } else {
                JOptionPane.showMessageDialog(this,
                        "Invalid Username and/or Password!",
                        "Invalid Username and/or Password!",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblCreateAnAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAnAccountMouseClicked
        // Display the User Registration Form
        UserRegistration urObject = new UserRegistration();
        urObject.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCreateAnAccountMouseClicked

    private void lblForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPasswordMouseClicked
        // Display the Forgot Password Form
        ForgotPassword fpObject = new ForgotPassword();
        fpObject.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblForgotPasswordMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Confirm if the user really wants to exit
        int exit = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to exit?",
                "Are you sure you want to exit?",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (exit) {
            // If the user chooses yes
            case 0:
                // Close the application
                System.exit(0);
                break;
            // If the user chooses no
            case 1:
                // Do nothing
                break;
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Confirm if the user really wants to exit
        int exit = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to exit?",
                "Are you sure you want to exit?",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(exit == JOptionPane.YES_OPTION){
            this.dispose();
        } else{
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblCreateAnAccount;
    private javax.swing.JLabel lblForgotPassword;
    private javax.swing.JLabel lblNewUser;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
