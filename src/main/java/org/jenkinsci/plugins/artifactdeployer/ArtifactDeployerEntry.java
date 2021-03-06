package org.jenkinsci.plugins.artifactdeployer;

import java.io.Serializable;

/**
 * @author Gregory Boissinot
 */
public class ArtifactDeployerEntry implements Serializable {

    @Deprecated
    @SuppressWarnings("unused")
    private transient String id;

    private String includes;

    private String excludes;

    private String remote;

    private boolean flatten;

    @SuppressWarnings("unused")
    private transient boolean deletingRemote;

    private boolean deleteRemote;

    private boolean deleteRemoteArtifacts;

    private boolean deleteRemoteArtifactsByScript;

    private String groovyExpression;

    @SuppressWarnings("unused")
    public String getIncludes() {
        return includes;
    }

    @SuppressWarnings("unused")
    public String getExcludes() {
        return excludes;
    }

    @SuppressWarnings("unused")
    public String getRemote() {
        return remote;
    }

    @SuppressWarnings("unused")
    public boolean isFlatten() {
        return flatten;
    }

    @SuppressWarnings("unused")
    @Deprecated
    public String getId() {
        return id;
    }

    @SuppressWarnings("unused")
    public boolean isDeleteRemote() {
        return deleteRemote;
    }

    @SuppressWarnings("unused")
    public boolean isDeleteRemoteArtifacts() {
        return deleteRemoteArtifacts;
    }

    @SuppressWarnings("unused")
    public boolean isDeleteRemoteArtifactsByScript() {
        return deleteRemoteArtifactsByScript;
    }

    @SuppressWarnings("unused")
    public String getGroovyExpression() {
        return groovyExpression;
    }

    public void setIncludes(String includes) {
        this.includes = includes;
    }

    public void setExcludes(String excludes) {
        this.excludes = excludes;
    }

    public void setRemote(String remote) {
        this.remote = remote;
    }

    public void setFlatten(boolean flatten) {
        this.flatten = flatten;
    }

    public void setDeleteRemote(boolean deleteRemote) {
        this.deleteRemote = deleteRemote;
    }

    public void setDeleteRemoteArtifacts(boolean deleteRemoteArtifacts) {
        this.deleteRemoteArtifacts = deleteRemoteArtifacts;
    }

    public void setDeleteRemoteArtifactsByScript(boolean deleteRemoteArtifactsByScript) {
        this.deleteRemoteArtifactsByScript = deleteRemoteArtifactsByScript;
    }

    public void setGroovyExpression(String groovyExpression) {
        this.groovyExpression = groovyExpression;
    }

    @SuppressWarnings("unused")
    public Object readObject() {
        if (this.deletingRemote) {
            this.deleteRemote = true;
        }
        return this;
    }

    public int getUniqueId() {
        int result = includes != null ? includes.hashCode() : 0;
        result = 31 * result + (excludes != null ? excludes.hashCode() : 0);
        result = 31 * result + (remote != null ? remote.hashCode() : 0);
        result = 31 * result + (flatten ? 1 : 0);
        result = 31 * result + (deletingRemote ? 1 : 0);
        result = 31 * result + (deleteRemote ? 1 : 0);
        result = 31 * result + (deleteRemoteArtifacts ? 1 : 0);
        result = 31 * result + (deleteRemoteArtifactsByScript ? 1 : 0);
        result = 31 * result + (groovyExpression != null ? groovyExpression.hashCode() : 0);
        return result;
    }
}
