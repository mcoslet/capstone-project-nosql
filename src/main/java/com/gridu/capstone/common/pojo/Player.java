package com.gridu.capstone.common.pojo;

import java.util.Date;

public class Player {
    private String name;
    private short age;
    private String nationality;
    private short overall;
    private short potential;
    private String club;
    private String value;
    private String wage;
    private short special;
    private String preferredFoot;
    private short internationalReputation;
    private short weakFoot;
    private short skillMoves;
    private String workRate;
    private String bodyType;
    private String position;
    private byte jerseyNumber;
    private Date joined;
    private String loanedFrom;
    private Date contractValidUntil;
    private String height;
    private String weight;
    private String LS;
    private String ST;
    private String RS;
    private String LW;
    private String LF;
    private String CF;
    private String RF;

    private String RW;
    private String LAM;
    private String CAM;
    private String RAM;
    private String LM;
    private String LCM;
    private String CM;
    private String RCM;
    private String RM;
    private String LWB;
    private String LDM;
    private String CDM;
    private String RDM;
    private String RWB;
    private String LB;
    private String LCB;
    private String CB;
    private String RCB;
    private String RB;
    private short crossing;
    private short finishing;
    private short headingAccuracy;
    private short shortPassing;
    private short volleys;
    private short dribbling;
    private short curve;
    private short fkaccuracy;
    private short longPassing;
    private short ballControl;
    private short acceleration;
    private short sprintSpeed;
    private short agility;
    private short reactions;
    private short balance;
    private short shotPower;
    private short jumping;
    private short stamina;
    private short strength;
    private short longShots;
    private short aggression;
    private short interceptions;
    private short positioning;
    private short vision;
    private short penalties;
    private short composure;
    private short marking;
    private short standingTackle;
    private short slidingTackle;
    private short gkdiving;
    private short gkhandling;
    private short gkkicking;
    private short gkpositioning;
    private short gkreflexes;
    private String releaseClause;

    public Player(String name, short age, String nationality, short overall, short potential, String club, String value, String wage,
                  short special, String preferredFoot, short internationalReputation, short weakFoot,
                  short skillMoves, String workRate, String bodyType, String position, byte jerseyNumber,
                  Date joined, String loanedFrom, Date contractValidUntil, String height, String weight,
                  String LS, String ST, String RS, String LW, String LF, String CF, String RF, String RW, String LAM,
                  String CAM, String RAM, String LM, String LCM, String CM, String RCM, String RM, String LWB, String LDM,
                  String CDM, String RDM, String RWB, String LB, String LCB, String CB, String RCB, String RB,
                  short crossing, short finishing, short headingAccuracy, short shortPassing, short volleys, short dribbling,
                  short curve, short fkaccuracy, short longPassing, short ballControl, short acceleration, short sprintSpeed,
                  short agility, short reactions, short balance, short shotPower, short jumping, short stamina, short strength,
                  short longShots, short aggression, short interceptions, short positioning, short vision, short penalties, short composure,
                  short marking, short standingTackle, short slidingTackle, short gkdiving, short gkhandling, short gkkicking,
                  short gkpositioning, short gkreflexes, String releaseClause) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.overall = overall;
        this.potential = potential;
        this.club = club;
        this.value = value;
        this.wage = wage;
        this.special = special;
        this.preferredFoot = preferredFoot;
        this.internationalReputation = internationalReputation;
        this.weakFoot = weakFoot;
        this.skillMoves = skillMoves;
        this.workRate = workRate;
        this.bodyType = bodyType;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.joined = joined;
        this.loanedFrom = loanedFrom;
        this.contractValidUntil = contractValidUntil;
        this.height = height;
        this.weight = weight;
        this.LS = LS;
        this.ST = ST;
        this.RS = RS;
        this.LW = LW;
        this.LF = LF;
        this.CF = CF;
        this.RF = RF;
        this.RW = RW;
        this.LAM = LAM;
        this.CAM = CAM;
        this.RAM = RAM;
        this.LM = LM;
        this.LCM = LCM;
        this.CM = CM;
        this.RCM = RCM;
        this.RM = RM;
        this.LWB = LWB;
        this.LDM = LDM;
        this.CDM = CDM;
        this.RDM = RDM;
        this.RWB = RWB;
        this.LB = LB;
        this.LCB = LCB;
        this.CB = CB;
        this.RCB = RCB;
        this.RB = RB;
        this.crossing = crossing;
        this.finishing = finishing;
        this.headingAccuracy = headingAccuracy;
        this.shortPassing = shortPassing;
        this.volleys = volleys;
        this.dribbling = dribbling;
        this.curve = curve;
        this.fkaccuracy = fkaccuracy;
        this.longPassing = longPassing;
        this.ballControl = ballControl;
        this.acceleration = acceleration;
        this.sprintSpeed = sprintSpeed;
        this.agility = agility;
        this.reactions = reactions;
        this.balance = balance;
        this.shotPower = shotPower;
        this.jumping = jumping;
        this.stamina = stamina;
        this.strength = strength;
        this.longShots = longShots;
        this.aggression = aggression;
        this.interceptions = interceptions;
        this.positioning = positioning;
        this.vision = vision;
        this.penalties = penalties;
        this.composure = composure;
        this.marking = marking;
        this.standingTackle = standingTackle;
        this.slidingTackle = slidingTackle;
        this.gkdiving = gkdiving;
        this.gkhandling = gkhandling;
        this.gkkicking = gkkicking;
        this.gkpositioning = gkpositioning;
        this.gkreflexes = gkreflexes;
        this.releaseClause = releaseClause;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public short getOverall() {
        return overall;
    }

