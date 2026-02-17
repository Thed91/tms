-- Drop defaults that depend on enum types
ALTER TABLE users    ALTER COLUMN role           DROP DEFAULT;
ALTER TABLE projects ALTER COLUMN project_status DROP DEFAULT;
ALTER TABLE tasks    ALTER COLUMN task_status    DROP DEFAULT;
ALTER TABLE tasks    ALTER COLUMN priority       DROP DEFAULT;

-- Convert columns from enum types to VARCHAR
ALTER TABLE users    ALTER COLUMN role           TYPE VARCHAR(50) USING role::text;
ALTER TABLE projects ALTER COLUMN project_status TYPE VARCHAR(50) USING project_status::text;
ALTER TABLE tasks    ALTER COLUMN task_status    TYPE VARCHAR(50) USING task_status::text;
ALTER TABLE tasks    ALTER COLUMN priority       TYPE VARCHAR(50) USING priority::text;

-- Now safe to drop enum types
DROP TYPE IF EXISTS user_role;
DROP TYPE IF EXISTS project_status;
DROP TYPE IF EXISTS task_status;
DROP TYPE IF EXISTS task_priority;
