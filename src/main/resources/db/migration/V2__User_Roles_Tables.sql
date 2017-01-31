CREATE TABLE app_user (
  id SERIAL PRIMARY KEY,
  username TEXT NOT NULL,
  password TEXT NOT NULL,
  email TEXT NOT NULL,
  first_name TEXT NOT NULL,
  last_name TEXT NOT NULL,
  gender TEXT NOT NULL,
  photo_url TEXT DEFAULT '',
  profile jsonb DEFAULT '{}'::JSON,
  event_name TEXT NOT NULL ,
  active BOOL DEFAULT TRUE
);

--------------------------

CREATE TABLE user_role (
  app_user_id INTEGER NOT NULL REFERENCES app_user (id),
  role TEXT NOT NULL
);

--------------------------

CREATE TABLE user_like (
  id SERIAL PRIMARY KEY,
  app_user_id INTEGER NOT NULL REFERENCES app_user (id),
  liked_user_id INTEGER NOT NULL REFERENCES app_user (id),
  unliked BOOL DEFAULT FALSE
);

--------------------------

-- CREATE TABLE user_profile (
--   id SERIAL PRIMARY KEY,
--   app_user_id INTEGER NOT NULL REFERENCES app_user (id),
--   key TEXT NOT NULL,
--   value TEXT NOT NULL
-- );