    public void setOverall(short overall) {
        this.overall = overall;
    }

    public short getPotential() {
        return potential;
    }

    public void setPotential(short potential) {
        this.potential = potential;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public short getSpecial() {
        return special;
    }

    public void setSpecial(short special) {
        this.special = special;
    }

    public String getPreferredFoot() {
        return preferredFoot;
    }

    public void setPreferredFoot(String preferredFoot) {
        this.preferredFoot = preferredFoot;
    }

    public short getInternationalReputation() {
        return internationalReputation;
    }

    public void setInternationalReputation(short internationalReputation) {
        this.internationalReputation = internationalReputation;
    }

    public short getWeakFoot() {
        return weakFoot;
    }

    public void setWeakFoot(short weakFoot) {
        this.weakFoot = weakFoot;
    }

    public short getSkillMoves() {
        return skillMoves;
    }

    public void setSkillMoves(short skillMoves) {
        this.skillMoves = skillMoves;
    }

    public String getWorkRate() {
        return workRate;
    }

    public void setWorkRate(String workRate) {
        this.workRate = workRate;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public byte getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(byte jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public Date getJoined() {
        return joined;
    }

    public void setJoined(Date joined) {
        this.joined = joined;
    }

    public String getLoanedFrom() {
        return loanedFrom;
    }

    public void setLoanedFrom(String loanedFrom) {
        this.loanedFrom = loanedFrom;
    }

    public Date getContractValidUntil() {
        return contractValidUntil;
    }

    public void setContractValidUntil(Date contractValidUntil) {
        this.contractValidUntil = contractValidUntil;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getLS() {
        return LS;
    }

    public void setLS(String LS) {
        this.LS = LS;
    }

    public String getST() {
        return ST;
    }

    public void setST(String ST) {
        this.ST = ST;
    }

    public String getRS() {
        return RS;
    }

    public void setRS(String RS) {
        this.RS = RS;
    }

    public String getLW() {
        return LW;
    }

    public void setLW(String LW) {
        this.LW = LW;
    }

    public String getLF() {
        return LF;
    }

    public void setLF(String LF) {
        this.LF = LF;
    }

    public String getCF() {
        return CF;
    }

    public void setCF(String CF) {
        this.CF = CF;
    }

    public String getRF() {
        return RF;
    }

    public void setRF(String RF) {
        this.RF = RF;
    }

    public String getRW() {
        return RW;
    }

    public void setRW(String RW) {
        this.RW = RW;
    }

    public String getLAM() {
        return LAM;
    }

    public void setLAM(String LAM) {
        this.LAM = LAM;
    }

    public String getCAM() {
        return CAM;
    }

    public void setCAM(String CAM) {
        this.CAM = CAM;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getLM() {
        return LM;
    }

    public void setLM(String LM) {
        this.LM = LM;
    }

    public String getLCM() {
        return LCM;
    }

    public void setLCM(String LCM) {
        this.LCM = LCM;
    }

    public String getCM() {
        return CM;
    }

    public void setCM(String CM) {
        this.CM = CM;
    }

    public String getRCM() {
        return RCM;
    }

    public void setRCM(String RCM) {
        this.RCM = RCM;
    }

    public String getRM() {
        return RM;
    }

    public void setRM(String RM) {
        this.RM = RM;
    }

    public String getLWB() {
        return LWB;
    }

    public void setLWB(String LWB) {
        this.LWB = LWB;
    }

    public String getLDM() {
        return LDM;
    }

    public void setLDM(String LDM) {
        this.LDM = LDM;
    }

    public String getCDM() {
        return CDM;
    }

    public void setCDM(String CDM) {
        this.CDM = CDM;
    }

    public String getRDM() {
        return RDM;
    }

    public void setRDM(String RDM) {
        this.RDM = RDM;
    }

    public String getRWB() {
        return RWB;
    }

    public void setRWB(String RWB) {
        this.RWB = RWB;
    }

    public String getLB() {
        return LB;
    }

    public void setLB(String LB) {
        this.LB = LB;
    }

    public String getLCB() {
        return LCB;
    }

    public void setLCB(String LCB) {
        this.LCB = LCB;
    }

    public String getCB() {
        return CB;
    }

    public void setCB(String CB) {
        this.CB = CB;
    }

    public String getRCB() {
        return RCB;
    }

    public void setRCB(String RCB) {
        this.RCB = RCB;
    }

    public String getRB() {
        return RB;
    }

    public void setRB(String RB) {
        this.RB = RB;
    }

    public short getCrossing() {
        return crossing;
    }

    public void setCrossing(short crossing) {
        this.crossing = crossing;
    }

    public short getFinishing() {
        return finishing;
    }

    public void setFinishing(short finishing) {
        this.finishing = finishing;
    }

    public short getHeadingAccuracy() {
        return headingAccuracy;
    }

    public void setHeadingAccuracy(short headingAccuracy) {
        this.headingAccuracy = headingAccuracy;
    }

    public short getShortPassing() {
        return shortPassing;
    }

    public void setShortPassing(short shortPassing) {
        this.shortPassing = shortPassing;
    }

    public short getVolleys() {
        return volleys;
    }

    public void setVolleys(short volleys) {
        this.volleys = volleys;
    }

    public short getDribbling() {
        return dribbling;
    }

    public void setDribbling(short dribbling) {
        this.dribbling = dribbling;
    }

    public short getCurve() {
        return curve;
    }

    public void setCurve(short curve) {
        this.curve = curve;
    }

    public short getFkaccuracy() {
        return fkaccuracy;
    }

    public void setFkaccuracy(short fkaccuracy) {
        this.fkaccuracy = fkaccuracy;
    }

    public short getLongPassing() {
        return longPassing;
    }

    public void setLongPassing(short longPassing) {
        this.longPassing = longPassing;
    }

    public short getBallControl() {
        return ballControl;
    }

    public void setBallControl(short ballControl) {
        this.ballControl = ballControl;
    }

    public short getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(short acceleration) {
        this.acceleration = acceleration;
    }

    public short getSprintSpeed() {
        return sprintSpeed;
    }

    public void setSprintSpeed(short sprintSpeed) {
        this.sprintSpeed = sprintSpeed;
    }

    public short getAgility() {
        return agility;
    }

    public void setAgility(short agility) {
        this.agility = agility;
    }

    public short getReactions() {
        return reactions;
    }

    public void setReactions(short reactions) {
        this.reactions = reactions;
    }

    public short getBalance() {
        return balance;
    }

    public void setBalance(short balance) {
        this.balance = balance;
    }

    public short getShotPower() {
        return shotPower;
    }

    public void setShotPower(short shotPower) {
        this.shotPower = shotPower;
    }

    public short getJumping() {
        return jumping;
    }

    public void setJumping(short jumping) {
        this.jumping = jumping;
    }

    public short getStamina() {
        return stamina;
    }

    public void setStamina(short stamina) {
        this.stamina = stamina;
    }

    public short getStrength() {
        return strength;
    }

    public void setStrength(short strength) {
        this.strength = strength;
    }

    public short getLongShots() {
        return longShots;
    }

    public void setLongShots(short longShots) {
        this.longShots = longShots;
    }

    public short getAggression() {
        return aggression;
    }

    public void setAggression(short aggression) {
        this.aggression = aggression;
    }

    public short getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(short interceptions) {
        this.interceptions = interceptions;
    }

    public short getPositioning() {
        return positioning;
    }

    public void setPositioning(short positioning) {
        this.positioning = positioning;
    }

    public short getVision() {
        return vision;
    }

    public void setVision(short vision) {
        this.vision = vision;
    }

    public short getPenalties() {
        return penalties;
    }

    public void setPenalties(short penalties) {
        this.penalties = penalties;
    }

    public short getComposure() {
        return composure;
    }

    public void setComposure(short composure) {
        this.composure = composure;
    }

    public short getMarking() {
        return marking;
    }

    public void setMarking(short marking) {
        this.marking = marking;
    }

    public short getStandingTackle() {
        return standingTackle;
    }

    public void setStandingTackle(short standingTackle) {
        this.standingTackle = standingTackle;
    }

    public short getSlidingTackle() {
        return slidingTackle;
    }

    public void setSlidingTackle(short slidingTackle) {
        this.slidingTackle = slidingTackle;
    }

    public short getGkdiving() {
        return gkdiving;
    }

    public void setGkdiving(short gkdiving) {
        this.gkdiving = gkdiving;
    }

    public short getGkhandling() {
        return gkhandling;
    }

    public void setGkhandling(short gkhandling) {
        this.gkhandling = gkhandling;
    }

    public short getGkkicking() {
        return gkkicking;
    }

    public void setGkkicking(short gkkicking) {
        this.gkkicking = gkkicking;
    }

    public short getGkpositioning() {
        return gkpositioning;
    }

    public void setGkpositioning(short gkpositioning) {
        this.gkpositioning = gkpositioning;
    }

    public short getGkreflexes() {
        return gkreflexes;
    }

    public void setGkreflexes(short gkreflexes) {
        this.gkreflexes = gkreflexes;
    }

    public String getReleaseClause() {
        return releaseClause;
    }

    public void setReleaseClause(String releaseClause) {
        this.releaseClause = releaseClause;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", overall=" + overall +
                ", potential=" + potential +
                ", club='" + club + '\'' +
                ", value='" + value + '\'' +
                ", wage='" + wage + '\'' +
                ", special=" + special +
                ", preferredFoot='" + preferredFoot + '\'' +
                ", internationalReputation=" + internationalReputation +
                ", weakFoot=" + weakFoot +
                ", skillMoves=" + skillMoves +
                ", workRate='" + workRate + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", position='" + position + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                ", joined=" + joined +
                ", loanedFrom='" + loanedFrom + '\'' +
                ", contractValidUntil=" + contractValidUntil +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", LS='" + LS + '\'' +
                ", ST='" + ST + '\'' +
                ", RS='" + RS + '\'' +
                ", LW='" + LW + '\'' +
                ", LF='" + LF + '\'' +
                ", CF='" + CF + '\'' +
                ", RF='" + RF + '\'' +
                ", RW='" + RW + '\'' +
                ", LAM='" + LAM + '\'' +
                ", CAM='" + CAM + '\'' +
                ", RAM='" + RAM + '\'' +
                ", LM='" + LM + '\'' +
                ", LCM='" + LCM + '\'' +
                ", CM='" + CM + '\'' +
                ", RCM='" + RCM + '\'' +
                ", RM='" + RM + '\'' +
                ", LWB='" + LWB + '\'' +
                ", LDM='" + LDM + '\'' +
                ", CDM='" + CDM + '\'' +
                ", RDM='" + RDM + '\'' +
                ", RWB='" + RWB + '\'' +
                ", LB='" + LB + '\'' +
                ", LCB='" + LCB + '\'' +
                ", CB='" + CB + '\'' +
                ", RCB='" + RCB + '\'' +
                ", RB='" + RB + '\'' +
                ", crossing=" + crossing +
                ", finishing=" + finishing +
                ", headingAccuracy=" + headingAccuracy +
                ", shortPassing=" + shortPassing +
                ", volleys=" + volleys +
                ", dribbling=" + dribbling +
                ", curve=" + curve +
                ", fkaccuracy=" + fkaccuracy +
                ", longPassing=" + longPassing +
                ", ballControl=" + ballControl +
                ", acceleration=" + acceleration +
                ", sprintSpeed=" + sprintSpeed +
                ", agility=" + agility +
                ", reactions=" + reactions +
                ", balance=" + balance +
                ", shotPower=" + shotPower +
                ", jumping=" + jumping +
                ", stamina=" + stamina +
                ", strength=" + strength +
                ", longShots=" + longShots +
                ", aggression=" + aggression +
                ", interceptions=" + interceptions +
                ", positioning=" + positioning +
                ", vision=" + vision +
                ", penalties=" + penalties +
                ", composure=" + composure +
                ", marking=" + marking +
                ", standingTackle=" + standingTackle +
                ", slidingTackle=" + slidingTackle +
                ", gkdiving=" + gkdiving +
                ", gkhandling=" + gkhandling +
                ", gkkicking=" + gkkicking +
                ", gkpositioning=" + gkpositioning +
                ", gkreflexes=" + gkreflexes +
                ", releaseClause='" + releaseClause + '\'' +
                '}';
    }
}
