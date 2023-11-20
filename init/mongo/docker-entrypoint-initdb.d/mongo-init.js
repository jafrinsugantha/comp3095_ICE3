print('START')


db=db.getSiblingDB('product-service');
db.createUser(
    {
        user:'rootadmin',
        password:'password',
        roles:[{role:'readWrite', db:'product-service'}]
    }
)

// collection is simply a database in NoSQL vocabulary
db.createColletion('user');


print('END')