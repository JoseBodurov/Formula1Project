INSERT INTO roles (id, user_roles)
VALUES (1, 'ADMIN');
INSERT INTO roles (id, user_roles)
VALUES (2, 'MODERATOR');
INSERT INTO roles (id, user_roles)
VALUES (3, 'USER');

--test users:
INSERT INTO users (id,username,password,full_name,email)
VALUES (1, 'admin123','26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b','Admin Adminov', 'admin@admin.com');

INSERT INTO users (id,username,password,full_name,email)
VALUES (2, 'newUser123','26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b','User Userov', 'user22@abv.com');

INSERT INTO users (id,username,password,full_name,email)
VALUES (3, 'ivanFen1','26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b','Ivan Petrov', 'ivan123@abv.com');

INSERT INTO users (id,username,password,full_name,email)
VALUES (4, 'goshko777','26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b','Georgi Dimitrov', 'georgi7@google.com');

-- user roles
-- admin
INSERT INTO users_role (`user_id`, `role_id`)
VALUES (1, 1);
INSERT INTO users_role (`user_id`, `role_id`)
VALUES (1, 2);
INSERT INTO users_role (`user_id`, `role_id`)
VALUES (1, 3);
-- moderator
INSERT INTO users_role (`user_id`, `role_id`)
VALUES (2, 2);
INSERT INTO users_role (`user_id`, `role_id`)
VALUES (2, 3);
-- user
INSERT INTO users_role (`user_id`, `role_id`)
VALUES (3, 3);
-- user 2
INSERT INTO users_role (`user_id`, `role_id`)
VALUES (4, 3);
INSERT INTO users_role (`user_id`, `role_id`)
VALUES (4, 2);
INSERT INTO users_role (`user_id`, `role_id`)
VALUES (4, 1);