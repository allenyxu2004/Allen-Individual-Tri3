{% include navigation.html %}

# Night At the Museum Individual Final

### Self Grade Assesment: 2.4/2.5

## Tech Documentation

**Login Technical Documentation**
- Used information from [Person DB](https://github.com/zenxha/musicgacha/tree/main/src/main/java/com/musicgacha/controllers/database/person) to act as information to be used in login
  - Added username and password section to input  
- Created [login system](https://github.com/zenxha/musicgacha/tree/main/src/main/java/com/musicgacha/controllers/security) with spring security to allow for profiles and saving of information
  - Login system activates before entering play page to ensure that the information can be stored upon the user's request

**Database Technical Documentation**
- Import [base JPA, API, View, etc files](https://github.com/zenxha/musicgacha/tree/main/src/main/java/com/musicgacha/controllers/database/person) from Tech Talk guide on the csacoders wiki page
- Modify database [to store login information instead](https://github.com/zenxha/musicgacha/tree/main/src/main/java/com/musicgacha/controllers/database)
  - Allows us to fully implement a login system, which was planned out in the [Masterplan flowchart](https://docs.google.com/drawings/d/1J8H0ygz2QkCI40XRQpPd7W-9kpfUwOEN2dKYtuCUNqI/edit?usp=sharing)
- Convert to an [inventory profile system](https://github.com/zenxha/musicgacha/tree/main/src/main/java/com/musicgacha/controllers/database/note), each user has their own personal database
  - Notes markdown section acts as a bio for the user to update, can write whatever they want such as wishlists, updates to their life, etc
  - Functions as an additional type of database that stores user's typed information

**Profile Page Technical Documentation**
- Imported over [notes tech demo](https://github.com/zenxha/musicgacha/tree/main/src/main/java/com/musicgacha/controllers/database/note) from Mort, modify into profile page with notes as a bio
- Create [unique ID](https://github.com/zenxha/musicgacha/blob/6a1ef76752ce09fdc7434989592676fa50d11ee0/src/main/resources/static/json/characters/common.json#L30) for characters to use in storing character information in profile page
  - EAch JSON object has an ID attached to them which was created in a sequencial pattern
  - Using the ID we can store less information, and only call the whole object upon user request to increase effiency 
- Create system to store the collected characters into their profile/inventory/bio page
  - Inventory system was unable to be fully developed by the end of senior checkout
  - [HTML was completed by Sam](https://github.com/zenxha/musicgacha/blob/main/src/main/resources/templates/homesite/inventory.html), but backend was not fully fleshed out
