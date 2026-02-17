DO $$
BEGIN
    -- Fix projects table: rename projectstatus -> project_status (if old column exists)
    IF EXISTS (
        SELECT 1 FROM information_schema.columns
        WHERE table_schema = 'public'
          AND table_name   = 'projects'
          AND column_name  = 'projectstatus'
    ) THEN
        ALTER TABLE projects RENAME COLUMN projectstatus TO project_status;
    END IF;

    -- Fix tasks table: rename projectstatus -> task_status (if old column exists)
    IF EXISTS (
        SELECT 1 FROM information_schema.columns
        WHERE table_schema = 'public'
          AND table_name   = 'tasks'
          AND column_name  = 'projectstatus'
    ) THEN
        ALTER TABLE tasks RENAME COLUMN projectstatus TO task_status;
    END IF;
END $$;
