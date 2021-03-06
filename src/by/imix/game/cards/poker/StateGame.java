package by.imix.game.cards.poker;

/**
 * Created by Mikhail_Kachanouski on 6/7/2016.
 *
 * Class for set state of game.
 */
public enum StateGame {
    WAIT, // ожидание новой игры.
    PRE_FLOP, // Pre-flop — первый этап торговли, на котором каждому игроку сдается по две карманные карты.
    FLOP, // Flop — второй этап торговли: на столе (борде) открываются три карты, общие для всех игроков.
    TURN,// Turn — третий этап торговли, на котором открывается еще одна общая карта.
    RIVER,// River — четвертый этап торговли, на котором открывается последняя, пятая, общая карта.
    SHOWDOWN// Showdown - последняя стадия игры: происходит вскрытие карт участвующих игроков и определяется победитель.
//    public abstract Direction opposite();
}
